import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		//load spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from container
		Coach coach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);

		//check if they are same
		boolean result =(coach==alphaCoach);
		
		System.out.println("\nPointing to the same object "+result);
		
		System.out.println("\nMemory location for the coach"+coach);
		
		System.out.println("\nMemory location for the coach"+alphaCoach);

		
		
	}

}
