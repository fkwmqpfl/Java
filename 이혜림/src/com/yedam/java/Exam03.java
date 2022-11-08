package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int total=0;
		
		if(operator=='+') {
			total=num1+num2;		
		}
		if(operator == '-') {
			total=num1-num2;
		}
		if(operator=='*') {
			total=num1*num2;
		}if(operator == '/') {
			total=num1/num2;
		}
	}
}
