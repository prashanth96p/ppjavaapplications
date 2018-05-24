package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;

	// create a no arg constructor
	public CricketCoach() {
		System.out.println("we are in side  no arg constructor in cricketCoach class ");
	}
	
		public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		
		System.out.println("cricketCoach: Inside Setter Method- setEmailAddress ");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		
		System.out.println("cricketCoach : inside steer method -setTeam ");

		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		
		return "pracftice fast bowling for 15 min";
	}
	// create setter  methods for injection
	
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("we are in side setter method in cricketCoach class ");

		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}

}
