<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
<fieldset>
	<legend>Student Registration</legend>
	<form action="registerProcess" method="post">
		Name: <input type="text" name="sname"><br><br>
		Age: <input type="number" name="sage"><br><br>
		Address:<textarea rows="5" cols="30" name="saddress"></textarea><br><br>
		Course:
		<select name="scourse">
			<option value="M.Com">M.Com</option>
			<option value="B.Com"> B.Com</option>
			<option value="B.Sc">B.Sc</option>
			<option value="B.E">B.E</option>
			<option value="B.Tech">B.Tech</option>
		</select> <br><br>
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
	</form>
	<a href="viewAllStudents">View All Students</a>
	
</fieldset>
</body>
</html>