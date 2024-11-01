<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Products</title>
<link rel="stylesheet" href="style.css" type="text/css">
<style type="text/css">
/* General Styles */
body {
	font-family: Arial, sans-serif;
	background-color: aqua;
	margin: 0;
	padding: 0;
}

/* Header and Form Styling */
.searchArea {
	text-align: center;
	margin: 20px 0;
}

.searchArea input[type="number"] {
	padding: 8px;
	width: 200px;
}

.searchArea input[type="submit"] {
	padding: 8px 16px;
	background-color: #28a745;
	color: white;
	border: none;
	cursor: pointer;
}

.searchArea input[type="submit"]:hover {
	background-color: #218838;
}

/* Message Area Styling */
.messageArea {
	text-align: center;
	margin: 10px 0;
}

/* Table Styles */
table {
	width: 80%;
	margin: 20px auto;
	border-collapse: collapse;
	background-color: white;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
	padding: 10px;
	border: 1px solid #ddd;
	text-align: center;
}

th {
	background-color: #343a40;
	color: white;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

/* Action Button Styles */
form input[type="submit"] {
	padding: 5px 10px;
	background-color: #dc3545;
	color: white;
	border: none;
	cursor: pointer;
}

form input[type="submit"]:hover {
	background-color: #c82333;
}

/* Add Product Link */
a {
	display: block;
	width: 150px;
	margin: 20px auto;
	text-align: center;
	padding: 10px;
	background-color: #007bff;
	color: white;
	text-decoration: none;
	border-radius: 5px;
}

a:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="searchArea">
		<form action="searchProduct" method="post">
			<input type="number" name="searchId"
				value="${not empty searchId ? searchId : ''}"> <input
				type="submit" value="search">
		</form>
	</div>
	<div class="messageArea">
		<c:if test="${not empty msg}">
			<font color="green">${msg}</font>
		</c:if>
		<c:if test="${not empty err}">
			<font color="red">${err}</font>
		</c:if>
	</div>
	<div>
		<table border="1" width="100%">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>category</th>
				<th>model</th>
				<th>Action</th>
			</tr>
			<c:if test="${products.size() != 0}">
				<c:forEach items="${products}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.category}</td>
						<td>${product.model}</td>
						<td>
							<form action="deleteRecord">
								<input type="hidden" name="hidenId" value="${product.id}">
								<input type="submit" value="Delete">
							</form>
						</td>
					</tr>

				</c:forEach>
			</c:if>
			<c:if test="${products.size() == 0}">
				<tr>
					<td colspan="5" style="color: red; text-align: center;">Data
						Not Fount</td>
				</tr>
			</c:if>
		</table>
	</div>
	<div>
		<a href="register">Add Product</a>
	</div>
</body>
</html>