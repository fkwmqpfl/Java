package com.yedam.java.chapter0801;

public class Driver {

	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; // 강제타입변환
			bus.checkFare();
		}
		vehicle.run();
	}
}
