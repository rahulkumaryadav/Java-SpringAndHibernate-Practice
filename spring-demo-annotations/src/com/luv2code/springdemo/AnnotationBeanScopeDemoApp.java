package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring config file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach=context.getBean("thatSillyCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("thatSillyCoach",Coach.class);
		
		
		//check if they are same
		boolean result =(coach==alphaCoach);
		System.out.println("\nPointing to the same object"+result);
		
		System.out.println("\nMemory location for theCoach"+coach);
		
		System.out.println("\nMemory location for alphaCoach"+alphaCoach);
		
		//close the context
		context.close();
		
		
	}

}
