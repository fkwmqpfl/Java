package com.yedam.java.chapter0702;

public class Application2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right",10);
		Tire KTire = new KumhoTire("left",20);
		
		//Tire 객체에 자식 객체인 hTire
		//Tire -> 한국 타이어를 사용하고 있다.
		Tire tire = hTire;//부모클래스인 tire를 쓰되 자식클래스에서 오버라이딩되었으며 그걸쓰겠다
		System.out.println(tire.roll());
		
		tire = KTire;
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
		//하나의 타입(tire)으로 다양한 결과를 내고있음 =다향성
	}

}
