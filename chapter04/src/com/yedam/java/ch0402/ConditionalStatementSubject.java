package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제 1) 책 161 5번
		// for문을 이용해 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		String tree = "";
		for (int i = 1; i < 5; i++) {
			tree += "*";
			System.out.println(tree);
		}
		// 2중for문

		for (int i = 1; i <= 5; i++) { // line
			for (int j = 1; j <= i; j++) { // "*"출력
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제2) for문을 이용해서 1부터 100까지의 정수 중에서 2의 배수가 아닌 숫자의 갯수를 구하세요.
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				count += 1;
			}
		}
		System.out.println(count);

		// 문제3) 책p)161 4번
		// 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해 중
		// 첫번째로 구해지는 값을 (x,y) 형태로 출력
		// 단 x,y는 10이하의 자연수

		Outter: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("x의 값은:" + x + "\ty의 값은:" + y);
					break Outter;
				}
			}
		}
		System.out.println("=============================================================");
		// 문제4) do ~ while문과 Math.random() 함수를 이용
		// 1~10의 정수중 7이라는 수가 나올때까지 숫자를 출력
		int i;
		do {
			i = (int) (Math.random() * 10) + 1; // while을 쓰면 while밖에도 하나써놔야함
			System.out.println(i);

		} while (i != 7);

		System.out.println("=============================================================");

		// 문제5) 책 p)161 3번
		// while문과 Math.random() 함수를 이용
		// 2개의 주사위를 던졌을 때 숫자를 (숫자1,숫자2)로 출력
		// 숫자의 합이 5일 경우에 종료, 아닌 경우에는 계속 던짐
		// 최종으로 주사위를 몇번 던졌는지 확인
		// 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)
		/*
		 * int cnt = 0; int d1=(int)(Math.random()*6)+1; int
		 * d2=(int)(Math.random()*6)+1; int to= d1+d2; while(to!=5) {
		 * d1=(int)(Math.random()*6)+1; d2=(int)(Math.random()*6)+1;
		 * System.out.println(d1+","+d2); to= d1+d2; if(to!=5) {
		 * 
		 * cnt++; } } System.out.println("던진 수 :"+cnt);
		 */

		int cnt = 0;
		while (true) {
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6) + 1;
			cnt++;
			System.out.println(d1 + "," + d2);
			if (d1 + d2 == 5) {
				break;
			}
		}
		System.out.println("던진 수 :" + cnt);

		// 문제6) p161 문제6
		// * 	->1번째줄, 공백 3개, 별1개	=> 총 문자 4개
		// ** 	->2번째줄, 공백 2개, 별2개	=> 총 문자 4개
		// *** 	->3번째줄, 공백 1개, 별3개 	=> 총 문자 4개
		// **** ->4번째줄, 공백 0개, 별4개	=> 총 문자 4개

		for (int k = 1; k <= 4; k++) { // line
			for (int j = 1; j <= 4; j++) { // 하나의 라인에대한 문자 수
					if(j<=(4-k)) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}		
			}
			System.out.println();
		}

	}

}
