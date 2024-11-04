<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register JSP</title>
</head>
<body>
	<h1>Regsiter Data</h1>
	<table border="1" width="100%">
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Quantity</th>
			<th>Product Price</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach  items="${products}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.pname}</td>
				<td>${product.quantity}</td>
				<td>${product.price}</td>
				<td><a href="/editProduct/${product.id}">Edit</a></td>
				<td><a href="/deleteProduct/${product.id}">Delete </a></td>
			</tr>	
		</c:forEach >	
	</table>
</body>
</html>