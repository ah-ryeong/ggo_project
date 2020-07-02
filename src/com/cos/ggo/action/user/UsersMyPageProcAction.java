package com.cos.ggo.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.ggo.action.Action;
import com.cos.ggo.model.RoleType;
import com.cos.ggo.model.Users;
import com.cos.ggo.repository.UsersRepository;
import com.cos.ggo.util.SHA256;
import com.cos.ggo.util.Script;

public class UsersMyPageProcAction implements Action {

	private static final String TAG = "UsersMyPageProcAction";
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("principal") == null) {
			Script.getMessage("잘못된 접근입니다.", response);
			return;
		}
		
		// 0. 유효성검사 
		if (request.getParameter("username") == null || request.getParameter("username").equals("")  ||
				request.getParameter("password") == null  || request.getParameter("password").equals("") ||
				request.getParameter("email") == null  || request.getParameter("email").equals("") ) {
			Script.back("입력되지 않은 필드가 있습니다.", response);
			return;
		}
		
		// 1. 파라메터 받기 (x-www-form-urlencoded 라는 MIME 타입 key = value)
		int id = Integer.parseInt(request.getParameter("id"));
		String rawPassword = request.getParameter("password");
		String password = SHA256.encodeSha256(rawPassword);
		String email = request.getParameter("email");
		
		// 2. User 오브젝트 변환하기
		Users user = Users.builder()
				.id(id)
				.password(password)
				.build();
		
		// 3. DB연결
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.회원수정(user);
		
		// 4. 회원수정이 성공적으로 이루어지면 세션 재등록
		if (result == 1) {
			Users principal = usersRepository.findById(id);
			System.out.println(TAG + ": 회원수정 :" + principal.getUsername());
			session.setAttribute("principal", principal);
			
			Script.href("회원수정 성공", "/ggo_project/index.jsp", response);
		} else {
			Script.back("회원수정실패", response);
		}
	}

}
