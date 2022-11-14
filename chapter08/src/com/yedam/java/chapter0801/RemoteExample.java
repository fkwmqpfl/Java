package com.yedam.java.chapter0801;

public class RemoteExample {
	public static void main(String[] args) {
		//TV를 객체로 해서 만듬
		RemoteControl rc = new Television();//인터페이스 객체를 만들어서함
		//
		rc= new Audio();
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		//쓰기,읽기,리스트 조회
		
		
		Television tv = new Television();//자기자신만 만들어서함
		
		tv.turnOn();
		tv.setVolume(11);
		tv.turnOff();
		
		Search search = new Television();
		
		search.search("google.com");
		
		
		/*
		 * public void temp(RemoteControl rc){
		 * }
		 * 
		 * public void temp(Television tv){
		 * }
		 */
		
		//추상 클래스 vs 인터페이스
		//추상 클래스(extends) 	-> 필드, 생성자, 메소드
		//인터페이스(implements)	-> 상수, 추상 메소드
		//      -부모클래스를 객체화(메모리에 넣지않고)하지않고 만들 수 있음	
		
		
	}
}
