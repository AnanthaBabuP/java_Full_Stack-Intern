<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Company Details</title>
</head>
<body>
	<font>${msg}</font>
	<table border="2" width="100%">
		<tr>
			<th>ID</th>
			<th>Company Name</th>
			<th>Company Location</th>
		</tr>
		<c:forEach items="${Companys}" var="company">
			<tr>
				<td>${company.id}</td>
				<td>${company.name}</td>
				<td>${company.location}</td>
			</tr>
		
		</c:forEach>
	</table>
	<a href="register">Register Page</a>
</body>
</html>