package com.yedam.java.chapter0801;

public class MyClass {
	
	//필드
	//1)
	//public int a =1;
	//rc=참조타입
	RemoteControl rc = new Television();
	//생성자
	public MyClass() {
		
	}
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	//메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	void methodB(RemoteControl rc) {//매개변수 오디오같은거넣어주면 구현)
		rc.turnOn();
		rc.turnOff();
	}
	
	
	
	

}
