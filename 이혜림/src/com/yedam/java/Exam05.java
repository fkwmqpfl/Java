package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[] cntNumbers = null;
		int nb=0;
		int d=(int)(Math.random()*nb)+1;
		int cnt = 0;
		
		while(run) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴 > ");
			int sn = Integer.parseInt(sc.nextLine());
			if(sn==1) {
				System.out.println("주사위 크기 > ");
				nb=Integer.parseInt(sc.nextLine());
				if(nb<5) {
					System.out.println("크기가 작습니다. 5~10을 입력해주세요");
				}else if(nb>10) {
					System.out.println("크기가 큽니다. 5~10을 입력해주세요");
				}
				
			}else if(sn==2){
				
					while(d!=5) {
					
					d=(int)(Math.random()*nb)+5;
					cnt+=1;
					//System.out.println(d);
					
					} 
		
					cntNumbers = new int[cnt];//배열크기
					for(int i=0;i<cntNumbers.length;i++) { 
					int dice =d;
					cntNumbers[i]=dice;
				
						//배열에 넣기
					}
					System.out.printf("5가 나올 때까지 주사위를 %d번 굴렸습니다.\n",cnt);
				
			}else if(sn==3){
//				
				for(int i=1; i<(nb+1);i++) {
					System.out.printf("%d은 %d\n",i,cntNumbers[i]);
				}
			}else if(sn==4){
				
			}else if(sn==5){
				System.out.println("프로그램 종료");
				run =false;
			}
		}

	}

}
