package com.yedam.java.chapter0702;

public class Application3 {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	//왼쪽에는 내가 쓸 객체 오른쪽에는 비교할 객체
			Child child = (Child)parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("metohd -child변환 성공");
	}
	
	
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();	//참조해 만든ㄷ게 Child()  new연산자
		method1(parentA);
	
		
		Parent parentB = new Parent();
		method2(parentB);
		
		
	System.out.println("==========================================");
		
		
		
		Driver driver = new Driver();
		
		//bus,taxi ->vehicle 부모클래스
		Bus bus = new Bus();
		Tax tax = new Tax();
		//driver.drive(Vehicle vehicle = new Bus)
		driver.drive(bus);
		
		
		driver.drive(tax);
		System.out.println("==========================================");
		
		Animal animal = null;
		
		animal = new Cat();
		animal.speak();
		
		animal = new Dog();
		animal.speak();
		System.out.println("==========================================");
		
		Parent parent = new Child();
		
		parent.field="parent";
		parent.method1();
		parent.method2();
		
		//parent.field2="child";
		//parent.method3();
		
		//Casting ==강제타입변환
		
		Child child = (Child)parent;
		
		child.field2 = "parent";
		child.method3();
		child.field = "parent";
		System.out.println("==========================================");
		
		
		
	}
}
