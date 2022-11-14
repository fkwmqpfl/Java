package com.yedam.java.chapter11;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//Key 클래스 객체 가져오기
		//1탄 - 직접 클래스 객체 가져오기
		Class clazz = Key.class;
		
		System.out.println(clazz);
		//2탄 - 경로를 통한 클래스 객체 가져오기
		Class clazz2 = Class.forName("com.yedam.java.chapter11.Key"); 
		System.out.println(clazz2);
		
		//3탄 - 객체로부터 클래스 객체 얻기
		Key key = new Key(1);
		
		Class clazz3 = key.getClass();
		
		System.out.println(clazz3);
		
		String photoPath = clazz.getResource("미소강아지.jpg").getPath();	//같은경로에 있어서 찾을 수 있음
		System.out.println(photoPath);
		
	}
}
