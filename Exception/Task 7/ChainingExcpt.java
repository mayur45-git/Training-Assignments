package com.yash.exception.Task_7;

import java.io.IOException;

public class ChainingExcpt {
	
	 public static void main(String[] args) throws Throwable {
	        try {
	        	
	            throw new ArithmeticException("Arithmetic Exception.....").initCause(new IOException("IO cause."));
	              
	        } 
	        catch(ArithmeticException ae) 
	        {
	            System.out.println("Caught : " + ae);
	            System.out.println("Actual cause: "+ ae.getCause());
	        }
	    }

}
