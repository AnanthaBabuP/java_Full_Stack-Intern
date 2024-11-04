<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register JSP</title>
</head>
<body>
	<h1>Regsiter</h1>
	<form action="saveProduct" method="post">
		Product Name :<input type='text' name='pname'><br><br>
		Product Quantity : <input type='text' name='quantity'><br><br>
		Product Price : <input type='text' name='price'><br><br>
		<input type="submit" value="Save Product">
		<input type="reset" value="Clear">
	</form>
	<a href="viewAllProducts">View All Products</a>
</body>
</html>