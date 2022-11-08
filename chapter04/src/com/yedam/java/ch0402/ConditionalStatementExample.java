package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		//for문
		//1부터 10까지 출력
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		
		int x =1;
		for(;x<=100;x+=15) {
			System.out.println("출력");
		}
		System.out.println("x: "+x);
		
		for(int i = 0,j=100; i<=50 && j>=50; i++ , j--) {
			
		}
		
		//1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum=0;
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("1~100까지의 합계: "+sum);
		
		//float 타입 카운터 변수
		for(float f =0.1f; f<=1.0f;f+=0.1f) {
			System.out.println(f);
		}
		//가능하면 int로 만들어야함
		
		//구구단 2~9단까지 출력
		for(int i=2;i<=9;i++) {
			System.out.println("***"+i+"단***");
			for(int j=1; j<=9;j++) {
				System.out.println(i + "X" +j+"="+ i*j);
			}
		}
		
		//while 문 
		//1~10까지 출력
		int count=1;
		while(count<=10) {
			System.out.println(count);
			count++;
		}
		
		count=0;
		while(count<=9) {
			count++;
			System.out.println(count);
			
		}
		
		//1부터 100까지 출력, 1부터 100까지 합을 출력
		
		count=1;
		while(count <=100) {
			System.out.println(count);
			sum+=count;
			count++;
		}System.out.println("1~"+ (count-1)+"까지 합 : " + sum);
		
		//주사위 두개를 굴립니다. 합이 3일 경우에 계속 굴리는 경우 ==>횟수가 불분명하므로 while이 더 적합
		
		//while 문 연습
		int index = 1;
		while(index !=1) {
			System.out.println("while 반복문이" +index + "번 실행");
		}
		do {															//do~while은 무조건 헌븐은 실행해서 result값이 한 번 나온다
			System.out.println("while 반복문이" +index + "번 실행");
		} while (index != 1);

		//break로 while문 종료
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) break;
		}
		
		//이중 for문에서 break문 사용
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			boolean result =false;
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					result =true;
					break;
				}
			}
			System.out.println("1)안쪽 for문 종료");
			if(result)break;//밖의 for문을 멈추고 if를 한 번 돈다
		}
		System.out.println("2)바깥쪽 for문 종료");
		
		System.out.println("=====================================================");
		
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; //밖의 for문에 이름을 적어서 멈춤
				}
			}
			System.out.println("1)안쪽 for문 종료");
		}
		System.out.println("2)바깥쪽 for문 종료");
		
		//continue
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	
}
