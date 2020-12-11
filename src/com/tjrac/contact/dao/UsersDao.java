package com.tjrac.contact.dao;

import com.tjrac.contact.pojo.User;

/**
 * @description 数据库连接与操作类用于增删改查数据并返回给servlet使用
 * @author LIU
 *
 */
public abstract class UsersDao {
	/**
	 * 注册用户
	 * @param user 用户信息
	 * @return	注册是否成功
	 */
	public abstract boolean insert(User user);
	
	/**
	 * 根据用户账号查询用户密码
	 * @param userAccount 用户账号
	 * @return 用户信息
	 */
	public abstract User selectByUserAccount(String userAccount);
}

