package com.cos.ggo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.ggo.action.Action;
import com.cos.ggo.action.HomeAction;
import com.cos.ggo.action.user.UsersJoinProcAction;
import com.cos.ggo.action.user.UsersLoginAction;
import com.cos.ggo.action.user.UsersLoginProcAction;
import com.cos.ggo.action.user.UsersLogoutAction;
import com.cos.ggo.action.user.UsersMyPageAction;
import com.cos.ggo.action.user.UsersMyPageProcAction;
import com.cos.ggo.action.user.UsersUsernameCheckAction;
import com.cos.ggo.action.user.UsersjoinAction;

@WebServlet("/user")
public class UsersController extends HttpServlet {
	private final static String TAG = "UsersController";
	private static final long serialVersionUID = 1L;

    public UsersController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// http://localhost:8000/blog/user?cmd=join
		String cmd = request.getParameter("cmd");
		System.out.println(TAG + "doProcess : " + cmd);
		
		Action action = router(cmd);
		action.execute(request, response);
	}
	
	public Action router(String cmd) {
		if(cmd.equals("join")) {
			// 회원가입페이지로 이동
			return new UsersjoinAction();			
		} else if(cmd.equals("joinProc")) {
			// 회원가입을 진행 한 후 -> index.jsp로 이동 
			return new UsersJoinProcAction();
		} else if (cmd.equals("login")) {
			return new UsersLoginAction();
		} else if(cmd.equals("loginProc")) {
			// 로그인 진행 한 후 -> index.jsp로 이동 
			return new UsersLoginProcAction();
		} else if (cmd.equals("home")) {
			// 홈페이지 화면으로 이동
			return new HomeAction();
		} else if (cmd.equals("logout")) {
			// 로그아웃
			return new UsersLogoutAction();
		} else if (cmd.equals("MyPage")) {
			// 회원수정
			return new UsersMyPageAction();
		} else if (cmd.equals("MyPageProc")) {
			// 회원수정
			return new UsersMyPageProcAction();
		} else if (cmd.equals("usernameCheck")) {
			// ID 중복체크
			return new UsersUsernameCheckAction();
		}
		return null;
	}

}
