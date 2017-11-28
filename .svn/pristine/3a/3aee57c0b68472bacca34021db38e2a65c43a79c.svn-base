 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>

    <!-- MetisMenu CSS -->
    <link href="../resources/css/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../resources/css/bootstrap.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../resources/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <style>
p { 
   
    color:red
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>GET PASSWORD</title>

</head>
<body>


        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Password Request</h3>
                    </div>
                    <div class="panel-body">
 

 <s:form commandName="customerData" action ="${pageContext.request.contextPath}/customer/register" method ="post">



   
        <div class="input-group">
            <input class="form-control" name="email"
                type="text"  placeholder="Example"
               id="txtEmail"  required/><div class="input-group-addon"><font size="4" style="color:#0000FF">@smile.com.bd</font></div>
  
    
    
   </div>
 <div style="margin-top:5px"></div>

<div>
  <input class="btn btn-success  btn-block" type="submit" id="btnValidate" value="Get Password"/>

</div>
</s:form>
<div>
<p>${message}</p> <a href="${pageContext.request.contextPath}/customer/login ">Go back to LogIn page</a>
</div>
</div>
</div>
</div>

</div>







</body>
</html>