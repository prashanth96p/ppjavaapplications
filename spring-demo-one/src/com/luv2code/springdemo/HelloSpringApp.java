package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//load spring configuration
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Retrieve Bean from Container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		// Retrieve java beans
		System.out.println(theCoach.getDailyWorkout());
		
		// lets call our new method
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		
		context.close();
		
		
	}

}
