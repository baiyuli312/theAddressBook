package test;

import com.tjrac.contact.dao.impl.UsersDaoImpl;
import com.tjrac.contact.pojo.User;

public class UsersDaoImplInsertTest {
	public static void main(String[] args) {
		User user = new User();
		user.setUserAccount("root");
		user.setUserPassword("123");
		UsersDaoImpl usersDaoImpl = new UsersDaoImpl();
		boolean flag = usersDaoImpl.insert(user);
		if (flag) {
			System.out.println("创建账号成功");
		}else {
			System.out.println("创建账号失败");
		}
	}
}
