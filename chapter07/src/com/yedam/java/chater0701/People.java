package com.yedam.java.chater0701;

public class People extends Student{
	//필드
	public String name;
	public String ssn;
	//생성자
	//부모클래스 생성자가있어서 main에 super를 써야함
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//메소드

}
