package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대 자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자
	//public Car(String model, String color) {
	//	this.model = model;		//this = 인스턴스를 뜻함				not 클래스
	//	this.color = color;
	//}
	
	public Car() {
		
	}
	public Car(String model) {
		this(model ,"은색",250);
	}
	public Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		//System.out.println("인스턴스를 생성했습니다.");
		this(model, color, 250);	//this를생성하기전에 다른생성자가 있으면 실행될 수 x
	}
	public Car(String model, String color ,int axSpe) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
