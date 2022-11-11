package com.yedam.java.ch0601;

public class Singleton {
	
	//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
	//단 하나의 객체를 만듬
	private static Singleton singleton = new Singleton();//new로만들어서 singleton에 주소가 있음
							//singleton = new Singleton
	private Singleton() {
	//객체를 못만들도록 막음	
	}
	
	
	public static Singleton getInstance() {
		return singleton;
		//singleton = new Singleton()
	}
	
	//ex)추가하고 다른곳에서 불러서 쓴다.
	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다.");
	}

}
