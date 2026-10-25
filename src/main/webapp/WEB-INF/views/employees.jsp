<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.List"%>
<%@ page import = "com.flm.model.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
		<h1 style="text-align: center;">Employees Data</h1>
		
		<table border="1" style="margin: 0 auto;">
				
				<tr>
				
					<th> Employee ID</th>
					<th> Employee Name</th>
					<th> Employee Age</th>
					<th> Employee Salary</th>
					<th> Employee EmailID</th>
					<th> Employee Department</th>
					<th> Action</th>
				
				</tr>
				<%
					List<Employee> list =(List<Employee>) request.getAttribute("list");
					
					for(Employee emp:list)
					{
				%>
				<tr>
					
					<td><%= emp.getEmpId() %> </td>
					<td><%= emp.getEmpName() %> </td>
					<td> <%=emp.getEmpAge() %></td>
					<td><%= emp.getEmpSalary() %> </td>
					<td><%= emp.getEmpEmailId() %> </td>
					<td><%= emp.getEmpDepartment() %> </td>
					<td><a href="employees/update/<%= emp.getEmpId() %>">Update</a> | <a href="employees/delete/<%= emp.getEmpId() %>">Delete</a></td>
				<% }%>
				</tr>
		
		
		</table><br>
		
<div style="text-align: center;">
    <a href="newemployee">Add Employee</a>
</div>		
		
</body>
</html>