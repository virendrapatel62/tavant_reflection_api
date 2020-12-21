package com.tavant.reflection;

public class Employee  {

	
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeMobileNumber;
	private Float employeeSalary;
	public Employee(String employeeId, String employeeFirstName, String employeeLastName, String employeeMobileNumber,
			Float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public Float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
