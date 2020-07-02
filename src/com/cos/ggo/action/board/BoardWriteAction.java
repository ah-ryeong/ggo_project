package com.cos.ggo.action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.ggo.action.Action;
import com.cos.ggo.util.Script;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 후 글을 쓸 수 있게 session 체크
		HttpSession session = request.getSession();
		if (session.getAttribute("principal") == null) {
			Script.getMessage("잘못된 접근입니다.", response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("ggo/board/write.jsp");
			dis.forward(request, response);
		}
		
	}
	
}
