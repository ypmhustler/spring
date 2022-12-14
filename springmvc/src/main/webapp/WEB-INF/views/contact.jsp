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
<script src="<c:url value="/resource/js/demo.js"  />" ></script>
<title>PirateKing Challenge Tournament</title>
<h1>${info}</h1>
<h2>${desc} </h2>
</head>
<body>

<img alt="naruto image" src="<c:url value="/resource/image/img.jpg" />">
	<div class="container mt-4" style="text-align:right"> 
	 	<b><a href="signin" style="font-size:2vw"> Sign In</a></b>
	</div>
	<div class="container mt-5">
		<h3>Registration form for challenging Pirate king</h3>
		<form action="processform" method="post">
			<div class="form-group">
				<label for="exampleInputUsername">User Name</label> <input
					type="text" class="form-control" id="exampleInputUserName"
					aria-describedby="UserNameHelp" name="userName" placeholder="Provide your user name"> 
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="email" placeholder="Enter email"> 
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" name="userpass" id="exampleInputPassword1"
					placeholder="Password">
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>