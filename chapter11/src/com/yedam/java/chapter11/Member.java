package com.yedam.java.chapter11;

public class Member {

	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// Object obj = new Member("blue")
		
		Member member = (Member) obj;// 자식 클래스에 있는걸 사용하기위해 강제타입변환 멤버로 =>멤버는 id를가지고있음
		//Member member = new Member("blue");
		
		if (id.equals(member.id)) {// 1의 id.equals(```.(2의 id))
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		//String a = "1";		//10번지
		//String b ="1";		//10번지	같은 객체이면서 같은 주소값 ,=String은 같은 주소를 바라보기때문에 같다고 인식
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	}

}
