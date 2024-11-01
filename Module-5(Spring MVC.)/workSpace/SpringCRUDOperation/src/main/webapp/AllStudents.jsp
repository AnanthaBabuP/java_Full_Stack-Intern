<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
</head>
<body>
	<h1>Display all the Students</h1>
	<table border="1" width="100%">
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Student Address</th>
			<th>Student Course</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.sid}</td>
				<td>${student.sname}</td>
				<td>${student.sage}</td>
				<td>${student.saddress}</td>
				<td>${student.scourse}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>