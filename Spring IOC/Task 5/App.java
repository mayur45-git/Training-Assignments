package com.yash;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	 
	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Message msg=(Message) context.getBean("m");
		System.out.println(msg);
		
	}

}
