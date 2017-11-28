<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@ page session="false" %>
<html>
<head>
	<title>Change Password</title>
	
	<style>


#header { color: #337ab7; }

tr {
    padding-top: .5em;
    padding-bottom: .5em;
}
#table { 
    border-spacing: 10px;
    border-collapse: separate;
    align: center
    }
#m1{
 color: red;
}
</style>

<script type="text/javascript" src="../resources/js/jquery.min.js"></script>
<script type="text/javascript">

    $(function () {
        $("#btnSubmit").click(function () {
            var password = $("#txtPassword").val();
            console.log("password"+password);
            var confirmPassword = $("#txtConfirmPassword").val();
            console.log("confpassword"+confirmPassword);
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            return true;
        });
    });
    /*
    $('#txtPassword, #txtConfirmPassword').on('keyup', function () {
    	  if ($('#txtPassword').val() == $('#txtConfirmPassword').val()) {
    	    $('#message').html('Matching').css('color', 'green');
    	  } else 
    	    $('#message').html('Not Matching').css('color', 'red');
    	});
    
    */
    
</script>



</head>
<body>
<%@include  file="blank.html" %>
  <div id="page-wrapper">
 <div class="row">
               <div class="col-lg-12">
                   <div class="panel panel-heading">
   <div>
   <h1 id="header">Change  Password </h1> 
   </div>
   <hr>



  <strong id="m1">${message}</strong> 




 <s:form commandName="customerData" action="${pageContext.request.contextPath}/customer/changepasswd"  method="post" >
                                                    <table  bordercolor="#F5F5F5" style="font: normal 8pt Verdana"  id="table"  align="center" >
                                                        <tr>
                                                            <td><font size="1"><b>Current Password</b></font></td>
                                                            <td><input type="text" maxlength="15"  name="curpasswd" required ></td>
                                                        </tr>
                                                         <tr>
                                                            <td></td>
                                                            <td></td>
                                                        </tr>
                                                        <tr>
                                                            <td><font size="1"><b>New Password</b></font></td>
                                                            <td><input type="password" maxlength="15"  name="newpasswd"id="txtPassword" required></td>
                                                        </tr>
                                                         <tr>
                                                            <td></td>
                                                            <td></td>
                                                        </tr>
                                                        
                                                         <tr>
                                                            <td><font size="1"><b>Confirm New Password</b></font></td>
                                                            <td><input type="password" maxlength="15"  name="newpasswdconfirm" id="txtConfirmPassword" required></td>
                                                          
                                                            
                                                        </tr>
                                                            <tr>
                                                            <td></td>
                                                            <td></td>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="2" bgcolor="#C0C0C0">
                                                                <div align="center">
                                                                    <input id="btnSubmit" name="submit" type="submit" value="Submit" class="btn btn-sm btn-success btn-block" >
                                                                </div>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </s:form>
 





</div>
</div>
</div>
</div>

<strong id="message">${message}</strong> 

</body>
</html>
