<%@ page import="lab2.greeting" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> COMP367_Lab2</title>
</head>
<body>
	<jsp:useBean id="greeting" class="lab2.greeting" scope="session">
	</jsp:useBean>	
	<h1><%= greeting.getSetTimeOfDay() %> Welcome to COMP367!</h1>
</body>
</html>
