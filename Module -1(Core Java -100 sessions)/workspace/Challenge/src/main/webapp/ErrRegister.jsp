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
            <!-- Error Row -->
            <tr class="error">
                <td colspan="2">
                    <c:if test="${not empty error}">
                        <span style="color: red;">*${error}</span>
                    </c:if>
                </td>
            </tr>

            <c:forEach items="${participants}" var="data">
                <tr>
                    <th>Name<span>*</span>:</th>
                    <td><input type="text" name="name" value="${data.name}"></td>
                </tr>
                <tr>
                    <th>Email<span>*</span>:</th>
                    <td><input type="email" name="email" value="${data.email}"></td>
                </tr>
                <tr>
                    <th>Institute<span>*</span>:</th>
                    <td><input type="text" name="institute" value="${data.institute}"></td>
                </tr>
                <tr>
                    <th>Gender<span>*</span>:</th>
                    <td>
                        <input type="radio" name="gender" value="Male" 
                            <c:if test="${data.gender == 'Male'}">checked</c:if>> Male
                        <input type="radio" name="gender" value="Female" 
                            <c:if test="${data.gender == 'Female'}">checked</c:if>> Female
                    </td>
                </tr>
                <tr>
                    <th>Events<span>*</span>:</th>
                   <td>
                      	<select name="event">
                        	<option value="" <c:if test="${data.event == ''}">selected</c:if>>Select Any events</option>
                            <option value="Music" <c:if test="${data.event == 'Music'}">selected</c:if>>Music</option>
                            <option value="Dance" <c:if test="${data.event == 'Dance'}">selected</c:if>>Dance</option>
                            <option value="Drama" <c:if test="${data.event == 'Drama'}">selected</c:if>>Drama</option>
                            <option value="Art" <c:if test="${data.event == 'Art'}">selected</c:if>>Art</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Comments:</th>
                    <td><textarea name="comments">${data.comments}</textarea></td>
                </tr>
                <tr>
                    <th>Agree to Terms<span>*</span>:</th>
                    <td>
                        <input type="checkbox" name="agree" 
                            <c:if test="${data.agree == 'on'}">checked</c:if>> I agree
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="Register" class="registerbtn">
                        <input type="reset" value="Reset" class="restartbtn">
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
