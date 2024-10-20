<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
	<h1>Student Details</h1>
	<table border="2" width="100%" style="text-align: center;">
		<tr style="color: white; background: pink;">
			<th>Reg No</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Department</th>
			<th>DOB</th>
			<th colspan="2">Actions</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr style="background: lightgreen;">
				<td>${student.regno}</td>
				<td>${student.student_name}</td>
				<td>${student.age}</td>
				<td>${student.gender}</td>
				<td>${student.dept}</td>
				<td>${student.dob}</td>
				<td><a href="RegisterServlet?action=edit&regno=${student.regno}">Edit</a></td>
				<td><a href="RegisterServlet?action=delete&regno=${student.regno}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>