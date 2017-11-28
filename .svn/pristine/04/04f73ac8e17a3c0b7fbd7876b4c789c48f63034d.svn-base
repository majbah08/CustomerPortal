 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>History</title>
<style>
.databox {
    height: 200px;
    width: 50%;
    position: absolute;
    margin-left:300px
}

#header { color: #337ab7; }

</style>




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


<table class="table table-striped table-bordered table-hover">
<thead>
<tr>        
<th>Payment Date</th>
			<th>Payment Amount</th>
			<th>Payment Type</th>
			<th>Remarks</th>
			
			
		</tr>
</thead>
<c:forEach items="${listCustomerHistory}" var="history">

<tr>

 <td> <c:out value="${history.PAY_DATE}"/></td>
 <td> <c:out value="${history.PAY_AMT}"/></td>
 <td> <c:out value="${history.PAY_TYPE}"/></td>
  <td><c:out value="${history.REMARKS}"/></td>
 
 </tr>
</c:forEach>
</table>

</div>
</div>
</div>
</div>
</body>
</html>