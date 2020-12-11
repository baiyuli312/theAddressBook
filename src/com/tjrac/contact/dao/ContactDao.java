package com.tjrac.contact.dao;

import com.tjrac.contact.pojo.Contact;

/**
 * @description 数据库连接与操作类用于增删改查数据并返回给servlet使用
 * @author LIU
 *
 */
public abstract class ContactDao {
	/**
	 * 根据用户查询联系人
	 * @param contactId 用户账号
	 * @return 联系人信息
	 */
	public abstract Contact selectByContactID(Integer contactId);
}
