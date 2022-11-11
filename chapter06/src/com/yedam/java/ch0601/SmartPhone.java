package com.yedam.java.ch0601;

public class SmartPhone {
	//필드
	//해당 클래스의 속성(정보)
	String name;
	String maker;
	int price;
	
	
	//생성자
	
	//메소드
	void call() {
		System.out.println(name + "전화를 겁니다.");
	}
	void hangUp() {
		System.out.println(name + "전화를 끊습니다.");
	}
	
}
