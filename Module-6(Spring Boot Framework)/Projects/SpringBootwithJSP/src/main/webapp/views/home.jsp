<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1 class="welcome">Welcome to All</h1>
    <form action="/register" method="post" class="form-container">
        <h1 class="form-title">Register</h1>

        <div class="form-group">
            <label>User Name:</label>
            <input type="text" name="userName" id="userName" class="input-field" value="${userName}">
            <!-- Display error message -->
            <span class="error-message">${errorUserName}</span>
        </div>

        <div class="form-group">
            <label>Email:</label>
            <input type="email" name="mail_id" id="mail_id" class="input-field" value="${mail_id}">
            <!-- Display error message -->
            <span class="error-message">${errorEmail}</span>
        </div>

        <div class="form-group">
            <label>Password:</label>
            <input type="password" name="password" id="password" class="input-field">
            <!-- Display error message -->
            <span class="error-message">${errorPassword}</span>
        </div>

        <div class="form-group">
            <label>Confirm Password:</label>
            <input type="password" name="conf_password" id="conf_password" class="input-field">
            <!-- Display error message -->
            <span class="error-message">${errorConfirmPassword}</span>
        </div>

        <div class="form-group">
		    <input type="submit" value="Register" class="btn bg_orange">
		    <a href="/login" class="link btn bg_green">Login</a>
		</div>

    </form>
</body>
</html>
