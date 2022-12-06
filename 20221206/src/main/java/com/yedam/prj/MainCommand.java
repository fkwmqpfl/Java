package com.yedam.prj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.prj.commom.Command;

public class MainCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//처음 도착 하는 페이지로 가는것
		return "main/main";	//돌아갈 jsp페이지명
	}

}
