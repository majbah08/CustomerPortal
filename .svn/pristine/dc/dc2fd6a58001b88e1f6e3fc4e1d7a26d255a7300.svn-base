package com.maestro.smilebdcp.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maestro.smilebdcp.beans.CONNECTION_CATAGORY;
import com.maestro.smilebdcp.beans.DBBL_TEMP_TRANS;
import com.maestro.smilebdcp.beans.PHONES;
import com.maestro.smilebdcp.beans.PAYMENT;
import com.maestro.smilebdcp.beans.SMS_OUTBOX;
import com.maestro.smilebdcp.services.CustomerService;
import com.maestro.smilebdcp.validation.CustomerValidation;

/**
*
* @author Majbah-Hashem
*/

@Controller
@RequestMapping(value="/customer")

public class CustomerController {
 
	@Autowired
	//private HttpSession httpsession;
	private CustomerService customerService;

	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showForm( ModelMap model) {
		//model.put("customerData", new PHONES());
		return "register";
	}
	/*
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveForm( ModelMap model, @ModelAttribute("customerData") @Valid PHONES customer, BindingResult br, HttpSession session) {
		CustomerValidation customerValidation = new CustomerValidation();
		customerValidation.validate(customerValidation, br);
		if (br.hasErrors()) {
			return "register/register";
		} else {
			customerService.saveCustomer(customer);
			session.setAttribute("customer", customer);
			return "redirect:success";
		}
		
	}
	
	*/
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLogin( ModelMap model,HttpSession session) {
		System.out.print("Test Controller1");
        
		if(session.getAttribute("customer")==null){
		model.put("customerData", new PHONES());
		return "login/login";
	}
	else {
		
		return "redirect:loginsuccess";
		
	}
	
}
	
	
	
	//login page
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String doLogin(ModelMap model,@ModelAttribute("customerData")PHONES customer,HttpSession session){
	
		if (customer.getSMILEBD_EMAIL()!=null&&customer.getSUPER_PASS()!=null&& session.getAttribute("customer")==null){
			customer=customerService.loginCustomer(customer);
			
			model.put("customer", customer);
			
			//System.out.print("Before_putting_session"+customer);
	        if(customer!=null){
	        	session.setAttribute("customer",customer);
	        	
	        	String verified_phone= customer.getIS_MOBILE_VERIFIED();
	        	System.out.println("Verified Phone1111"+verified_phone);
	        			if(verified_phone.equals("-1"))
	        			{
	        				System.out.println("IS mobile Verified Phone");
	        				customer.setIS_MOBILE_VERIFIED("1");
	        				
	        				customerService.changePassword(customer);
	        				
	        		
	        			}
	        	
	        	return "redirect:loginsuccess";
	        	}
	        else{
	        	
	        	model.put("failed", "Login Failed! Wrong Username or Password");
	        	return "login/login";
	        	
	        }
		}
	        else{
	        	
	        	return "redirect:loginsuccess";	
	        	
	        }
	}
    
	
	//Customer History Page 
	
	/*
	String verified_phone= customer.getIS_MOBILE_VERIFIED();
	System.out.println("Verified Phone"+verified_phone);
			if(verified_phone.equals("-1"))
			{
				customer.setIS_MOBILE_VERIFIED("1");
		
			}
	
	
	*/
	
	
	@RequestMapping(value="/customerhistory", method = RequestMethod.GET)
	@Transactional
	public String showCustomerHistory( ModelMap model,@ModelAttribute("customerData")PHONES customer, HttpSession session ) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy ");
		Date date = new Date();
		System.out.println("SimpleDate"+dateFormat.format(date));
	
		PHONES GG=(PHONES)session.getAttribute("customer");
		
		if(customer==null){
			//System.out.print("False Promise");
			//model.put("message", "Sorry! Invalid ID ");
			return "redirect:login";
			
		}

		
	
        String majbah=GG.getPHONENO();
        
		System.out.print("SessionObject"+majbah);
		List<PAYMENT> listCustomerHistory = customerService.showCustomerHistory(majbah );
		
	
		//System.out.print("ListPayment"+listCustomerHistory);
		//model.put("customerData", new SUBSCRIBER_PAYMENT());
        model.put("listCustomerHistory", listCustomerHistory);
        
