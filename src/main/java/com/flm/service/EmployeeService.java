package com.flm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.EmployeeDAO;
import com.flm.model.Employee;

@Component
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public String saveEmployee(Employee emp)
	{
		return employeeDAO.saveEmployee(emp);
		
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> list = employeeDAO.getAllEmployees();
		
		return list;
	}
	
	public String deleteEmployee(int id)
	{
		Employee emp = new Employee(id, "", "","", "",0);
		
		return employeeDAO.deleteEmployee(emp);
	}
	
	public Employee findEmployeeById(int id)
	{
		Employee employee = employeeDAO.findEmployeeById(id);
		
		return employee;
	}
	
	public void updateEmployee(Employee emp)
	{
		employeeDAO.updateEmployee(emp);
	}

}
