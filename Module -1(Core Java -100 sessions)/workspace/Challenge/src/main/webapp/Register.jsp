<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Event Registration</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2 style="text-align: center;">Register for Cultural Festival</h2>
    <form action="RegisterServlet" method="POST">
        <table>
        	<tr class="error">
            	<td colspan="2">
            	<c:if test="${not empty error}">
            		*${error}
            	</c:if>
            	</td>
            </tr>
            <tr>
                <th>Name<span>*</span>:</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>Email<span>*</span>:</th>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <th>Institute<span>*</span>:</th>
                <td><input type="text" name="institute"></td>
            </tr>
            <tr>
                <th>Gender<span>*</span>:</th>
                <td>
                    <input type="radio" name="gender" value="Male" checked> Male
                    <input type="radio" name="gender" value="Female"> Female
                </td>
            </tr>
            <tr>
                <th>Events<span>*</span>:</th>
                <td>
                    <select name="event">
                    	<option value="">Select Any events</option>
                        <option value="Music">Music</option>
                        <option value="Dance">Dance</option>
                        <option value="Drama">Drama</option>
                        <option value="Art">Art</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Comments:</th>
                <td><textarea name="comments"></textarea></td>
            </tr>
             <tr>
                <th>Agree All Terms And Conditions<span>*</span>:</th>
                <td><input type="checkbox" name="agree"></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;">
                    <input type="submit" value="Register" class="registerbtn">
                    <input type="reset" value="Reset" class="restartbtn">
                </td>
            </tr>
            
        </table>
    </form>
</body>
</html>
