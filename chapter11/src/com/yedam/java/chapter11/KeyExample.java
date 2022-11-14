package com.yedam.java.chapter11;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//HashMap -> Key , Value 데이터를 저장
		//
		HashMap<Key, String> hashmap = new HashMap<>();
		
		//new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동");  	//해당 키로 물건보관
		
		/*Key k1 = new Key(1);
		Key k2 = new key(2); 		//서로 다른데이터
		*/
		
		//new Key(1)-> 2
		String value = hashmap.get(new Key(1));		//필요한 키로 빼는거
		System.out.println(value);
		
		Key key = new Key(1);
		System.out.println(key.toString());
		
	}

}
