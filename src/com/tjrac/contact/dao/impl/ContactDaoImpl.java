package com.tjrac.contact.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tjrac.contact.dao.ContactDao;
import com.tjrac.contact.pojo.Contact;
import com.tjrac.contact.util.JDBCUtil;

public class ContactDaoImpl extends ContactDao {

	@Override
	public Contact selectByContactID(Integer contactId) {
		Connection con = JDBCUtil.getConnection();
		List<Contact> list = new ArrayList<>();
		String sql = "select * from contacts where contactId=?";
		PreparedStatement pstmt = null;
		ResultSet rs;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, contactId);
			rs = pstmt.executeQuery();
			list = resultSetToBean(rs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection(con, pstmt);
		}
		return list.isEmpty() ? null : list.get(0);
	}

	private List<Contact> resultSetToBean(ResultSet rs) throws SQLException {
		List<Contact> list = new ArrayList<>();
		while (rs.next()) {
			Contact contact = new Contact();
			contact.setContactId(rs.getInt("contactId"));
			contact.setContactName(rs.getString("contactName"));
			contact.setContactSex(rs.getString("contactSex"));
			contact.setContactMobilePhone(rs.getString("contactMobilePhone"));
			contact.setContactFicedPhone(rs.getString("contactFicedPhone"));
			contact.setContactEmail(rs.getString("contactEmail"));
			contact.setContactQQ(rs.getString("contactQQ"));
			contact.setContactUnit(rs.getString("contactUnit"));
			contact.setContactAddress(rs.getString("contactAddress"));
//			contact.setContactGrouping(rs.getString("contactGrouping"));
			list.add(contact);
		}
		return list;
	}

	public List<Contact> selectByMap(Map<String, Object> paramMap) {
		Connection connection = JDBCUtil.getConnection();
		List<Contact> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder("select * from contacts where 1=1");
		List<Object> paramList = new ArrayList<>();
		for (String key : paramMap.keySet()) {
			sql.append(" and ").append(key).append(" = ?");
			paramList.add(paramMap.get(key));
		}
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(sql.toString());
			for (int i = 0; i < paramList.size(); i++) {
				pstmt.setObject(i, paramList.get(i));
			}
			list = resultSetToBean(pstmt.executeQuery());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection(connection, pstmt);
		}
		return list;
	}

	/**
	 * 新增联系人
	 * 
	 * @param contact 联系人信息
	 * @return 新增是否成功
	 */
	public boolean insert(Contact contact) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO contacts(contactName, contactSex, contactMobilePhone, contactFicedPhone, contactEmail, contactQQ, contactUnit, contactAddress) VALUES(?,?,?,?,?,?,?,?)";
		boolean res = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, contact.getContactName());
			pstmt.setString(2, contact.getContactSex());
			pstmt.setString(3, contact.getContactMobilePhone());
			pstmt.setString(4, contact.getContactFicedPhone());
			pstmt.setString(5, contact.getContactEmail());
			pstmt.setString(6, contact.getContactQQ());
			pstmt.setString(7, contact.getContactUnit());
			pstmt.setString(8, contact.getContactAddress());
//			pstmt.setString(9, contact.getContactGrouping());
			res = (pstmt.executeUpdate() == 1);
		} catch (SQLException e) {
			if (!e.getMessage().contains("PRIMARY")) {
				e.printStackTrace();
			} else {
				System.out.println("用户名已存在");
				return false;
			}
		} finally {
			JDBCUtil.closeConnection(con, pstmt);
		}
		return res;
	}

	/**
	 * 修改联系人信息
	 * 
	 * @param contact 修改后联系人信息
	 * @return 更新是否成功
	 */
	public boolean update(Contact contact) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "update contacts set contactName=?, contactSex=?, contactMobilePhone=?, contactFicedPhone=?, contactEmail=?, contactQQ=?, contactUnit=?, contactAddress=? where contactId=?";
		boolean res = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, contact.getContactName());
			pstmt.setString(2, contact.getContactSex());
			pstmt.setString(3, contact.getContactMobilePhone());
			pstmt.setString(4, contact.getContactFicedPhone());
			pstmt.setString(5, contact.getContactEmail());
			pstmt.setString(6, contact.getContactQQ());
			pstmt.setString(7, contact.getContactUnit());
			pstmt.setString(8, contact.getContactAddress());
//			pstmt.setString(9, contact.getContactGrouping());
			pstmt.setInt(9, contact.getContactId());
			res = (pstmt.executeUpdate() == 1);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			JDBCUtil.closeConnection(con, pstmt);
		}
		return res;
	}

	public boolean delete(Integer contactId) {
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from contacts where contactId= ?";
		boolean res = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, contactId);
			res = (pstmt.executeUpdate()==1);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			JDBCUtil.closeConnection(con, pstmt);
		}
		return res;
	}
}
