package com.yash.task1;

public class Employee {
	
	String empId;
	String empName;
	String empRole;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	
	public void display()
	{
		System.out.println("Emp Id :- "+ empId);
		System.out.println("Emp Name :- "+ empName);
		System.out.println("Emp Id :- "+ empRole);
	}

}
