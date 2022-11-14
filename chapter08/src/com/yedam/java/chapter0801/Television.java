package com.yedam.java.chapter0801;

public class Television implements RemoteControl, Search {
	//필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		} else if(volume<RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
	

}
