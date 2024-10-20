<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cultural Festival Registration</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div>
		<fieldset>
			<legend>Cultural Festival Registration</legend>
			<form action="RegisterServlet" method="POST">
		        <table>
		            <tr>
		                <td><label for="name">Name:</label></td>
		                <td><input type="text" id="name" name="name"></td>
		            </tr>
		            <tr>
		                <td><label for="email">Email:</label></td>
		                <td><input type="email" id="email" name="email"></td>
		            </tr>
		            <tr>
		                <td><label for="institute">Institute:</label></td>
		                <td><input type="text" id="institute" name="institute"></td>
		            </tr>
		            <tr>
		                <td><label>Gender:</label></td>
		                <td>
		                    <input type="radio" name="gender" value="Male"> Male
		                    <input type="radio" name="gender" value="Female"> Female
		                </td>
		            </tr>
		            <tr>
		                <td><label for="events">Select Events:</label></td>
		                <td>
		                    <select id="events" name="events" multiple style="width: 200px;">
		                        <option value="Dance">Dance</option>
		                        <option value="Music">Music</option>
		                        <option value="Drama">Drama</option>
		                        <option value="Art">Art</option>
		                    </select>
		                </td>
		            </tr>
		            <tr>
		                <td><label for="comments">Comments:</label></td>
		                <td><textarea id="comments" name="comments"></textarea></td>
		            </tr>
		            <tr>
		                <td colspan="2">
		                    <input type="reset" value="Reset">
		                    <input type="submit" value="Register">
		                </td>
		            </tr>
		        </table>
		    </form>
		</fieldset>
	</div>
</body>
</html>