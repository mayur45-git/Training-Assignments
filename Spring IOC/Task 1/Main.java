package com.yash.task1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args)
	{
		
		Resource resource=new ClassPathResource("bean.xml"); 
		
		BeanFactory factory=new XmlBeanFactory(resource); 
		
		Employee e=(Employee) factory.getBean("empbean");
		
		e.display();
		
		
		

	}

}
