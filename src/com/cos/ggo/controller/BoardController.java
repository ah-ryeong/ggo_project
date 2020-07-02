package com.cos.ggo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.ggo.action.Action;
import com.cos.ggo.action.board.BoardOfflineAction;
import com.cos.ggo.action.board.BoardPartnershipAction;
import com.cos.ggo.action.board.BoardWriteAction;
import com.cos.ggo.action.board.BoardWriteProcAction;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private final static String TAG = "UsersController";
	private static final long serialVersionUID = 1L;

    public BoardController() {
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
		if(cmd.equals("offline")) {
			// 매장안내 페이지로 이동
			return new BoardOfflineAction();			
		} else if (cmd.equals("partnership")) {
			// 홈페이지 화면으로 이동
			return new BoardPartnershipAction();
		} else if (cmd.equals("write")) {
			// 글쓰기 화면으로 이동
			return new BoardWriteAction();
		} else if (cmd.equals("writeProc")) {
			return new BoardWriteProcAction();
		}
		return null;
	}

}
