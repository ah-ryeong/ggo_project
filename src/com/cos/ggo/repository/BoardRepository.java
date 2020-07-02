package com.cos.ggo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cos.ggo.db.DBConn;
import com.cos.ggo.model.Board;
import com.cos.ggo.model.Users;

// DAO
public class BoardRepository {
	private static final String TAG = "BoardRepository";
	
	private static BoardRepository instance = new BoardRepository();
	
	private BoardRepository() {
		
	}
	
	public static BoardRepository getInstance() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int 글쓰기(Board board) {
		final String sql = "INSERT INTO board(id, memberId, title, content,createDate) VALUES(Board_seq.nextval, ?,?,? sysdate)";
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getMemberId());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "글쓰기 : " + e.getMessage());
		}  finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	} // end of 글쓰기
	
}
