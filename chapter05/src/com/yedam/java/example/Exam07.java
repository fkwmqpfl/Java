package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		//로또 번호를 예측하는 프로그램 -6개
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] numList = null;
		int count = 0;
		
		while(run) {
			System.out.println("==============================================================");
			System.out.println(" 1.새로고침 | 2.번호예측 | 3.번호삭제 | 4.번호출력 | 5.분석 | 6.종료");
			System.out.println("==============================================================");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {			//로또번호를 담을 수 있는 배열 초기화
				numList= new int[6];
				count = 0;
			}else if(selectNo ==2) {	//1~45 중에 랜덤한 값을 가져옴
				if(count<numList.length) {	
					int num=(int)(Math.random()*45)+1;
					numList[count++]=num;	//count가 인덱스 역활을 하게됨
					System.out.println("현재 가져온 수의 갯수 :"+count);
				}else {
						System.out.println("더이상 숫자를 가져올 수 없습니다.");
					}
			}else if(selectNo ==3) {	//기존에 값 중 가장 최근 값을 하나 삭제
				//count = 6 -> index = count-1
				numList[--count] = 0;	//삭제가 없으니 0으로 초기화
				System.out.println("현재 가져온 수의 갯수 :" + count);
			}else if(selectNo ==4) {	//배열의 값을 전부 출력
				System.out.println("현재 가지고 있는 수의 갯수 :"+count);
				for(int i=0; i< count; i++) {	//비어있는값이 있을경우 0이 출력되므로 count까지만 출력
					System.out.print(numList[i]+" ");
				}
				
			}else if(selectNo ==5) {	//중복유무와 중복된 값이 몇 번 중복되었는지 =======================☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
				int[] list = new int[45];
				for(int i=0; i < count; i++) {		//각 값이 몇개씩인지
					int index = numList[i]-1;	//ex) numList[0]=5이면 index값은 -1하여 4
					list[index]++;				//		4가있다고 등록 =list[4]의 자리에 count+1되는것
				}
				//개표상황을 정리해서 보여줌
				boolean isChecked = false;				//중복되는값이 x
				for(int i=0; i < list.length; i++) {
					if(list[i] <= 1) continue;	//0은 필요x
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n",(i+1),list[i]);
					isChecked =true;				//중복되는값이 있다
				}
				if(!isChecked) System.out.println("중복 값이 존재 하지 않습니다.");
			}else if(selectNo ==6) {	//종료
				run =false;
			}else {
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		
		
	}
}
