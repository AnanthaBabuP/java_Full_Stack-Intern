<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.model.Event,java.util.List" %>
<html>
<head>
    <title>Event List</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h2>Event List</h2>
<table border="1">
    <tr>
        <th>S.NO</th>
        <th>Event Name</th>
        <th>Institute Name</th>
        <th>Event Category</th>
        <th>Student Age</th>
        <th>Student Qualification</th>
        <th colspan="2">Actions</th>
    </tr>
    <%
        List<Event> events = (List<Event>) request.getAttribute("events");
        int sno=0;
        for (Event event : events) {
        	sno++;
    %>
    <tr>
        <td><%= sno %></td>
        <td><%= event.getEventName() %></td>
        <td><%= event.getInstituteName() %></td>
        <td><%= event.getEventCategory() %></td>
        <td><%= event.getStudentAge() %></td>
        <td><%= event.getStudentQualification() %></td>
        <td>
            <form action="EventServlet" method="post">
                <input type="hidden" name="action" value="edit">
                <input type="hidden" name="id" value="<%= event.getId() %>">
                <input type="submit" value="Edit" class="editbtn">
            </form>
            <form action="EventServlet" method="post" onsubmit="return confirm('Are you sure you want to delete this event?');">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="<%= event.getId() %>">
                <input type="submit" value="Delete" class="deletebtn">
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>
<a href="AddEvent.jsp" class="addeventbtn"> Add New Event</a>
<a href="Register.jsp" class="addeventbtn" style="background: green;color:white;"> Register Form</a>s
</body>
</html>
