package com.yedam.java.chapter0801;

public class WashingExample {
	
	public static void main(String[] args) {
		washing(new LGWashingMachine());
		//washing(new SamsungWashingMachine());
	}
	//메소드					//(매개변수)
	public static void washing(WashingMachine wm) {//	WashingMachine wm = new LGWashingMachine();
												   //	WashingMachine wm = new SamsungWashingMachine();
		wm.startBtn();
		System.out.println("세탁기 속도는 "+wm.changeSpeed(3));
		wm.stopBtn();
	}
}
