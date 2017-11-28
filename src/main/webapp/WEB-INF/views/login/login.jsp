 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
 <style>
strong { 
    font-weight: bold;
    color:red
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
  

    <!-- MetisMenu CSS -->
    <link href="../resources/css/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../resources/css/bootstrap.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../resources/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    

</head>
 




<body>
<div class="centered">
 


<div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
 <fieldset>                    
<s:form commandName="customerData" action ="${pageContext.request.contextPath}/customer/login" method ="post">



  <div class="form-group">
 <s:input class="form-control" placeholder="User Name" path="SMILEBD_EMAIL"/>
 <s:errors path="SMILEBD_EMAIL" cssStyle="color:red;"/>
</div>


<div class="form-group">
<s:password class="form-control" placeholder="Password" path="SUPER_PASS"/>
<s:errors path="SUPER_PASS" cssStyle="color:red;"/>
</div>

<tr>
<td><input type="submit" class="btn btn-lg btn-success btn-block" value="Login"/></td>
<td><a href="${pageContext.request.contextPath}/customer/register "><b>Don't Have Password? get one!</b></a></td>
</tr>

</s:form>

</fieldset>

   <strong>${failed}</strong>                 
   </div>
                </div>
            </div>
        </div>
    </div>



</div>





</body>
</html>