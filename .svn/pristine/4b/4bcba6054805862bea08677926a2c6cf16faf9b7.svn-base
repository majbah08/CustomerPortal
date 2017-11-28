<html><body>
<%@ page import = "java.util.*" %>
<%@ page import = "java.io.*" %>
<%@page import="java.text.SimpleDateFormat"%>
<b>Parameters:</b><br>
<%
	SimpleDateFormat rrrrmmdd = new SimpleDateFormat("yyyyMMdd");
	String dd = rrrrmmdd.format(new java.util.Date());
	BufferedWriter tranxlog = null;
	String fileloc="D:\\DBBLlog";
	
	 //	/usr/dbblgw/log
	
	try{
		tranxlog = new BufferedWriter(new FileWriter(fileloc+"/log/succ_"+dd+".log", true));
		tranxlog.write("\n---------------------------\n");
		tranxlog.write(new java.util.Date()+"\n");
		String remIP = request.getRemoteAddr();
		tranxlog.write("IP: "+remIP+"\n");
	
  Enumeration parameterList = request.getParameterNames();
  while( parameterList.hasMoreElements() )
  {
    String sName = parameterList.nextElement().toString();
    //if(sName.toLowerCase.startsWith("question"))
	{
      String[] sMultiple = request.getParameterValues( sName );
      if( 1 >= sMultiple.length ){
        // parameter has a single value. print it.
        out.println( sName + " = " + request.getParameter( sName ) + "<br>" );
        tranxlog.write( sName + " = " + request.getParameter( sName ) + "\n" );
	}
      else
        for( int i=0; i<sMultiple.length; i++ ){
          // if a paramater contains multiple values, print all of them
          out.println( sName + "[" + i + "] = " + sMultiple[i] + "<br>" );
	  tranxlog.write(sName + "[" + i + "] = " + sMultiple[i] + "\n" );
	}
    }
  }

	}
	catch(Exception err){
		err.printStackTrace();
		System.out.println("success.jsp : ERR: "+err.getMessage());
		tranxlog.write("success.jsp : ERR: "+err.getMessage()+ "\n" );
	}
	finally{
		try{ tranxlog.close(); } catch(Exception er){}
	}
%>
</body></html>
