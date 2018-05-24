package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	// creating spring configuration  for container
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrive beans from container		
		Coach theCoach =context.getBean("myCoach",Coach.class);

		Coach alphaCoach =context.getBean("myCoach",Coach.class);
		
		// check if they are same objects or NOT
		boolean result=(theCoach== alphaCoach);
		
		// print the results
		System.out.println("\n pointing to the same object :" +result);
		System.out.println("\n memory location for theCoach :" +theCoach);
		System.out.println("\n memory location for the alphaCoach :" +alphaCoach+"\n");
	
		// close context
		context.close();
	
	}
	

}
