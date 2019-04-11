import org.springframework.context.support.ClassPathXmlApplicationContext;

public class literalInjectionAppDemo {
	public static void main(String[] args) {

		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("literalInjectionApplicationContext.xml");

		//retrieve bean from spring container
		CricketCoach cricketCoach= context.getBean("myCricketCoach",CricketCoach.class);

		 //call method on bean 
		 System.out.println(cricketCoach.getDailyFortune());
		 System.out.println(cricketCoach.getDailyWorkout());
		 
		 
		 //call new method to get literals
		 System.out.println(cricketCoach.getEmailAddress());
		 System.out.println(cricketCoach.getTeam());
		 
		 
		 //close the context
		 context.close();

	   }

}
