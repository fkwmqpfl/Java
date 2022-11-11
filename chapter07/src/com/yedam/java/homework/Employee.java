package com.yedam.java.homework;

public class Employee {
	//필드
	String name;
	int money;
	//생성자
	public Employee(String name,int money) {
		this.name=name;
		this.money=money;
		
	}
	//메소드
	public String getName() {
		System.out.println("이름 : "+name);
		return name;
	}
	public int getMoney() {
		System.out.println("연봉 : "+money);
		return money;
	}
	
	public void getInformation() {
		//이름과 연봉을 출력하는 기능
	
		System.out.println("이름 : "+name+"\t연봉 : "+money);
	}
	public void print() {
		//"수퍼클래스"란 문구를 출력하는 기능
		System.out.println("수퍼 클래스");
	}

}
