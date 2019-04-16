package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		System.out.println("just for test");
		return "helloworld";
	}
	
	
	//add a controller method to read form data and 
	//add data to the model
	

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter from the form
		String theName=request.getParameter("studentName");
		
		//convert the data to all caps 
		theName =theName.toUpperCase();
		
		//create the message
		String result ="Yo"+theName;
		
		//add the message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
		
		
	}
	
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String theName,Model model) {
		
		//convert the data to all caps 
		theName =theName.toUpperCase();
		
		//create the message
		String result ="Hey my friend form v3"+theName;
		
		//add the message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
		
		
	}
	
	

}
