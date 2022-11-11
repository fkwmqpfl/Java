package com.java.yedam.bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		//은행 고객 정보를 관리하는 클래스
		//1) main 2) Customer 3) Bank
		//1) main -> 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당은행의 금리를 저장
		//		(현재 잔액 + (현재 잔액*금리))
		//3) Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액의 필드
		//getInfo() : 입력한 정보 출력
		//withDraw() : 출금 할 때 정보를 출력
		
		Scanner sc= new Scanner(System.in);
		
		
		Customer customer1= new Customer();
		customer1.name="abc";
		customer1.BName="aBank";
		customer1.count="11-222-33";
		customer1.money=123456;
		
		Bank cust1=new Bank();
		
		
		customer1.getInfo();//고객정보출력
		customer1.withDraw();
		
		
		
	}

}
