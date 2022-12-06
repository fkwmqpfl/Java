package com.yedam.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.prj.commom.Command;
import com.yedam.prj.member.service.MemberService;
import com.yedam.prj.member.service.MemberVO;
import com.yedam.prj.member.service.impl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 멤버목록보기
		MemberService dao = new MemberServiceImpl();
		//MemberVO vo = new MemberVO();
		List<MemberVO> members = new ArrayList<MemberVO>();
		
		members = dao.memberSelectList();	//db에서 멤버테이블의 목록을 가져온다.
		request.setAttribute("members", members); // 결과를 jsp페이지에 전달하기 위해
		
		return "member/memberList";	//member/memberList.jsp로 간다.
	}

}
