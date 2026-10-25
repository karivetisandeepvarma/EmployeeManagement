<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
<style>
    form {
        text-align: center;
    }
</style>
</head>
<h1 style="color: blue; text-align: center; ">Front Lines Media</h1>
<hr>
<marquee style="color: red">Welcome To Front Lines Media</marquee>
<hr>
<body>
<h1 style="color: black; text-align: center; ">SignUp</h1>
<form action="signup" method="post">
	<label for="username">UserName</label>
	<input name="username" type="text" placeholder="Enter User Name "><br><br>
	<label for="password">Password  </label>
	<input name="password" type="password" placeholder="Enter Password "><br><br>
	<input name="Login" type="submit" value="SignUp">
</form>
<p style="text-align: center">Already an existing user?<a href="${pageContext.request.contextPath}/index.jsp">Login</a></p>

</body>
</html>