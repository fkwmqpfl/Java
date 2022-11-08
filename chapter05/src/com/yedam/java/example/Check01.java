package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제1) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = { 10, 53, 26, 85, 75 };
		int sum=0;
		int Max=array[0];
		int Min=array[0];
		
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("합계 :"+sum);
		double avg=(double)sum/array.length;
		System.out.printf("평균 :%.2f\n",avg);
		
		//문제2) 배열의 최대값과 최소값을 구하세요.
		
		for(int i=0;i<array.length;i++) {
			if(Max<array[i]) {		//최대먼저
				Max=array[i];
			}
			if(Min>array[i]) {
				Min=array[i];
			}
		}
		System.out.println("최대값 :"+Max);
		System.out.println("최소값 :"+Min);
		
		//문제3) 문제2에서 구한 최대값과 최소값이 각각 "몇번째 값"인지 구하세요
		int MaxIndex = 0;
		int MinIndex = 0;
		for(int i=0;i<array.length;i++) {
			if(Max==array[i]) {
				MaxIndex=i;
			}
			if(Min==array[i]) {
				MinIndex=i;
			}
		}
		System.out.println("최대값은 "+(MaxIndex+1)+"번째 값");
		System.out.println("최소값은 "+(MinIndex+1)+"번째 값");
		
		
	}

}
