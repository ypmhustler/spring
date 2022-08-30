<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>THis is home page</title>
</head>
<body>
<h1> this is done by spring mnc</h1>
<% String name= (String) request.getAttribute("name");%>
<h2> <%= name%> </h2>
<h2> ${key} </h2>
</body>
</html>