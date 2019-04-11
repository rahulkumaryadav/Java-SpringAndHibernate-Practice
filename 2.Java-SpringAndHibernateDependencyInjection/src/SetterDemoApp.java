


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {

	
	//load the spring configuration file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("setterApplicationConfig.xml");

	//retrieve bean from spring container
	CricketCoach cricketCoach= context.getBean("myCricketCoach",CricketCoach.class);

	 //call method on bean 
	 System.out.println(cricketCoach.getDailyFortune());;
	 System.out.println(cricketCoach.getDailyWorkout());;
	 
	 //close the context
	 context.close();

   }
}
