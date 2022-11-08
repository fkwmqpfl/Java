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
		
		int[] scores = {83, 90,87};
		
		System.out.println("scores[0] : "+scores[0]);
		System.out.println("scores[1] : "+scores[1]);
		System.out.println("scores[2] : "+scores[2]);
		
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg=sum/3.0;
		System.out
		.println("평균 : "+avg);
		
		//주의사항
		int[] scoreList;
		scoreList= new int[]{83, 90, 87};			//	scoreList= {83, 90, 87};
		
	}

}
