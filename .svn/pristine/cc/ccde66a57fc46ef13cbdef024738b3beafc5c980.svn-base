 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>

<script type="text/javascript" src="../resources/js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(e) {
    $('#btnValidate').click(function() {
        var sEmail = $('#txtEmail').val();
        if ($.trim(sEmail).length == 0) {
            alert('Please enter valid email address');
            e.preventDefault();
        }
        if (validateEmail(sEmail)) {
            alert('Email is valid');
        }
        else {
            alert('Invalid Email Address');
            e.preventDefault();
        }
    });
});

function validateEmail(sEmail) {
    var filter = /^([\w-\.]+)@smile.com.bd/;
    if (filter.test(sEmail)) {
        return true;
    }
    else {
        return false;
    }
}


</script>
</head>
<body>
<div align="center">
<h1> Register Customer</h1>
<strong >${message}</strong> 
<table>
       <s:form commandName="customerData" action ="${ pageContext.request.contextPath}/customer/register" method ="post"
       ata-fv-framework="bootstrap"
    data-fv-icon-valid="glyphicon glyphicon-ok"
    data-fv-icon-invalid="glyphicon glyphicon-remove"
    data-fv-icon-validating="glyphicon glyphicon-refresh">

<tr>
<div class="form-group">
     <td>   <label class="col-xs-3 control-label">Email address</label></td>
     <td>   <div class="col-xs-7">
            <input class="form-control" name="email" id="txtEmail"
                type="email" />
        </div></td>
    </div>
</tr>
<tr>
<td><input type="submit" id="btnValidate" value="Get Password"/></td>
</tr>
</s:form>
</table>











</div>



</body>
</html>