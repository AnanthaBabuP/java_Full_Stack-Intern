<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
	<h1>Company Registertion</h1>
	<form action="registerCompany" method="post">
	Company Name:<input type="text" name="name"><br><br>
	Company Location:<input type="text" name="location"><br><br>
	<input type="submit" value="Register">
	<input type="reset" value="Reset">
	</form>
</body>
</html>