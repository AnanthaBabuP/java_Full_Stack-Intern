<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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
			<form action="RegisterController" method="post">
				<c:forEach items="${participant}" var="data">
				<table>
					<tr>
		            	<td>Full Name<span>*</span>:</td>
		            	<td><input type="text" id="name" name="name" value="${data.name}" required> </td>
		            </tr>
					<tr>
	            		<td>Email<span>*</span>:</td>
	            		<td> <input type="email" id="email" name="email" required> </td>
					</tr>
	            	<tr>
	            		<td>Institute<span>*</span>:</td>
	            		<td><input type="text" id="institute" name="institute" required> </td>
					</tr>
					<tr>
	           	 		<td>Gender:</td>
	            		<td>
			            	<select id="gender" name="gender" required>
				                <option value="Male" selected="selected">Male</option>
				                <option value="Female">Female</option>
				                <option value="Other">Other</option>
				            </select> 
				        </td>
		          	</tr>
	
		            <tr>
		            	<td colspan="2">
		           	 	Events (Select at least one):</td>
		           	 </tr>
		           	 <tr>
			           	 <td colspan="2">
				            <input type="checkbox" name="events" value="Music"> Music
				            <input type="checkbox" name="events" value="Dance"> Dance
				            <input type="checkbox" name="events" value="Theatre"> Theatre
				            <input type="checkbox" name="events" value="Art"> Art 
			            </td>
					</tr>
		            <tr>
		            	<td>Additional Comments:</td>
		            	<td><textarea id="comments" name="comments" rows="5" cols="40"></textarea> </td>
		            <tr>
					<tr>
			            <td><button type="submit">Register</button></td>
			            <td><button type="reset">Reset</button></td>
		            </tr>
	        
	        	</table>
	        	</c:forEach>
	        </form>
	        <div class="error">
	            <c:if test="${not empty error}">
	                <p>${error}</p>
	            </c:if>
	        </div>
		</fieldset>
	</div>
</body>
</html>