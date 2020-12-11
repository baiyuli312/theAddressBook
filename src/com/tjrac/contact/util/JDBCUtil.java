package com.tjrac.contact.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 数据库连接工具类
 * 
 * @author LIU
 *
 */
public class JDBCUtil {
	/**
	 * 数据库驱动
	 */
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	/**
	 * 数据库连接地址
	 */
	private static final String URL = "jdbc:mysql://localhost:3306/adressbook?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT";

	/**
	 * 数据库用户名
	 */
	private static final String USER = "root";
	
	/**
	 * 数据库密码
	 */
	private static final String PASSWORD = "0312";


	/**
	 * 获取JDBC连接
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭JDBC连接
	 * @param conn
	 * @param pstmt
	 */
	public static void closeConnection(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
