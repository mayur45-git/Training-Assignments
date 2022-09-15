package com.yash.oops.Task_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) throws ParseException 
	{
		Department[] dept = new Department[2];
		
		dept[0] = new Department("Dept101", "Hr Department");
		dept[1] = new Department("Dept201", "It Department");

		String birth = "04/07/1998";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birth);

		String join = "19/07/2022";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(join);

		String regist = "11/02/2025";
		Date dor = new SimpleDateFormat("dd/MM/yyyy").parse(regist);

		Employee emp = new Employee(101, "Eren Yeager", "WallMaria", dob, 0000.00, doj, "Shiganshina", dept[1], 9876,
				"eren689@aot.com");

		Customer cust = new Customer(111, "Levi", "WallRose", dob, dor, "WallRose", 11450, "Ackerman@gmail.com");

		System.out.println("Employee Details -");
		 emp.printEmployeeDetails();
		 
		 System.out.println("Customer Details -");
		 cust.printCustomerDetails();
		

	}	

}
