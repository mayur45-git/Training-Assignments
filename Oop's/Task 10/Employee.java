package com.yash.oops.Task_10;

import java.util.Date;

public class Employee {
	
	int empid;
	String empname;
	double empsalary;
	String empaddress;
	Date emp_dob;
	Date emp_doj;
	
	public Employee(int empid, String empname, double empsalary, String empaddress, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	
	

}
