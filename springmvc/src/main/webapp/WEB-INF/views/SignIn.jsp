<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link  rel="stylesheet" type="text/css" href="<c:url value="/resource/css/signin.css" />" >
<title>Login Profile for Ninja Tournament</title>
</head>
<body>
<div class="loginBox"> <img class="user" src="https://i.ibb.co/yVGxFPR/2.png" height="100px" width="100px">
        <h3>Sign in here</h3>
        <form action="loginprocess" method="post">
            <div class="inputBox"> <input id="uemail" type="email" name="Useremail" placeholder="Useremail"> <input id="pass" type="password" name="Password" placeholder="Password"> </div> <input type="submit" name="" value="Login">
        </form> 
        <a href="#">Forget Password<br> </a>
        <div class="text-center">
            <p style="color: #59238F;">Sign-Up</p>
        </div>
        
    </div>
</body>
</html>