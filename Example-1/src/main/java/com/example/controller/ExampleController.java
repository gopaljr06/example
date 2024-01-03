package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ExampleService;

@RestController
public class ExampleController {

	@Autowired ExampleService exp;
	
	 @GetMapping("/hello")
	  public static String getHello()
	   {
	    return "Hello";
	   }
	  @GetMapping("/cal")
	  public double cal() {
		  
		  return exp.getCal('*');
		  
	  }
}
