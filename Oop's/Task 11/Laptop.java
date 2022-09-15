package com.yash.oops.Task_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Laptop extends Electronics {
	
	public void laptopdetails() throws ParseException
	{
		Electronics e=new Electronics();
		e.setId(101);
		e.setSemicondoctorType("silicon");
		
		String dt = "04/07/1998";
		Date dateofManufacturing = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
		
		System.out.println("Laptop Details...");
		System.out.println("Id -"+e.getId());
		System.out.println("semi-type "+e.getSemicondoctorType());
		System.out.println("DOM :-"+dt);
	}

}
