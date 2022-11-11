package com.java.yedam.bank;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		//1) 각 필드를 저장할 수 있는 getter, setter 작성---
		//2) 모든 정보를 출력할 수 있는 메소드 하나 작성---
		//3) School 클래스 만들고 main을 작성해서 학생의 정보를 넣는 프로그램
		//4) 학생 수를 입력 받고, 각 필드의 데이터를 받아와서 학생 정보가 담긴 프로그램
		//5) 모든 정보를 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Student[] std=new Student[count];
		for(int i=0;i<std.length;i++) {
			//빈객체
			Student student = new Student();
			//학생이름
			System.out.println("학생이름 > ");
			String sName=sc.nextLine();
			student.setsName(sName);
			//학생번호
			System.out.println("학생번호 > ");
			String sNo=sc.nextLine();
			student.setsNo(sNo);
			//국어
			System.out.println("국어 > ");
			int kor=Integer.parseInt(sc.nextLine());
			student.setKor(kor);
			//수학
			System.out.println("수학 > ");
			int math=Integer.parseInt(sc.nextLine());
			student.setMath(math);
			//영어
			System.out.println("영어 > ");
			int eng=Integer.parseInt(sc.nextLine());
			student.setEng(eng);
			
			std[i]=student;
		}
		for(int i=0;i<std.length;i++) {
			std[i].getInfo();
		}
		/* =====getInfo 없이 넣을경우=====	
		  	for(int i=0;i<std.length;i++) {
		  		System.out.println("학생 이름 > " +std[i].getsName());
		  }
		  */
		
	}
}
