package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int a = -100;
		int result1= +a;
		int result2 = -a;
		System.out.println("reuslt : "+ result1);
		System.out.println("reuslt : "+ result2);
	
	byte b=-100;
//	byte rwsult3 = (byte)-b;
	int result3 = -b;
	System.out.println("result3"+result3);
	
	//증감연산자
	int x = 10;
	int y = 10;
	int z;
	System.out.println("--------------------------");
	x++;	//11
	++x;	//12
	System.out.println("x= "+x);
	
	System.out.println("--------------------------");
	y--;	//9
	--y;	//8
	System.out.println("y= "+y);
	
	System.out.println("--------------------------");
	z=x++;	//12
	System.out.println("z= "+z);	//12
	System.out.println("x= "+x);	//13
	
	System.out.println("--------------------------");
	z=++x;	//14
	System.out.println("z= "+z);	//14
	System.out.println("x= "+x);	//14
	
	System.out.println("--------------------------");
	z=++x + y++;		//x=15+ y=8(++) z=23
	/* 1) ++x	=> 15
	 * 3) y++	=> 9
	 * 2) x+y	=> 15+8 =>23
	 * 4) =		=>z = (x+y)=>z=23
	 */
	
	System.out.println("z= "+z);	//23
	System.out.println("x= "+x);	//15
	System.out.println("y= "+y);	//9
	
	/***/
	x = 5;
	y = 5;
	
	System.out.println("--------------------------");
	
	z = x++ + --y;				//x=5++ + y=4  z=9
	/*	3)x++
	 * 	2)x+y
	 * 	1)--y
	 * 	4)=
	 * */	
	System.out.println("z= "+z);	//9
	System.out.println("x= "+x);	//6
	System.out.println("y= "+y);	//4
	
	System.out.println("--------------------------");
	
	z = --x + y++;				// x=5 + y=4++ z=9
	
	System.out.println("z= "+z);	//9
	System.out.println("x= "+x);	//5
	System.out.println("y= "+y);	//5
	
	//논리 부정 연산자
	boolean play = true;
	System.out.println(play);
	
	play = !play;
	System.out.println(play);
	play = !play;
	System.out.println(play);
	
	boolean isOpen = true;
	
	if(!isOpen) {
		System.out.println("영업시간이 종료되었습니다.");
	}else {
		System.out.println("영업 중 입니다.");
	}
	
	//산술 연산자
	int v1 = 5;
	int v2 = 2;
	
	int result;
	
	result = v1 + v2;
	System.out.println("result: "+result);
	
	result = v1 - v2;
	System.out.println("result: "+result);
	
	result = v1 * v2;
	System.out.println("result: "+result);
	
	result = v1 / v2;
	System.out.println("result: "+result);
	
	result = v1 % v2;
	System.out.println("result: "+result);
	
	//비교연산자
	int num1 = 10;
	int num2 = 10;
	boolean bResult;
	
	bResult = (num1<=num2);
	System.out.println(">= : "+bResult);	//true
	
	bResult = (num1==num2);
	System.out.println("== : "+bResult);	//true
	
	bResult = (num1 != num2);
	System.out.println("!= : "+bResult);	//false
	
	char char1 = 'A';
	char char2 = 'B';
	System.out.println("문자 비교 : " + (char1 > char2 ));	//false
	
	int v3 = 1;
	double v4 = 1.0;
	System.out.println("int VS double : "+(v3==v4));		//true
	
	float v5 = 0.1f;
	double v6 = 0.1;
	System.out.println("float VS double : "+(v5==v6));		//false
	System.out.println("float VS float : "+(v5==(float)v6));//true
	
	//논리 연산자
	int charCode = 'A';
	
	//유니코드 중 65보다 크거나 같고 90보다는 작거나 같으면 대문자
	if((charCode >= 65)&&( charCode <= 90)) {		//&&앞에게 false면 뒤에껀 계산안하고 바로false를 보냄
		System.out.println("대문자");
	}
	//유니코드중 97보다 크거나 같고 122보다작거나 같으면 소문자//& 앞에거가 false라도 뒤에꺼 계산을 해보고 내보냄
	if((charCode >=97)&(charCode <= 122)) {
		System.out.println("소문자");
	}
	
	//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9를 뜻함
	if((charCode > 48) && (charCode < 57)) {
		System.out.println("숫자 0~9");
	}
	
	int numValue = 6;
	if((numValue%2 == 0)||(numValue%3 == 0)) {
		System.out.println("2나 3의 배수이다");
	}
	
	//복합 대입 연산자
	int resultA = 0;
	resultA += 10;	//resultA = resultA + 10
	System.out.println("+= : "+resultA);
	resultA -= 5;	//resultA = resultA - 5
	System.out.println("-= : "+resultA);
	resultA *=3;	//resultA = resultA * 3
	System.out.println("*= : "+resultA);
	resultA /= 5;	//resultA = resultA / 5
	System.out.println("/= : "+resultA);
	resultA %= 3;	//resultA = resultA % 3
	System.out.println("%= : "+resultA);
	
	//삼항연산자
	int score = 85;
	char grade = (score >90) ? 'A' : 'B' ;
	System.out.printf("성적은 %d이고 등급은 %c\n",score,grade);
	
	int age = 17;
	String message = (age>=20)?"성인" :"미성년" ;
	System.out.printf("나이는 %d이고 \"%s\"입니다.\n", age, message );
	}

}
