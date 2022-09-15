package com.yash.exception.Task_10;

public class Parent {
	
	
	public static void getLargestnum(int a[])  throws NullPointerException,ArrayIndexOutOfBoundsException
	{
		
		int temp;  
		for (int i = 0; i <a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       int max=a.length-1;
		       System.out.println(a[max]);
		
		
	}

}
