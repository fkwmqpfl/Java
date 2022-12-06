package com.yedam.prj.member.service;

import lombok.Getter;
import lombok.Setter;

//DTO
@Setter
@Getter
public class MemberVO {//테이블 보고 만들기
	private String memberId;
	private String memberName;
	private String memberPassword;
	private int memberAge;
	private String memberAddress;
	private String memberTel;
	private String memberAuthor;

}
