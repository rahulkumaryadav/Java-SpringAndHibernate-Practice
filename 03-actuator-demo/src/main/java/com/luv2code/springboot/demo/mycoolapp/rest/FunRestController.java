package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world ! Time on server is "+LocalDateTime.now();
	}
	
	//expose a new endPoint for "workOut"
	@GetMapping("/workout")
	public String getDailyWork() {
		return "Run a hard 5k!";
	}

	//expose a new endPoint for "workOut"
		@GetMapping("/workout2")
		public String getDailyWork2() {
			return "Run a hard 10k!";
		}
}
