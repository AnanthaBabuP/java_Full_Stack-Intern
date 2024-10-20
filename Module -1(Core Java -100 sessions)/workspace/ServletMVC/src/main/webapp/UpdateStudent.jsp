<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Details</title>
</head>
<body>
	<h1> STUDENT UPDATE FORM</h1>
	<form action="UpdateServlet" method="post">
		<table>
		<c:forEach items="${StudentListByRegno}" var="student">
			<tr>
				<td></td>
				<td><input type="hidden" name="hiddenRegNo" value="${student.regno}"></td>
			</tr>
			<tr>
				<td>RegNo:</td>
				<td><input type="number" name="txtRegno" disabled="disabled" value="${student.regno}"></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type="text" name="txtName" value="${student.student_name}"> </td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" name="txtAge" value="${student.age}"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
				    <input type="radio" name="rdoGender" value="Male" 
				           <c:if test="${student.gender == 'Male'}">checked</c:if>> Male
				</td>
				<td>
				    <input type="radio" name="rdoGender" value="Female" 
				           <c:if test="${student.gender == 'Female'}">checked</c:if>> Female
				</td>
			</tr>
			<tr>
				<td>Department:</td>
				<td>
					<select name="department">
						<option value="Civil" selected="${student.dept} == 'Civil'?selected : '' ">Civil</option> 
						<option value="Mechanical" selected="${student.dept} == 'Mechanical'?selected : '' ">Mechanical</option>
						<option value="ECE" selected="${student.dept} == 'ECE'?selected : '' ">ECE</option>
						<option value="EEE" selected="${student.dept} == 'EEE'?selected : '' ">EEE</option>
						<option value="CSE" selected="${student.dept} == 'CSE'?selected : '' ">CSE</option>
						<option value="IT" selected="${student.dept} == 'IT'?selected : '' ">IT</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><input type="text" name="txtDOB" value="${student.dob}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"> </td>
				<td><input type="reset" value="Clear"> </td>
			</tr>
		</c:forEach>
		</table>
	</form>
	<a href="RegisterServlet?action=show">Show All Students</a>
</body>
</html>