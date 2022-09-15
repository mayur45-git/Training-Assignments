package com.yash.oops.Task_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile extends Electronics {
		
	public void mobiledetails() throws ParseException
	{
		Electronics e=new Mobile();
		e.setId(101);
		e.setSemicondoctorType("Solar Cells");
		
		String dt = "04/07/1998";
		Date dateofManufacturing = new SimpleDateFormat("dd/MM/yyyy").parse(dt);
		
		System.out.println("Mobile Details...");
		System.out.println("Id -"+e.getId());
		System.out.println("semi-type "+e.getSemicondoctorType());
		System.out.println("DOM :-"+dt);
		
	
	}
	
}
