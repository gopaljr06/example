package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

	
	 char op;

	public double getCal(char op) {
	    double num1=25;
	    double num2=20;
	 this.op=op;
	 double o = 0;

	 switch (op) {
	 // case to add two numbers
	 case '+':
	     o = num1 + num2;
	     break;

	 // case to subtract two numbers
	 case '-':
	     o = num1 - num2;
	     break;

	 // case to multiply two numbers
	 case '*':
	     o = num1 * num2;
	     break;

	 // case to divide two numbers
	 case '/':
	     o = num1 / num2;
	     break;

	 default:
	     System.out.println("You enter wrong input");
	 }

	 System.out.println("The final result:"+ o);
	 System.out.println();

	 // print the final result
	return o;

	}

}
