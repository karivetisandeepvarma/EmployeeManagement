<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<style>
 form{
 text-align: center;
 }
</style>
</head>
<body>
		<h2 style="text-align: center;">Add Employee</h2>
		
		<form action="save" method="post">
				<label for="empname">Employee Name : </label>
				<input name = "empname" type="text" placeholder="Enter Employee Name"><br><br>
				
				<label for="empmail">Employee MailId : </label>
				<input name = "empmail" type="text" placeholder="Enter Employee MailId"><br><br>
				
				<label for="empage">Employee Age : </label>
				<input name = "empage" type="text" placeholder="Enter Employee Age"><br><br>
				
				<label for="empsalary">Employee Salary : </label>
				<input name = "empsalary" type="text" placeholder="Enter Employee Salary"><br><br>
				
				<label for="empdept">Employee Department : </label>
				<input name = "empdept" type="text" placeholder="Enter Employee Department"><br><br>
				
				<input type="submit" name="Add" value="Add Employee">
				
		</form>
</body>
</html>