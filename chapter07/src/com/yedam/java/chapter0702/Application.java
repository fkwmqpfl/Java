package com.yedam.java.chapter0702;

public class Application {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemTire = car.run();
			
			switch (problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("왼쪽앞 HankookTire 교체");
				//frontLeftTire -> Tire
				//frontLeftTire 펑크
				//타이어를 교체
				//자식 클래스인 HankookTire 교체
				//부모 클래스에서 오버라이딩 한 내용을 바꿔 끼우게 되는 것
				//자동 타입 변환으로 인해서 가능한 일
				//HankookTire tire =new HankookTire("왼쪽앞",15);
				//car.frontLeftTire = tire		위두줄 == 아래 한줄
				car.frontLeftTire = new HankookTire("왼쪽앞",15);
				break;
			case 2:
				System.out.println("오른쪽앞 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("오른쪽앞",13);
				break;
			case 3:
				System.out.println("왼쪽뒤 HankookTire 교체");
				car.backLeftTire = new HankookTire("왼쪽뒤",14);
				break;
			case 4:
				System.out.println("왼쪽뒤 KumhoTire 교체");
				car.backRightTire = new KumhoTire("오른쪽뒤",17);
				break;
			}
		}
		
	}

}
