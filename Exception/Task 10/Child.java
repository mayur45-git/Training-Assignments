package com.yash.exception.Task_10;

public class Child extends Parent {
	
	public static void getLargestnum(int a[])  throws  NumberFormatException,ArrayIndexOutOfBoundsException
	{
		int sum=0;
        double average=0;
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
		
		for(int k=0; k<a.length; k++) {
            sum=sum+a[k];
        }
        average = sum/a.length;
        int max = a.length-1;
        System.out.println("Average is : " +average);
        System.out.println("Maximun is : " +a[max]);
    }
		
	
	}


