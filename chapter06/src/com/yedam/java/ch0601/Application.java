package com.yedam.java.ch0601;

import com.yedam.java.ch0604.Computer;

//import 강제등록
//import com.yedam.java.ch0604.Computer;


public class Application {
	//필드
	int staticTest = 0;
	
	Computer com= new Computer();//ctrl shift O
	
	
	public static void main(String[] args) {
		
		Application ap = new Application();	//자신을 인스턴스화를해야 위에있는 필드를 쓸수있다.
		ap.staticTest = 1;
	
		
		Shoes shoes =new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(Shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();			//인스턴스화
		System.out.println(	csno.word);
		System.out.println(	csno.words);
		
		System.out.println(ConstantNo.EARTH_ROUND);
		//heap영역에 저장
		Access access = new Access();
		
		//1)public
		access.free ="public";
		access.free();
		//2)private
		//access.privacy = "privacy";
		//3)protected
		access.parent ="parent";
		//4)default
		access.basic = "basic";
		
		//Singleton 싱글톤
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();//s1==s2
		
		System.out.println(s1);
		System.out.println(s2);
		
						//singleton = new Singleton()
						//getInstance() == singleton == new Singleton()
						//getInstance()==new Singleton()
		//Singleton s1 = new Singleton()
		
		Member mem = new Member();
		//1)mem의 인스턴스 필드에 접근 가능한지 확인
		//2)setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1111-2222");
		mem.setAge(20);
		
		System.out.println("ID : "+mem.getId());
		System.out.println("Tel : "+mem.getTel());
		System.out.println("Age : "+mem.getAge());
		
	
	}

}
