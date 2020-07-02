package com.cos.ggo.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.ggo.action.Action;
import com.cos.ggo.model.Board;
import com.cos.ggo.model.RoleType;
import com.cos.ggo.model.Users;
import com.cos.ggo.repository.UsersRepository;
import com.cos.ggo.util.Script;

public class BoardWriteProcAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 인증확인
		HttpSession session = request.getSession();
		if (session.getAttribute("principal") == null) {
			Script.getMessage("잘못된 접근입니다.", response);
			return; // 여기서 return이 있었으면 아래로 타고 코드가 내려간다.
		}
		Users principal = (Users)session.getAttribute("principal");
		
		// 0. request의 title 값과 content값이 null인지 공백인지 확인한다.
		if (request.getParameter("title").equals("") || request.getParameter("title") == null ||
				request.getParameter("content").equals("") || request.getParameter("content") == null) {
			Script.back("글쓰기에 실패했습니다.", response);
			return;
		}
		
		// 1. request에 title 값과 content값 받기 
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// 2. title 값과 content, principal.getId() 값을 Board 오브젝트에 담기
		Board board = Board.builder()
				.memberId(principal.getId())
				.title(title)
				.content(content)
				.build();
		
		// 3. BoardRepository 연결 후 글쓰기(title, content) 함수 호출하기

	}

}
