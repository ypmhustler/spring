<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BATMAn</title>
</head>
<body>
<h1>I AM BATMAN</h1>
<% String name=(String) request.getAttribute("name"); %>
<%  LocalDateTime date= (LocalDateTime)request.getAttribute("date");%>
<h2>
<%=name %>
<%=date.toString() %>
</h2>
</body>
</html>