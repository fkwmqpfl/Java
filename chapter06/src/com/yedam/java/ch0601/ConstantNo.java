package com.yedam.java.ch0601;

public class ConstantNo {

	// 필드
	static final double PI = 3.14;				//static + final 이라 대문자
	static final int EARTH_ROUND = 46250;
	static final int LIGHT_SPEED = 127000;

	String words = "This is Java";
	char word = 'Y';
	// 생성자

	// 메소드
	// static 멤버에 사용 범위(scope)

	// static 메소드
	static void getCircle(int radius) {	//radius 는 바뀔값이므로 매개변수radius를 넣음
		// pi *r*r
		System.out.println("원 넓이 : " + (PI * radius * radius));
	}
	
	//메소드에 static 필드 호출
	public void allData() {
		//double result = pi + earthRound + lightSpeed;
		System.out.println(result);
		getCircle(1);
	}
	//static 메소드에 일반 필드, 메소드 사용
	/*public static void words() {
		String getWord = words + String.valueOf(word);		//static타입에 일반 필드랑 메소드 사용불가
	}*/

}
