package com.yedam.java.ch0601;

public class GameExample {
	public static void main(String[] args) {
		
		Game user1 = new Game();
		user1.id="yedam";
		user1.passWd="1234";
		
		Game user2 = new Game("yedam2");
		user2.passWd="4321";
		
		Game user3 = new Game("yedam3","4567");
		
		user1.getInfo();
		user2.getInfo();
		user3.getInfo();
		
		//static(정적, 고정)필드 사용
		System.out.println("====static 필드 호출 =====");
		System.out.println(Game.gameName);
		
	}
}
