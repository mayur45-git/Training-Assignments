package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocTask2Application {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PrintMessage bean = context.getBean("printmessage", PrintMessage.class);
		System.out.println("Message=" + bean.getMessage());
	}

}
