<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Success</title>
</head>
<body>
<h1 style="color: blue; text-align: center; ">Front Lines Media</h1>
<hr>
<marquee style="color: red">Welcome To Front Lines Media</marquee>
<hr>
<h1 style="color: black; text-align: center; ">Hi ${username}, you have signed up successfully...</h1>

<h3 style="color: black; text-align: center; ">Login Credentials are :</h3>

<h6 style="color: black; text-align: center; ">UserName : ${username} </h6>
<h6 style="color: black; text-align: center; ">Password : ${password}</h6>

<p style="text-align: center">Click Here To Login -> <a href="${pageContext.request.contextPath}/index.jsp">Login</a></p>
</body>
</html>