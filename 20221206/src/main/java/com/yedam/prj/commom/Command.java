package com.yedam.prj.commom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	String exec(HttpServletRequest request, HttpServletResponse response);	//request,response를 전달 받아서 처리를 결과를 String으로 돌려줌
	
}