        return "customerhistory";
	
	
}
	
	
	
	// Payment page 
	
	@RequestMapping(value="/paynow", method = RequestMethod.GET)
	public String showPaymentpage( ModelMap model,@ModelAttribute("customerData")PHONES customer,HttpSession session) {
		
		PHONES GG=(PHONES)session.getAttribute("customer");
		
		
        System.out.println("Problem"+GG);
        long  cat_id=GG.getCATAGORY_ID().longValue();
		String phoneno=GG.getPHONENO();
		CONNECTION_CATAGORY cat_list=customerService.PaymentDetails(cat_id);
       
		model.put("cat_list", cat_list);
		model.put("phoneno", phoneno);
		
		
		return "paynow";
		
	
	
}
	// post payments
	
	@RequestMapping(value="/paynow", method = RequestMethod.POST)
	public  String doPayment(ModelMap model,@ModelAttribute("customerData")PHONES customer, HttpServletRequest request, HttpServletResponse response ,HttpSession httpsession) throws IOException{
       
		


        String amount = (String) request.getParameter("Amount");
        System.out.print("Amount"+amount);
        Double txnamount = Double.parseDouble(amount);
        txnamount = txnamount * 100;
        int txnamountpaisa = txnamount.intValue(); 
        // **** Our all calculation is in paisa. So you need to convert the taka in to paisa ****//
        String desc = (String) request.getParameter("Desc");
        String cType = (String) request.getParameter("Ctype");
        String clientIp = request.getRemoteAddr();// It must be client REMOTE_ADDR 
        System.out.print("Client IP:"+clientIp);
        String transId = "";
        String trans_id_en = "";
        String transCheck = "";
       
		
   
    	Date date_now = new Date();
    	
        StringBuffer output = new StringBuffer();
        String certLoocation = "/usr/dbblgw/000599991220000/";
        System.out.print("Certificate Location:"+certLoocation);
        String command = "java -jar " + certLoocation + "ecomm_merchant.jar " + certLoocation + "merchant.properties -v " + txnamountpaisa + " 050 " + clientIp + " " + cType + desc;
        System.out.println("command:" + command);

        try {
            String s = null;
            // run the Unix "ps -ef" command
            // using the Runtime exec method:
            Process p = Runtime.getRuntime().exec(command);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // read the output from the command
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
                transId = s.substring(16, 44);
                System.out.print("TrasitionId:"+transId);
                transCheck = s.substring(0, 15);
                System.out.print("TrasitionCheck:"+transCheck);
            }
            
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
              
            }
            //Save to our  DataBase
            // Create a session object if it is already not  created.
            HttpSession session = request.getSession(true);
            session.setAttribute("transId", transId);
            trans_id_en = URLEncoder.encode(transId, "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("CR#Exception." + e.toString());
        }
        
        PHONES GG=(PHONES)httpsession.getAttribute("customer");
        //System.out.println("Problem"+GG);
       
		String phoneno=GG.getPHONENO();
		
		DBBL_TEMP_TRANS dbbltemp= new DBBL_TEMP_TRANS();
		
        dbbltemp.setTXN_DATE( date_now);
        dbbltemp.setCARD_TYPE(cType);
        dbbltemp.setTXN_DESC(desc);
        dbbltemp.setTXN_ID(transId);
        dbbltemp.setCUSTOMER_IP(clientIp);
        dbbltemp.setPHONENO(phoneno);
        
        customerService.saveTempTransDetails(dbbltemp);
        
        
        if (transCheck.equals("TRANSACTION_ID:")) {
            String location = "https://ecomtest.dutchbanglabank.com/ecomm2/ClientHandler?card_type=" + cType + "&trans_id=" + trans_id_en;
            //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("https://ecomtest.dutchbanglabank.com/ecomm2/ClientHandler?card_type=" + cType + "&trans_id=" + trans_id_en);
            //dispatcher.forward(request, response);
           // response.sendRedirect(location);
            return "redirect:"+location;
    	
        } else {

            // Show your customer system error message 
        	return "paynow";
        }
	        	
	      
	   	}
	
	
	
	
	
	
	

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logOut(ModelMap model,HttpSession session){
		session.removeAttribute("customer");
		
		return "redirect:login";
		
	}
	
	@RequestMapping(value="/loginsuccess", method = RequestMethod.GET)
	public String showSuccess(ModelMap model){
		
		model.put("success", new PHONES());
		
		return "loginsuccess";
		
		
		
	}
	@RequestMapping(value="/changepasswd", method = RequestMethod.GET)
		public String changepasswd (ModelMap model,@ModelAttribute("customerData")PHONES customer,HttpSession session) {
	
		PHONES GG=(PHONES)session.getAttribute("customer");
    
		
		return "changepasswd";
	}
	
	
	@RequestMapping(value="/changepasswd", method = RequestMethod.POST)
	public  String changepasswd(ModelMap model,@ModelAttribute("customerData")PHONES customer, HttpServletRequest request, HttpServletResponse response ,HttpSession session) throws IOException{

		String curpasswd = (String) request.getParameter("curpasswd");
		String newpasswd = (String) request.getParameter("newpasswd");
		String newpasswdconfirm = (String) request.getParameter("newpasswdconfirm");
		//System.out.println("Problem"+curpasswd + newpasswd +newpasswdconfirm );
		PHONES GG=(PHONES)session.getAttribute("customer");

	
		String currpass=GG.getSUPER_PASS();
		//System.out.println("CurrentPass"+currpass);
		if ( currpass.equals(curpasswd)) {
			
			//System.out.println("Else Ok");
			GG.setSUPER_PASS(newpasswd);
			customerService.changePassword(GG);
			model.put("message","Password Saved successfully.");
			
			
		}
		else{
			model.put("message"," Incorrect Current Password.");
			return "changepasswd";
		}
	
	return "changepasswd";
}
	
	
	// send password to user
	
