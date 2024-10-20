<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.model.Event" %>
<html>
<head>
    <title>Edit Event</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h2>Edit Event</h2>
<%
    Event event = (Event) request.getAttribute("event");
%>
<form action="EventServlet" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="<%= event.getId() %>">
    <table>
        <tr>
            <td>Event Name:</td>
            <td><input type="text" name="eventName" value="<%= event.getEventName() %>" required></td>
        </tr>
        <tr>
            <td>Institute Name:</td>
            <td><input type="text" name="instituteName" value="<%= event.getInstituteName() %>" required></td>
        </tr>
        <tr>
            <td>Event Category:</td>
            <td><input type="text" name="eventCategory" value="<%= event.getEventCategory() %>" required></td>
        </tr>
        <tr>
            <td>Student Age:</td>
            <td><input type="number" name="studentAge" value="<%= event.getStudentAge() %>" required></td>
        </tr>
        <tr>
            <td>Student Qualification:</td>
            <td><input type="text" name="studentQualification" value="<%= event.getStudentQualification() %>" required></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="Update" class="editbtn">
                <input type="reset" value="Reset" class="restartbtn">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
