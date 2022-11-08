package com.yedam.java.ch0502_01;

import java.util.Scanner;

public class BankPrint {

	public static void main(String[] args) {
		boolean run =true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			/*
			int num1 = Integer.parseInt(scanner.nextLine());
			int num2 = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo) {
			case 1:
				System.out.println("선택 : 1");
				System.out.println("예금액 : "+num1);
				
			case 2:
				System.out.println("선택 : 2");
				System.out.println("출금액 : "+num2);
			
			case 3:
				System.out.println("선택 : 3");
				System.out.println("잔고 : "+(num1 - num2));
			case 4:
				System.out.println("선택 : 4");
				break;
			}
			*/
			if(selectNo == 1) {
				//메뉴 : 예금
				System.out.print("예금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
			}else if(selectNo == 2) {
				System.out.print("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
			}else if(selectNo ==3) {
				System.out.println("잔고> "+balance);
			}else if(selectNo==4) {
				run=false;
			}else {
				//기타입력
				System.out.println("정해진 메뉴(1~4)에 없습니다.");
			}
		}
		System.out.println("프로그램 종료");

	}

}
