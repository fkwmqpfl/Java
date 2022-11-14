package com.yedam.java.chapter11;

import java.util.Scanner;

public class question01 {
	//1)문자열 뒤집기 ex)input:abc, output: cba
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		char ip;
//		for(int i=0; i<input.length();i++) {		//정방향
//			ip=input.charAt(i);
//			System.out.print(ip);
//		}
		for(int i=input.length()-1; 0<=i;i--) {		//역방향
			ip=input.charAt(i);
			System.out.print(ip);
		}
		
		
	
	
	
	//2)문자열 개수 세기
	//	아스키 코드 이용
	//	입력되는문자열에서 알파벳과 숫자의 갯수를 구하기
	//ex) input: 1a2v4b , output: 숫자 3개, 영어 3개
		for(int i=0; i<input.length();i++) {
			ip=input.charAt(i);
			if(ip<65) {
				
				
			}
			
		}

		
		
		
	//3)입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
	//-조건-
	//금년 기준으로 100년이 넘어간 경우는 제외 한다. 또한 생일은 신경쓰지 않는다.
	//(221114 -> 1922년 11월 14일 X, 2022년 11월 14일 O)
	//ex) input : 000510, output : 21살
		
		
		
	}
}
