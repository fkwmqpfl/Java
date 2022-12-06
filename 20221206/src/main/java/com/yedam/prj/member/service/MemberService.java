package com.yedam.prj.member.service;

import java.util.List;

public interface MemberService {		//db에서 쓸거
	List<MemberVO> memberSelectList();	//전체조회
	
	MemberVO memberSelect(MemberVO vo); 	//한사람 조회 또는 로그인
	
	int memberInsert(MemberVO vo);	//입력
	int memberDelete(MemberVO vo);	//삭제
	int memberUpdate(MemberVO vo);	//수정
	
	boolean isIdCheck(String id);	//아이디 중복 체크 존재하면 false
	

}
