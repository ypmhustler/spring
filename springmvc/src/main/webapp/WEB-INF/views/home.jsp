<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link  rel="stylesheet" type="text/css" href="<c:url value="/resource/css/style.css" />" >
<title>Home Page</title>
</head>
<body>
<div class="container mt-5">
<% String name= (String) request.getAttribute("name");%>
<h2> <%= name%> </h2>
<h2> ${key} </h2>
</div>
<div class="container mt-5">
<a class="btn btn-primary "  href="pirate" role="button"> SIGN UP For Pirate Challenge</a>
<a class="btn btn-primary "  href="signin" role="button">SIGN IN</a>
</div>
</body>
</html>