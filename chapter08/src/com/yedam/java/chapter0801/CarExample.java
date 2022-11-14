package com.yedam.java.chapter0801;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();

		System.out.println("=======================");// 그냥 구별용 선

		myCar.frontLeftTire = new MichelinTire();
		myCar.frontRightTire = new MichelinTire();

		myCar.run();
	}

}
