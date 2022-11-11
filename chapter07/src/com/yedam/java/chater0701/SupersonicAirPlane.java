package com.yedam.java.chater0701;

public class SupersonicAirPlane extends AirPlane{
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;

	@Override
	//자식 클래스 내부세어 재정의된 부모 클래스 메소드 호출해야하는 경우
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드입니다.");
		}else {
			super.fly();
		}
	}
	//오버라이드없이도 데리고 올 순 있다.
	public void test() {
		super.fly();
	}
	
	
	

}
