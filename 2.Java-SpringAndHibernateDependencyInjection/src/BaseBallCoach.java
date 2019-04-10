

public class BaseBallCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	 public BaseBallCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune
		
		return fortuneService.getFortune();
	}

}
