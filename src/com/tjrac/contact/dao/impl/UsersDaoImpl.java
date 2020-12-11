package com.tjrac.contact.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tjrac.contact.dao.UsersDao;
import com.tjrac.contact.pojo.User;
import com.tjrac.contact.util.JDBCUtil;

public class UsersDaoImpl extends UsersDao {

	/**
	 * 注册用户
	 * @param user 用户信息
	 * @return	注册是否成功
	 */
	public boolean insert(User user) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into users(userAccount, userPassword) value (?,?)";
		boolean row = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUserAccount());
			pstmt.setString(2, user.getUserPassword());
			row = (pstmt.executeUpdate() == 1);
			
		} catch (SQLException e) {
			// TODO: handle exception
			if (!e.getMessage().contains("PRIMARY")) {
				e.printStackTrace();
			}else {
				System.out.println("用户名已存在");
				return false;
			}
		} finally {
			JDBCUtil.closeConnection(con, pstmt);
		}
		return row;
	}

	/**
	 * 根据用户名查找用户密码
	 * @param userAccount 用户账号
	 * @return 用户信息
	 */
	public User selectByUserAccount(String userAccount) {
		Connection con = JDBCUtil.getConnection();
		List<User> list = new ArrayList<>();
		String sql = "select * from users where userAccount=?";
		PreparedStatement pstmt = null;
		ResultSet rs;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userAccount);
			rs = pstmt.executeQuery();
			list = resultSetToBean(rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JDBCUtil.closeConnection(con, pstmt);
		}
		return list.isEmpty()?null:list.get(0);
	}

	/**
	 * 查询列表
	 * @param rs 查询结果
	 * @return 用户列表
	 * @throws SQLException
	 */
	private List<User> resultSetToBean(ResultSet rs) throws SQLException{
		List<User> list = new ArrayList<>();
		while(rs.next()) {
			User user = new User();
			user.setUserAccount(rs.getString("userAccount"));
			user.setUserPassword(rs.getString("userPassword"));
			list.add(user);
		}
		return list;
	}
}
