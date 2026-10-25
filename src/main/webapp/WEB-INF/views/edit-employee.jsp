<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style>
 form{
 text-align: center;
 }
</style>
</head>
<body>
	<h2 style="text-align: center;">Update Employee</h2>
		
		<form action="${pageContext.request.contextPath}/flm/employee/update" method="post">
				<label for="empid">Employee Id :</label>
				<input name = "empid" value="${employee.empId}"type="text" placeholder="Enter Employee Id" readonly="readonly"><br><br>
		
				<label for="empname">Employee Name : </label>
				<input name = "empname" value="${employee.empName}"type="text" placeholder="Enter Employee Name"><br><br>
				
				<label for="empmail">Employee MailId : </label>
				<input name = "empmail" value="${employee.empEmailId}"type="text" placeholder="Enter Employee MailId"><br><br>
				
				<label for="empage">Employee Age : </label>
				<input name = "empage" value="${employee.empAge}"type="text" placeholder="Enter Employee Age"><br><br>
				
				<label for="empsalary">Employee Salary : </label>
				<input name = "empsalary" value="${employee.empSalary}"type="text" placeholder="Enter Employee Salary"><br><br>
				
				<label for="empdept">Employee Department : </label>
				<input name = "empdept" value="${employee.empDepartment}"type="text" placeholder="Enter Employee Department"><br><br>
				
				<input type="submit" name="Update" value="Update Employee">
				
		</form>
</body>
</html>