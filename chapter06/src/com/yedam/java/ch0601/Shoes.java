package com.yedam.java.ch0601;

public class Shoes {
	
	static int totalCount;
	int running;
	int slipper;
	int mule;
	
	//메소드
	void makeRunning() {
		running +=1;
	}
	void makeSlipper() {
		slipper +=1;		//호출시마다 +1
	}
	void makeMule() {
		mule +=1;
	}
	
	void getCount() {
		totalCount= running + slipper + mule;
	}
	
}
