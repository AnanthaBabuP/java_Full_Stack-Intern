<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f5;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

fieldset {
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	padding: 20px;
	width: 300px;
	margin: auto;
}

legend {
	font-weight: bold;
	font-size: 1.5em;
}

form {
	display: flex;
	flex-direction: column;
}

input[type="text"], input[type="submit"] {
	margin-top: 10px;
	padding: 10px;
	font-size: 1em;
	border-radius: 4px;
	border: 1px solid #ccc;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	border: none;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

a {
	text-align: center;
	display: block;
	margin-top: 15px;
	color: #007bff;
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<fieldset>
		<legend>Registration Form</legend>
		<h2>Add Product</h2>
		<form action="addProduct" method="post">
			Name: <input type="text" name="name" /><br> Category: <input
				type="text" name="category" /><br> Model: <input type="text"
				name="model" /><br> <input type="submit" value="Add Product" />
		</form>
		<a href="listProducts">Show All Products</a>
	</fieldset>
</body>
</html>
