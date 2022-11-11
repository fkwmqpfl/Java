package com.yedam.java.homework;

public class EmpDept extends Employee{
	//필드
	String ClassName;
	
	//생성자
	public EmpDept(String n,int m,String ClassName) { //()안의값은 안에있는 데이터를 받기위한것이므로 없어지면 필드의 데이터도 못받는다.
		super(n,m);
		this.ClassName=ClassName;
		//생성자 이용해 초기화
		//this.ClassName=ClassName;
	}
	
//	public void getClassName(String ClassName) {
//		//추가된 필드의 getter 를 정의한다????????
//		System.out.println("부서 : "+ClassName);
//	}

	public String getClassName() {
		return ClassName;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름 : "+name+"\t연봉 : "+money);
		System.out.println("부서 : "+ClassName);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	
	
	

}
