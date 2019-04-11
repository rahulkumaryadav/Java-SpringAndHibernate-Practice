import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		//load spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext2.xml");
		
		
		//retrieve bean from container
		Coach coach=context.getBean("myCoach",Coach.class);
		
		
		
		//close the context
		context.close();

		
		
	}

}
