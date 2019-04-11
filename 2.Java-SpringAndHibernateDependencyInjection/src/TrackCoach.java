 

public class TrackCoach implements Coach {
	
	//defining private field for dependency 
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5 k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it"+fortuneService.getFortune();
	}
	
	
	//add init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach :inside method doMyStartUpStuff");
	}
	//add destroy method
	public void doCleantUpStuff() {
		System.out.println("TrackCoach :inside method doCleantUpStuff");
	}
	
	

}
