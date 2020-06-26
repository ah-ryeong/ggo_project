package com.cos.ggo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cos.ggo.db.DBConn;
import com.cos.ggo.model.Users;

// DAO
public class UsersRepository {
	private static final String TAG = "UsersRepository";
	
	private static UsersRepository instance = new UsersRepository();
	
	private UsersRepository() {
		
	}
	
	public static UsersRepository getInstance() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int 회원가입(Users user) {
		try {
			String sql = "INSERT INTO users(id, username, password, email,userRole ,createDate) VALUES(USERS_seq.nextval, ?,?,?,?, sysdate)";
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getUserRole());
			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "회원가입 : " + e.getMessage());
		}  finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	
	public Users 로그인(String username, String password) {
		try {
			String sql = "SELECT * FROM users WHERE username =? ANd password =?";
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				Users users = new Users();
				users.setId(rs.getInt("id"));
				users.setUsername(rs.getString("password"));
				users.setEmail(rs.getString("email"));
				users.setCreateDate(rs.getTimestamp("createDate"));
				return users;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
