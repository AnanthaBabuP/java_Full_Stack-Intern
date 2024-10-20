<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<link rel="stylesheet" href="styles.css">
    <title>Success</title>
</head>
<body>
	<div class="successBox">
		<h2>Success!</h2>
		<p><%= request.getAttribute("message") %></p>
		<a class="addeventbtn" href="EventServlet?action=show">View Events</a>
	</div>
</body>
</html>
