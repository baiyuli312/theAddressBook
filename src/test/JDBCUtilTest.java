package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tjrac.contact.util.JDBCUtil;

public class JDBCUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = JDBCUtil.getConnection();
		PreparedStatement pstmt =null;
		if(conn!=null) {
			System.out.println("数据库连接成功!");
		}else {
			System.out.println("数据库连接失败!");
		}
		JDBCUtil.closeConnection(conn, pstmt);
	}

}
