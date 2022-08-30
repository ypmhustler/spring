<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YOUR REGISTRATION IS COMPLETE</title>
</head>
<header>${info }</header>
<h1>${desc}</h1>
<body>
 <h1>your email id ${user.email}</h1>
 <h1>your user name is ${user.userName}</h1>
 <h1>your password is ${user.userpass}</h1>
</body>
</html>