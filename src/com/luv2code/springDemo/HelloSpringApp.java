package com.luv2code.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//retrieve bean from spring container
		 Coach theCoach=context.getBean("myCoach",Coach.class);
		//call the method on bean
		 System.out.println(theCoach.getDailyWorkOut());
		//close the context
		 context.close();

	}

}
