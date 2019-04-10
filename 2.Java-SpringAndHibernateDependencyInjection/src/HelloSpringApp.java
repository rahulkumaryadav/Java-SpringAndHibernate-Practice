import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyFortune());
	}

}
