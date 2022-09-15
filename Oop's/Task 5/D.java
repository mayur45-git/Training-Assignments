package com.yash.oops.Task_5;

import java.util.Scanner;

public class D extends C{
	
	

	@Override
	public void div(int a, int b) {
		
		int c=a/b;
		System.out.println("Div :- "+c);
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		CalcAbs cal=new D();
		System.out.println("Enter Two num's to sum-");
		cal.sum(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter Two num's to sub-");
		cal.sub(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter Two num's to mul-");
		cal.mul(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter Two num's to div-");
		cal.div(sc.nextInt(), sc.nextInt());
		
		
	}

	
	
}
