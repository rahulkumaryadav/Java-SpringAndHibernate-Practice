package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	//create an array of string
	private String data[]= {
			"rahul Yadav",
			"Jijesh",
			"dinesh"
	};
	
	private Random myRandom=new Random();

	@Override
	public String getFortuneService() {
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
