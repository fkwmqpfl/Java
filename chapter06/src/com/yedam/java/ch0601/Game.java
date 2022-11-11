package com.yedam.java.ch0601;

public class Game {

	// 필드
	//객체로 만든다(인스턴스화로 된다)
	//인스턴스 필드
	static String gameName = "마인크래프트";			//마인크래프트에대해 정보를 만들거면 계속 반복될것이므로 미리 넣어놓은것
	String server = "한국";					//미리 정의
	String id;
	String passWd;

	// 생성자
	public Game() {

	}

	public Game(String id) { // 오버로딩 같은 이름을 가진 생성자라도 원하는 매개변수를 지정해 넣으면 여러개 만들 수 있다.
		this.id = id;
	}

	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}

	// 메소드
	//인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : "+ gameName);
		System.out.println("id : "+id);
		System.out.println("password : "+passWd);
	}
	void getInfo(String temp) {								//메소드도 뒤에 매개변수에 따라 오버로딩 가능
		
	}

}
