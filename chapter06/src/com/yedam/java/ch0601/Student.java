package com.yedam.java.ch0601;

public class Student {
	//필드
		//학생의 이름
	private String name;
		//학교 이름
	private String schoolName;
		//학번
	private int sNO;
		//학년
	private int grade;
		//국어,영어,수학 성적
	private int kor;
	private int eng;
	private int math;
	
	
	//생성자
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getsNO() {
		return sNO;
	}

	public void setsNO(int sNO) {
		this.sNO = sNO;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	//생성자
	//생성자를 통해서 모든 데이터를 입력
	/*public Student(String schoolName,String name,int sNo, int grade,int kor, int eng, int math){
		this.schoolName=schoolName;	//this있는 앞의것은 필드에있는걸 들고오기위해 this를 붙임 '='뒤에있는거는 생성자를 통해 들어오는 이번에 받는 데이터 값
		this.name=name;
		this.sNO=sNo;
		this.grade=grade;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		getInfo();	//단순 데이터뿐만이아니라 메소드도 가능
		
	}*/
	//메소드
	//getInfo() 학생의 내용을 출력할 수 있는 기능
	public void getInfo() {
		System.out.println("내가 다니는 학교: "+schoolName);
	}
}
