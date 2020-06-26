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
import com.cos.ggo.util.Script;

public class UsersLoginProcAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 유효성검사 
		if (request.getParameter("username").equals("") || request.getParameter("username") == null ||
				request.getParameter("password").equals("") || request.getParameter("password") == null) {
			return;
		}
		
		// 1. 파라메터 받기 (x-www-form-urlencoded 라는 MIME 타입 key = value)
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// 2. User 오브젝트 변환하기
		Users user = Users.builder()
				.username(username)
				.password(password)
				.build();
		
		// 3. DB연결
		UsersRepository usersRepository = UsersRepository.getInstance();
		Users users = usersRepository.로그인(username, password);
		
		if (user != null) {
			HttpSession session = request.getSession(); // 미리 만들어진 session에 접근
			session.setAttribute("principal", user);
			
			if (request.getParameter("remember") != null) {
				// key => Set-Cookie
				// value => remember = ssar
				Cookie cookie = new Cookie("remember", user.getUsername());
				response.addCookie(cookie);
				
//				response.setHeader("Set-Cookie", "remember=ssar");
			} else { // 아이디 기억하기 체크 안 하면 초기화 
				Cookie cookie = new Cookie("remember", "");
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
			
			Script.href("로그인 성공", "user?cmd=home", response);
		} else {
			Script.back("로그인 실패", response);
		}
	}

}
