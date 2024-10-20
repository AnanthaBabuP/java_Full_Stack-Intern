<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Register Process</title>
</head>
<body>
	<h1> STUDENT REGISTERATION FORM</h1>
	<form action="RegisterServlet" method="post">
		<table>
			<tr>
				<td>Enter The RegNo:</td>
				<td><input type="number" name="txtRegno"></td>
			</tr>
			<tr>
				<td>Enter The Student Name:</td>
				<td><input type="text" name="txtName"></td>
			</tr>
			<tr>
				<td>Enter The Age:</td>
				<td><input type="number" name="txtAge"></td>
			</tr>
			<tr>
				<td>Select the Gender:</td>
				<td><input type="radio" name="rdoGender" value="Male" checked="checked">Male</td>
				<td><input type="radio" name="rdoGender" value="Female">Female</td>
			</tr>
			<tr>
				<td>Select department:</td>
				<td>
					<select name="department">
						<option value="Civil" selected="selected">Civil</option> 
						<option value="Mechanical">Mechanical</option>
						<option value="ECE">ECE</option>
						<option value="EEE">EEE</option>
						<option value="CSE">CSE</option>
						<option value="IT">IT</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Select the DOB:</td>
				<td><input type="text" name="txtDOB"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"> </td>
				<td><input type="reset" value="Clear"> </td>
			</tr>
		</table>
	</form>
	<a href="RegisterServlet?action=show">Show All Students</a>
</body>
</html>