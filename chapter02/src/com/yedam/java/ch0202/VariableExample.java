package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// byte 타입
		byte var1 = -128;
		byte var2 = 127;
		byte var3 = 0;
		byte var4 = -30;
		//byte var5 = 100.0; //type이 맞지않음
		//byte var6 = 128; //byte의 범위는 -128~127까지이므로 변수형이 맞지않다
		System.out.println(var1);
		//System.out.println(var5);
		long var6 = 10000000000L;	//자바에서 들어오는 모든 수는 int로 먼저 인지하기때문에 오류가 남 오류가 남지않을려면 int의 범위를 벗어난다고 L(소문자도 가능)을 적어야함
		long var7 = 100000;			//int의 범위를 넘지않았기때문에 굳이 L을 붙여주지 않아도 괜찮다
		
		//char 타입 한글자씩만 가능
		char v1 = 65; //char = ''    유니코드상 65 = A		97 = a
		char v2 = '가'; 
		int v3 = v1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//String은 클래스지만 일반적인타입으로 사용가능
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));
		
		//char VS String
		char v4='A'; //""는 안됨 '' 안에 공백도안됨
		String v5 = "-"; //""로 감싸줘야함
		
		String str1 = "누군가 \"안녕\"하면서 인사했다.";
		System.out.println(str1);
		
		//float
		float num1 = 3.14F; //f를 붙이지않으면 float으로 인지하지 못한다. 자바에서 실수이 default는 double
		double num2 = 3.14;
				
		float varF = 0.1234567890123456789f;
		double varD = 0.1234567890123456789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		
		boolean stop =(1>2); //or false;
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다.");
		}
		
		
		
	}

}
