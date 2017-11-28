 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<html>
<head>
<style>
.databox {
    height: 200px;
    width: 50%;
    position: absolute;
     margin-left:400px
}

#header { color: #337ab7; }

</style>
<script language="JavaScript" type="text/javascript" src="../resources/js/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
    $("#table_id td.y_n:contains('INACTIVE')").css('color','#FF0000');
});

</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Profile</title>
</head>
<body>

<%@include  file="blank.html" %>
   
  <div id="page-wrapper">
 <div class="row">
               <div class="col-lg-12">
                   <div class="panel panel-heading">
   <div>
   <h1 id="header">Customer Payment History</h1> 
   </div>
   <hr>

   
   
<table class="table table-responsive" id="table_id">
		<!--  
		<tr>
			<th>ID</th>
			<th>Customer Name</th>
			<th>Customer Email</th>
			<th>Customer Phone No</th>
			<th>Mobile No</th>
		</tr>
		-->

		<tr>
             
        <tr><th>Customer ID:</th> <td> <c:out value="${customer.PHONENO}"/></td></tr>
        <tr><th>Customer Name:</th> <td> <c:out value="${customer.CUSTOMER_NAME}"/></td></tr>
        <tr><th>User Name:</th> <td> <c:out value="${customer.SMILEBD_EMAIL} "/></td></tr>
        <tr><th>Email:</th> <td> <c:out value="${customer.EMAIL} "/></td></tr>
        <tr><th>Phone No:</th> <td> <c:out value="${customer.CONTACT_NO} "/></td></tr>
       
        <tr><th>Connection Status:</th> <td class="y_n"> <c:out value="${customer.CONN_STATUS} "/></td></tr>
        <tr><th>Conn.Expiary Date:</th> <td> <c:out value="${customer.CONN_EXPIRY_DATE} "/></td></tr>
        <tr><th>MAC:</th> <td> <c:out value="${customer.MAC} "/></td></tr>
        <tr><th>Address:</th> <td> <c:out value="${customer.ADDRESS} "/></td></tr>
        
            
        </tr>

</table>
</div>
</div>
</div>
</div>
<!--  
      <a href="${pageContext.request.contextPath}/customer/logout "><b>Logout</b></a>
-->
</body>
</html>