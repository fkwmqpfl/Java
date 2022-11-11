package com.yedam.java.chater0701;

public class Application {
	public static void main(String[] args) {
		//Child인스턴스화
		Child child = new Child();
		
		//자식 클래스 고유 필드
		child.lastName ="paul";
		child.age=20;
		
		//부모 클래스 필드
		System.out.println(child.firstName +" "+ child.lastName);
		
		
		//부모 -> 여러명의 자식 O
		//자식 -> 여러명의 부모 X
		
		DmbCellPhone dmb = new DmbCellPhone("고아라폰","화이트",10);
		//부모 클래스 필드 사용
		System.out.println("모델 : "+dmb.model);
		System.out.println("색상 : "+dmb.color);
		//자식 클래스 필드 사용
		System.out.println("채널 : "+dmb.channel);
		
		dmb.powerOn();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("안녕하세요 전 누구입니다.");
		dmb.powerOff();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		Member member = new Member("이누구","1234-5678",1);
		
		//부모 객체의 필드 사용
		System.out.println("name : "+member.name);
		System.out.println("ssn : "+member.ssn);
		
		//자식 객체의 필드 사용
		System.out.println("memberNo : "+member.stdNo);
		
		Child cd = new Child();
		
		cd.method1();
		cd.method2();
		cd.method3();
		
		Compute com = new Compute();
		
		double result = com.areaCircle(10);
		System.out.println("result : "+result);
		System.out.println("=====================================");
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode= SupersonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		
		sa.fly();

		sa.land();
		
		System.out.println("=====================================");
		
		Child chd = new Child();
		//Parent parent = new Child();
		//부모 클래스에 있는 필드, 메소드를 사용을 하되 만약 자식 클래스에 오버라이딩이 되어있는 메소드가 존재한다면,
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용
		Parent parent = chd;	//부모타입것만 쓸 수 있음
		
		parent.method1();	//자식클래스에서 오버라이딩한거라 자식에서 빼옴
		parent.method2();	
		//parent.method3();	//클래스가 자식이아닌 부모타입이고 method3은 자식의 메소드라 불러내지못함
		
	}

}
