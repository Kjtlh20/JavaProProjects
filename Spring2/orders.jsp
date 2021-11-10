<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <title>Orders</title>
</head>
<body>
	<h3>Orders:</h3>
 	<table>
	 	<thead>
	 		<tr>
			     <td><b>Name</b></td>
			     <td><b>Address</b></td>
			     <td><b>Item</b></td>
			     <td><b>Price</b></td>
	   		</tr>
	 	</thead>
	    <c:forEach items="${orders}" var="order">
		   	<tr>
		     	<td>${order.name}</td>
		     	<td>${order.address}</td>
		     	<td>${order.item}</td>
		     	<td>${order.price}</td>
		   	</tr>
	   	</c:forEach>
 	</table>
</body>
</html>