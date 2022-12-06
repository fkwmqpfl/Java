package com.yedam.prj.member.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.prj.commom.DataSource;
import com.yedam.prj.member.map.MemberMapper;
import com.yedam.prj.member.service.MemberService;
import com.yedam.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);//데이터베이스 연결
	MemberMapper map = sqlSession.getMapper(MemberMapper.class);	//인터페이스는 자신을 초기화x,mapper 연걸
	

	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public boolean isIdCheck(String id) {
		return map.isIdCheck(id);
	}

}
