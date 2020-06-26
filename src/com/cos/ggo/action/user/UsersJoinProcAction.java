package com.cos.ggo.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.ggo.action.Action;
import com.cos.ggo.model.RoleType;
import com.cos.ggo.model.Users;
import com.cos.ggo.repository.UsersRepository;
import com.cos.ggo.util.Script;

public class UsersJoinProcAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 유효성검사 
		if (request.getParameter("username") == null || request.getParameter("username").equals("")  ||
				request.getParameter("password") == null  || request.getParameter("password").equals("") ||
				request.getParameter("email") == null  || request.getParameter("email").equals("") ) {
			return;
		}
		
		// 1. 파라메터 받기 (x-www-form-urlencoded 라는 MIME 타입 key = value)
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String userRole = RoleType.USER.toString();
		
		// 2. User 오브젝트 변환하기
		Users user = Users.builder()
				.username(username)
				.password(password)
				.email(email)
				.userRole(userRole)
				.build();
		
		// 3. DB연결
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.회원가입(user);
		
		// 4. home.jsp로 이동 
		if (result == 1) {
			Script.href("회원가입에 성공했습니다.", "user?cmd=join", response);
		} else {
			Script.back("회원가입에 실패했습니다.", response);
		}
	}

}
