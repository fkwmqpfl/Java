package com.yedam.prj;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.member.command.MemberList;
import com.yedam.prj.commom.Command;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();	//해쉬맵
       

    public FrontController() {
        super();
       
    }


	public void init(ServletConfig config) throws ServletException {
		//명령(Command)를 저장하는 영역
	
		map.put("/main.do", new MainCommand()); 			//처음오자마자인덱스페이지 보이게하기
		map.put("/memberList.do", new MemberList());		//멤버목록보기
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Controller 본체
		request.setCharacterEncoding("utf-8");	//한글 깨짐 방지
		String uri = request.getRequestURI();	//uri 값을 읽어온다.				url = localhost/20221206/index.jsp		uri = 20221206/index.jsp
		String contextPath = request.getContextPath();	//ContextPath 를 읽어온다.		20221206
		String page = uri.substring(contextPath.length());	//실제 요청명을 구한다.		index.jsp
		
		Command command = map.get(page);		//수행할 command를 찾고			인터페이스는 스스로 초기화 하지못해 구현체인 new MainCommand()가 초기화
		String viewPage = command.exec(request, response);	//찾은 command를 실행
		
		//실행된 페이지를 보여주는곳 viewresolve?
		if(!viewPage.endsWith(".do")) {
			//Ajax 처리하는 루틴
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);			//던진 request가 최종까지 넘어가서 행동함
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect(viewPage);												//던진 request를 무시하고 최종으로 넘어감
		}
	}

}
