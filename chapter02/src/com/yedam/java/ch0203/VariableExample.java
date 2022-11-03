package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		/*자동 타입 변환*/
		byte byteValue = 10;
		//char charValue = byteValue;		char는 음수가 없다
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : " +  intValue);
			
		intValue =50;
		long longValue = intValue;
		System.out.println("longValue : "+ longValue);
		
		longValue = 100;
		float floatValue =longValue;
		System.out.println("floatValue : "+ floatValue);
		
		floatValue= 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubelValue : "+ doubleValue);
		
		//강제 타입 변환
		intValue = 44032;
		charValue =(char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//정수 타입 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
		int result2= x+y;
		byte result3 = (byte)(x+y);  // x+y를 int로바꿔서 생각하기때문에 reuslt2가 byte면 오류가난다 int result2 = x+y하면 된다.
		System.out.println(result2 + ","+result3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		System.out.println("유니코드 : "+ intResult);
		System.out.println("출력문자 ㅣ "+(char)intResult);
		
		byte value1 = 10;
		int value2 =100;
		long value3 =1000L;
		long longResult = value1 + value2 + value3;
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		double plusV1 =intV1 + doubleV1;
		
		int intVar1 = 10;
		//int resultVar1 =intVar1/4;
		double resultVar1 =intVar1/4.0;
		//intVarl/4 int끼리의 연산이기때문에 resultVar1가기전에 이미 2인값을주기때문에 실수로만들어도 2.0만출력된다. 2.5가나올려면 intVar1또는 4 둘중하나가 실수형이어야한다.
		System.out.println("10/4 결과 : "+(resultVar1));

		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1/y1;
		System.out.println("1/2 결과 : "+result1);
		
		//문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);		//result: 20
		
		String str1 = 10 + 2 + "8";		//result: 128
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);		//result: 1028		문자로 인식
		
		String str3 = "10" + 2 + 8;		//result: 1028		문자로 인식
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8);	//result: 1010
		System.out.println(str4);
		
		//기본타입 <-> String
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a: "+ aVar);
		System.out.println("b: "+ bVar);
		System.out.println("c: "+ cVar);
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23;			//""공백을 이용하는 편법
		System.out.println(strV4);		
		
	}

}
