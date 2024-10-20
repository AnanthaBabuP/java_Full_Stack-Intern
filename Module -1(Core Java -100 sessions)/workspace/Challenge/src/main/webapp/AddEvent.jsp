<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Event</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h2>Register Event</h2>
<form action="EventServlet" method="post">
    <input type="hidden" name="action" value="add">
    <table>
        <tr>
            <td>Event Name:</td>
            <td><input type="text" name="eventName" required></td>
        </tr>
        <tr>
            <td>Institute Name:</td>
            <td><input type="text" name="instituteName" required></td>
        </tr>
        <tr>
            <td>Event Category:</td>
            <td><input type="text" name="eventCategory" required></td>
        </tr>
        <tr>
            <td>Student Age:</td>
            <td><input type="number" name="studentAge" required></td>
        </tr>
        <tr>
            <td>Student Qualification:</td>
            <td><input type="text" name="studentQualification" required></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="Add Event" class="addeventbtnmain">
                <input type="reset" value="Reset" class="restartbtn">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
