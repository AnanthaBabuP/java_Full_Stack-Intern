<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Product</title>
</head>
<body>
    <h1>Edit Product Form</h1>
    <form:form action="/updateProduct" method="post" modelAttribute="product">
        Product ID: <form:input path="id" /><br><br>
        Product Name: <form:input path="pname" /><br><br>
        Product Quantity: <form:input path="quantity" /><br><br>
        Product Price: <form:input path="price" /><br><br>
        <input type="submit" value="Update Product">
        <input type="reset" value="Clear">
    </form:form>
    <a href="/viewAllProducts">View All Products</a>
</body>
</html>
