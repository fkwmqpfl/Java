package com.java.yedam.bank;

public class Customer {
	//3) Customer -> 고객의 정보를 저장
	//이름, 은행명, 계좌, 잔액의 필드
	String name;
	String BName;
	String count;//계좌
	int money;//잔액
	
	
	void getInfo() {
		System.out.println("이름 : "+name);
		System.out.println("은행 : "+BName);
		System.out.println("계좌 : "+count);
		System.out.println("잔액 : "+money);
	}
	void withDraw() {
		System.out.println("금리: "+(Bank.Pe+100)+"%");
		System.out.println("예상금액 : "+((money)+(money*Bank.Pe)));
	}
	
}
