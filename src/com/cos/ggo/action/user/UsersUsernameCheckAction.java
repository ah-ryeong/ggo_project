package com.cos.ggo.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.ggo.action.Action;
import com.cos.ggo.repository.UsersRepository;
import com.cos.ggo.util.Script;

public class UsersUsernameCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.중복확인(username);
		
		Script.outText(result +"", response);
		
	}

}
