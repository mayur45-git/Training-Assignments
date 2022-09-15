package com.yash.exception.Task_8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	private static final String PATTERN = 
			"((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,14})";
	
	public static void main(String[] args) throws PasswordFormatException {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("-Password must be 8 to 14 in length \n-It must have 2 small and 2 capital alphabets \n-it must have 2 special characters......");
		System.out.println("Please Enter Password to Set new Password-");
		String password=sc.next();
		//System.out.println("Password:- "+password);
		
		Pattern pattern = Pattern.compile(PATTERN);
		
		Matcher matcher = pattern.matcher(password);
		
		if(matcher.matches())
		{
			  System.out.println("Password "+ password +" is valid");
			  
		  }
		else
		{
			  System.out.println("Password "+ password +" is invalid");
			  
			  throw new PasswordFormatException("Password format is Invalid.");
		  }
		
	}
	
	

}
