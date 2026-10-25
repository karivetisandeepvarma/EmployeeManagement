<html>
<head>
<title>FLM EduTech</title>
<style>
    form {
        text-align: center;
    }
</style>
</head>
<body>
<h1 style="color: blue; text-align: center; ">Front Lines Media</h1>
<hr>
<marquee style="color: red">Welcome To Front Lines Media</marquee>
<hr>
<h1 style="color: black; text-align: center; ">Login</h1>
<form action="${pageContext.request.contextPath}/flm/login" method="post" >
	<label for="username">UserName</label>
	<input name="username" type="text" placeholder="Enter User Name "><br><br>
	<label for="password">Password  </label>
	<input name="password" type="password" placeholder="Enter Password "><br><br>
	<input name="Login" type="submit" value="Login">
</form>
<p style="text-align: center;">Are you a new user? <a href="${pageContext.request.contextPath}/flm/signup">SignUp</a></p>
</body>
</html>
