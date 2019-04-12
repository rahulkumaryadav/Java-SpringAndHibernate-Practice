package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>>>> inside default constructor -->TennisCoach");
		}
	
	
	//define my init method
	@PostConstruct
	 public void doMyStartUpStuff() {
		 System.out.println(">> TennisCoach :inside of doMyStartUpStuff");
	 }
	//define my destory method
	@PreDestroy
	 public void doMycleanUpStuff() {
		 System.out.println(">> TennisCoach :inside of doMycleanUpStuff");
	 }
	
	
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService; }
	 */

	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */



	@Override
	public String getDailyWorkOut() {
			return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
