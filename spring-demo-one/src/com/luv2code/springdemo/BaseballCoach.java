package com.luv2code.springdemo;

public class BaseballCoach implements  Coach {
	
	// define private field for dependency
	  private FortuneService fortuneService;
	// define constructor
	  
	  public BaseballCoach(FortuneService theFortuneService) {
		  fortuneService = theFortuneService;
	  }
	
    @Override
	public String getDailyWorkout() {
		
		return "spend 30 min on batting practise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		// use my fortuneservice to get to fortune
		
				
		return fortuneService.getFortune();
	}
	
}
