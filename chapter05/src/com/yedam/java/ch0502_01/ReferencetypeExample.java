package com.yedam.java.ch0502_01;

public class ReferencetypeExample {

	public static void main(String[] args) {
		//배열을 선언 -> 모든 타입을 값으로 가질 수 있음
		int[] intAry = null;
		//System.out.println("intAry[0] : " + intAry[0]);
		/*User user = new User();
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;
		*/
//		 let user = {
//				 name : '홍길동',
//				 age=25,...  	//자바스크립트
//		 }
//		
		
		int[] scores = {83, 90,87};
		
		System.out.println("scores[0] : "+scores[0]);
		System.out.println("scores[1] : "+scores[1]);
		System.out.println("scores[2] : "+scores[2]);
		
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg=(double)sum/scores.length;
		System.out
		.println("평균 : "+avg);
		
		//주의사항
		int[] scoreList;
		scoreList= new int[]{83, 90, 87};			// scoreList= ""new int[]"" {83, 90, 87};
		
		sum = 0;
		for(int i=0; i<3; i++) {
			sum =sum + scoreList[i];
		}
		System.out.println("총합 : "+sum);
		sum= add(new int[] {83,90,87});
		//new 연산자로 배열 생성
		int[] array = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("array["+i+"] : "+array[i]);
		}
		String[] strAry = new String[4];
		for(int i=0; i<strAry.length; i++) {
			strAry[i] = String.valueOf(i);
		}
		for(int i=0; i<strAry.length; i++) {
			System.out.println("strAry["+i+"] : "+ strAry[i]);
		}
				
				
	}

	private static int add(int[] numList) {
		
		int sum = 0;
		for(int i=0; i<numList.length; i++) {
			sum += numList[i];
		}
		return sum;
		
	}

}
