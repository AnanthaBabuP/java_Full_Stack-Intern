<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error JSP</title>
</head>
<body>
	<font color="red"> ${error} </font>
	<jsp:include page="/index.jsp"></jsp:include>
</body>
</html>