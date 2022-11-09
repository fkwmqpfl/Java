package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("최대 스피드 : "+ car1.maxSpeed);
		System.out.println("색 : "+car1.color);
		car1.run();
		
		System.out.println();
		
		
		Car car2 = new Car();		//new 그냥 새로운걸 만들어 냄
		System.out.println("최대 스피드 : "+ car2.maxSpeed);
		System.out.println("색 : "+car2.color);
		car2.run();
		
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조 합니다.");
		}else {
		System.out.println("car1과 car2는 서로 다른 객체를 참조 합니다");
		}
	}

}
