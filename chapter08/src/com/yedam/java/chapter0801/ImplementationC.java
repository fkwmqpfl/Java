package com.yedam.java.chapter0801;

public class ImplementationC implements InterfaceC{ //C가 A와B를 상속 받았기 때문에 A,B,C 다 구현해야한다.

	@Override
	public void methodA() {
		System.out.println("methodA 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("methodC 실행");
		
	}
	

}
