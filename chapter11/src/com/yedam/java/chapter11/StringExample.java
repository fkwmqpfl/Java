package com.yedam.java.chapter11;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1"; //ex) 주소 : 100
	// String c = "1"; // 100
	// String b = new String("1");//주소 : 200

	// 바이트 -> 문자열
	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		System.out.println(str1);

		// String str2 = new String(바이트 배열, 시작점, 갯수);
		String str2 = new String(bytes, 6, 4); // 6번째 자리에서부터 4개만 들고와라
		System.out.println(str2);

		// String 메소드
		// 1) charAt(index) - 특정 문자 위치를 반환

		String ssn = "123456-278910";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";

		// 주소 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		// 값을 비교
		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		//바이트 배열로 변환
		byte[] bytes2=null;
		String str = "안녕하세요";
		bytes2 = str.getBytes();
		
		System.out.println(bytes2.length);		//한글은 1글자당 3bytes라서 15개가온다
		
		String str3 = new String(bytes2);		//하나로 디코딩 한 뒤 넣어줌
		System.out.println("bytes2 -> String"+str3);
		
		try {
			byte[] bytes3 = str.getBytes("EUC-KR");		
			System.out.println("bytes3.length : "+bytes3.length);
			
			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> String"+str4);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//문자열 찾기
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		
		System.out.println(index);	//3
		
		index = subject.indexOf('a');
		System.out.println(index);
		
		//문자열의 문자 개수 얻기
		
		System.out.println(subject.length());
		
		//문자열 위치 변경
		
		String oldStr="자바 프로그래밍";
		String newStr = oldStr.replace("자바","Java");
		//Java 프로그래밍
		System.out.println(newStr);
		
		//oldStr ="자바"			//100번지
		//oldStr = "프로그래밍		//200번지
								//300번지
		//oldStr = "재밌다."
		
		
		//Stringbuilder 또는 buffer
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2=new StringBuffer();
		
		
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append(123);
		
		System.out.println(sb);
		
		//대소문자 바꾸기
		
		String strVal = "asdfkjoeflz";
		String strVal2= " AKLWHEOIFHZ";
	
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		//trim
		String strTrim="자바";
		System.out.println("strTrim");
		System.out.println(strTrim.trim());
		
		//substring()
		//substring(index, end)
		//index부터 end까지 짜르세요
		//substring(index)
		//index부터 끝까지 짜르세요
		
		String ssn2 = "880815-1234567";
		
		String firstNum= ssn2.substring(0, 6);
		
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//split()
		String strSplit = "1-1-1-1-3-4-5-6-7-8-9-2";
		
		String[] strAry = strSplit.split("-");
		
		for(String temp: strAry) {
			System.out.println(temp);
		}
		
		//문자열 변환
		
		//숫자나, 소수, 불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);

	}

}
