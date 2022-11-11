package com.yedam.java.chapter0703;

public class Application {
	public static void main(String[] args) {
		
		//추상클래스는 자신을 객체화(인스턴스화) 할 수 없다.
		//ex) Phone phone = new Phone("아이폰");	XXXX
//		
//		SmartPhone smartPhone = new SmartPhone("누구");
//		
//		smartPhone.turnOn();
//		
//		smartPhone.internetSearch();
//		
//		smartPhone.turnOff();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("----------------------------");
		
		Animal animal= null;
		
		animal = new Dog();	//자동타입변환
		animal.sound();
		
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("----------------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {//자동타입변환 일어나난다.
		animal.sound();
	}

}
