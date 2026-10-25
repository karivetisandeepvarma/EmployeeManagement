package com.flm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	@Column(nullable=false)
	private String empName;
	
	@Column(nullable=false)
	private String empAge;
	
	@Column(unique=true)
	private String empEmailId;
	
	private String empDepartment;
	
	private int empSalary;
	
	public Employee()
	{
		
	}

	public Employee(int empId, String empName, String empAge, String empEmailId, String empDepartment, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empEmailId = empEmailId;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public Employee(String empName, String empAge, String empEmailId, String empDepartment, int empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empEmailId = empEmailId;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public String getEmpEmailId() {
		return empEmailId;
	}

	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empEmailId=" + empEmailId
				+ ", empDepartment=" + empDepartment + ", empSalary=" + empSalary + "]";
	}
	
	
	
	
	
	

}
