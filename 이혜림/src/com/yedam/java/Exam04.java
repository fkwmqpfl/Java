package com.yedam.java;

public class Exam04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9;i++) {//앞의 수
			for(int j=1; j<=i;j++) {
				int total= i*j;
				System.out.printf("%d X %d = %d\n",i,j,total);
			}
		}
	

	}

}
