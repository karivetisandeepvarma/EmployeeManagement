package com.flm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.flm.model.Employee;
import com.flm.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public String employees(Model model)
	{
		List<Employee> list = employeeService.getAllEmployees();
		
		model.addAttribute("list",list);
		
		return "employees";
	}
	
	@GetMapping("/newemployee")
	public String addEmployee()
	{
		return "employee-form";
	}
	
	@PostMapping("/save")
	public String SaveEmployee(HttpServletRequest request)
	{
		String empName = request.getParameter("empname");
		String empAge = request.getParameter("empage");
		String empMail = request.getParameter("empmail");
		String empDept = request.getParameter("empdept");
		int empSalary = Integer.parseInt(request.getParameter("empsalary"));
		
		Employee emp = new Employee(empName,empAge,empMail,empDept,empSalary);
		
		
		employeeService.saveEmployee(emp);
		
		return "redirect:/flm/employees";
		
	}
	
	@GetMapping("/employees/delete/{id}")
	public String deleteEmployee(@PathVariable("id")int id)
	{
		
		 employeeService.deleteEmployee(id);
		 
		 return "redirect:/flm/employees";
		
	}
	
	
	@GetMapping("/employees/update/{id}")
	public String findEmployeeEmployeeById(@PathVariable("id")int id,Model model)
	{
		
		Employee employee = employeeService.findEmployeeById(id);
		
		if(employee == null)
		{
			return "redirect:/flm/employees";
		}
		model.addAttribute("employee", employee);
		
		return "edit-employee";
		
	}
	
		@PostMapping("/employee/update")
		public String updateEmployee(HttpServletRequest request)
		{
			int empId = Integer.parseInt(request.getParameter("empid"));
			String empName = request.getParameter("empname");
			String empAge = request.getParameter("empage");
			String empMail = request.getParameter("empmail");
			String empDept = request.getParameter("empdept");
			int empSalary = Integer.parseInt(request.getParameter("empsalary"));
			
			Employee emp = new Employee(empId,empName,empAge,empMail,empDept,empSalary);
			
			employeeService.updateEmployee(emp);
			
			return "redirect:/flm/employees";
			
		}
		
		
	
	
	
	
	

}
