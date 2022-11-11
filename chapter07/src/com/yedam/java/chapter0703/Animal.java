package com.yedam.java.chapter0703;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다~");
	}
	
	public abstract void sound(); //추상은 내용이들어가기전에 종료됨 &무조건 오버라이딩해줘야함

}
