package com.yedam.java.ch0201;

public class VariableExample {
	public static void main(String[] args) {
		//주석처리 2022-11-03
		/*변수의
		 사용범위*/
		int value1 = 15;
		int value2 = 0;
		if(value1 > 10) {
			value2= value1 -10;
			
		}
		int result = value1 + value2 +5;
		
		System.out.println(value1+","+value2+","+result);
		
		/***/
		int v1 = 0;
		if(v1 == 0) {
			v1=1;
			int v2= 0;
			if(v2 ==0) {
				v2 = 2;
				int v3 = v1+v2;
				System.out.println(v1+"+"+v2+"="+v3);
			}
			System.out.println(v1+"+"+v2+"="+v3); //v3를 선언한곳이 같은 중괄호{}안에 있지않다
		}
		System.out.println(v1+"+"+v2+"="+v3);
	}

}