/*	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String sendPassWithEmail( ModelMap model, @ModelAttribute("customerData") @Valid PHONES customer, BindingResult br, HttpSession session,HttpServletRequest request, HttpServletResponse response) {
		
		String email = (String) request.getParameter("email");
		PHONES GG=(PHONES)session.getAttribute("customer");
		
		String smileEmail=GG.getSMILEBD_EMAIL();
		String phoneNo=GG.getCONTACT_NO();
		System.out.println(" email " + smileEmail +" phone"+phoneNo);
		if(phoneNo!= ""){			
			SMS_OUTBOX smsOB= new SMS_OUTBOX();			
			smsOB.setMOBILE(phoneNo);
			smsOB.setMSG("dfsdfsdf");
			customerService.sendUserPass(smsOB);
			
			model.put("message", "Thanks for your Information, Passward will be sent to your mobile number ");
			//session.setAttribute("customer", customer);
			
		}
		return "register";
	}
	*/
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public  String sendSecret(ModelMap model,@ModelAttribute("customerData")PHONES customer, HttpServletRequest request, HttpServletResponse response ,HttpSession session) throws IOException{

		String email1 = (String) request.getParameter("email");
		String  domain ="@smile.com.bd";
		String email=email1+domain;
		/*/PHONES GG=(PHONES)session.getAttribute("customer");
		
		String smileEmail=GG.getSMILEBD_EMAIL();
		String phoneNo=GG.getCONTACT_NO();*/
		System.out.println(" email1 " +email);
		if(session.getAttribute("customer")==null){			
			customer=customerService.findByEmail(email);
			
			if(customer==null){
				System.out.print("False Promise");
				model.put("message", "Sorry! Invalid ID ");
				return "register";
				
			}
			model.put("customer", customer);
			String phoneNo=customer.getCONTACT_NO();
			String verifiedMB=customer.getIS_MOBILE_VERIFIED();
			
			 if(phoneNo!= "" && verifiedMB.equals("0")){
				Date date_now =new Date();
				Random rnd = new Random();
				int n = 100000 + rnd.nextInt(900000);
				
				System.out.println("sentPass"+n);
				SMS_OUTBOX smsOB= new SMS_OUTBOX();	
				
				
				smsOB.setMOBILE(phoneNo);
				smsOB.setMSG("Your portal.smile.com.bd password is :"+n);
			
				smsOB.setENTRY_DATE(date_now);
				customer.setSUPER_PASS(""+n);
				customer.setIS_MOBILE_VERIFIED("-1");
				customerService.changePassword(customer);
				customerService.sendUserPass(smsOB);
				//String s1="Thank you! for your Information, Password will be sent to your mobile number.";
				model.put("message", "An sms containing your password has been sent to your mobile.For further help please contact customer care.");
				//session.setAttribute("customer", customer);
				//session.setAttribute("message",s1);
				return "register";
			}
			 else{
				 
				 model.put("message", "You already requested for password once, please contact with customer service.");
				 
			 }
			
			
		}
		else{
			
			model.put("message", "This email is not valid please contact with your customer service.");
		
		
	
		return "register";
		}
		return "register";
	}
	
	
	
	
	
	
	
	
}
