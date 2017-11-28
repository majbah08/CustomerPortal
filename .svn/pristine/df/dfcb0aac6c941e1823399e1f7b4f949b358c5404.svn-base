package com.maestro.smilebdcp.controllers;



import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.InputStreamReader;

import java.text.SimpleDateFormat;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maestro.smilebdcp.beans.DBBL_RESULT_CODE;
import com.maestro.smilebdcp.beans.DBBL_TRANS_LOG;
import com.maestro.smilebdcp.beans.PHONES;
import com.maestro.smilebdcp.services.CustomerService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/result")
public class HomeController {
	
	@Autowired
	
	private CustomerService customerService;
	
	private CustomerController customerController;
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
	
		
		
		return "home";
	}
	
	/*
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	
	public String sucess( Model model, HttpServletRequest request, HttpServletResponse response ,HttpSession session) {
	
		
		return "success";
	}
	*/
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String saveSucessParam( ModelMap model, HttpServletRequest request, HttpServletResponse response ,HttpSession session) {
		
		/**********************************************************************************/
		// String res = request.getParameter("trnx_result");
		 String res =
				"RESULT: PENDING\nRESULT_CODE: 096\nRRN: 731819497547\nCARD_NUMBER: 012000******1449\nAMOUNT: 160000\nCARDNAME: asdas\nTRANS_DATE: 1510711069896\nDESCRIPTION: 1222000169";
				         String vv[] = res.split("\n");
				         Hashtable hash = new Hashtable();
				         for(int i=0;i<vv.length;i++){
				             String dd[] = vv[i].split(":");
				             System.out.println(""+i+" > "+dd[0] + " = "+dd[1]);
				             hash.put(dd[0] ,dd[1]);
				         }
                         String RESULT =(String)hash.get("RESULT");
				         String RESULT_CODE = (String)hash.get("RESULT_CODE");
				         String RRN = (String)hash.get("RRN");
				         String CARD_NUMBER = (String)hash.get("CARD_NUMBER");
				         String AMOUNT = (String)hash.get("AMOUNT");
				         String CARDNAME = (String)hash.get("CARDNAME");
				         String TRANS_DATE = (String)hash.get("TRANS_DATE");
				         String DESCRIPTION = (String)hash.get("DESCRIPTION");
				         
				         
				        
		 
		 
		 
		 
		 
		 
		 
		
	
		/*
		String result =request.getParameter("RESULT");
		String result_code =request.getParameter("RESULT_CODE");
		String dsecure = request.getParameter("3DSECURE");
		String rrn =request.getParameter("RRN");
		String approval_code =request.getParameter("APPROVAL_CODE");
		String card_number=request.getParameter("CARD_NUMBER");
		String amount=request.getParameter("AMOUNT");
		String description=request.getParameter("DESCRIPTION");
		String trans_date=request.getParameter("TRANS_DATE");
		String  card_name=request.getParameter("CARDNAME");
		*/
		SimpleDateFormat rrrrmmdd = new SimpleDateFormat("yyyyMMdd");
		String dd = rrrrmmdd.format(new java.util.Date());
		BufferedWriter tranxlog = null;
		String fileloc="D:\\DBBLlog";
	 //	/usr/dbblgw/log
		try{
			 
		
		
			tranxlog = new BufferedWriter(new FileWriter(fileloc+"/succ_"+dd+".log", true));
			tranxlog.write("\n---------------------------\n");
			tranxlog.write(new java.util.Date()+"\n");
			String remIP = request.getRemoteAddr();
			tranxlog.write("IP: "+remIP+"\n");
			tranxlog.write("RESULT: "+RESULT+"\n" );
			tranxlog.write("RESULT_CODE: "+RESULT_CODE+"\n" );
			//tranxlog.write("3DSECURE:"+dsecure +"\n" );
			tranxlog.write("RRN: "+RRN+"\n" );
			//tranxlog.write("APPROVAl_CODE:"+approval_code +"\n" );
			tranxlog.write("CARD_NUMBER: "+CARD_NUMBER+"\n");
			tranxlog.write("AMOUNT: "+AMOUNT+"\n" );
			tranxlog.write("CARDNAME: "+CARDNAME+"\n");
			tranxlog.write("TRANS_DATE: "+TRANS_DATE+"\n");
			tranxlog.write("DESCRIPTION: "+DESCRIPTION+"\n" );
			tranxlog.close();
			
		}catch(Exception err){
			err.printStackTrace();
			System.out.println("success.jsp : ERR: "+err.getMessage());
			//tranxlog.write("success.jsp : ERR: "+err.getMessage()+ "\n" );
		}
		
		DBBL_TRANS_LOG dbblLog= new DBBL_TRANS_LOG();
		
		dbblLog.setRESULT(RESULT);
		dbblLog.setRESULT_CODE(RESULT_CODE);
		//dbblLog.setDSECURE(dsecure);
		dbblLog.setPRN(RRN);
		//dbblLog.setAPPROVAL_CODE(approval_code);
		dbblLog.setCARD_NUMBER(CARD_NUMBER);
		dbblLog.setAMOUNT(AMOUNT);
		dbblLog.setCARD_NAME(CARDNAME);
		dbblLog.setTRANS_DATE(TRANS_DATE);
		dbblLog.setTRANS_DESC(DESCRIPTION);
		
		
		
		customerService.saveSucessParam(dbblLog);
		
		
	     

	        model.put("message1", res);
	       // request.setAttribute("messagess", resultArray); // This will be available as ${message}
	      //  request.getRequestDispatcher("/result.jsp").forward(request, response);
	        // processRequest(request, response);
		
		
		
		
		DBBL_RESULT_CODE	rsltcd=customerService.findByDbblResultCode("000");
		
		String rsCD=rsltcd.getRESULT_DESC();
		
		
		model.put("message",rsCD);
		
		
		
		
		
		
		
		
	
		
		
		return "success";
	}
	
	

	
	
	
	
	
@RequestMapping(value = "/failed", method = RequestMethod.GET)
	
	public String failed( Model model) {
	
		
		
		return "failed";
	}
	
}
