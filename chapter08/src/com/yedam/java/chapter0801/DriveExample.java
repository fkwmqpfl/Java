package com.yedam.java.chapter0801;

public class DriveExample {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);// ()속 매개변수bus는 Driver클래스의 drive(Vehicle vehicle)속 vehicle에 들어가게됨 vehicle은
							// Vehicle인터페이스에 상속받고있는상태
		driver.drive(taxi);

		Vehicle vhc = new Bus();
		
		vhc.run();
		//vhc.checkFare();   재정의 되지 않았음->자동타입변환의 성격
		//강제 타입 변환
		Bus bus2 = (Bus) vhc;
		bus2.checkFare();
		
		//객체 타입 확인
		//instanceof
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
	}
}
