package com.yedam.java.homework;

public class Human {
	//필드
	String name;
	double heigh;
	double weight;
	//생성자
	public Human(String name, double heigh, double weight) {
		this.name=name;
		this.heigh=heigh;
		this.weight=weight;
	}
	
	//메소드
	public void getInformation() {
		System.out.printf("%s님의 신장 %f, 몸무게 %f",name,heigh,weight);
	}

}
