package com.yash.oops.Task_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

	public static void main(String[] args) throws ParseException {
		
		
		String birth = "04/07/2000";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
		String join = "04/07/2016";
		Date doj = new SimpleDateFormat("dd/MM/yyyy").parse(join);
		
		Employee e=new Employee(101, "Erwin Smith", 25000.00, "Wall Maria", dob, doj);
		
		System.out.println("Employee Details:- "+e.toString());

	}

}
