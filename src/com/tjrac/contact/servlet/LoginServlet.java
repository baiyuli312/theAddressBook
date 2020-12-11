package com.tjrac.contact.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjrac.contact.dao.impl.UsersDaoImpl;
import com.tjrac.contact.pojo.User;

/**
 * @description 登录请求处理类
 * @author LIU
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//接收表单信息
		String userAccount = request.getParameter("userAccount");
		String userPassword = request.getParameter("userPassword");
		//设置回显
		request.setAttribute("userAccount", userAccount);
		request.setAttribute("userPassword", userPassword);
		//根据用户名查询用户
		User user = new UsersDaoImpl().selectByUserAccount(userAccount);
		if(user != null) {
			//System.out.println("userPassword:" + userPassword + "   " + user.getUserPassword());
			if(user.getUserPassword().equals(userPassword)) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect("index.jsp");
			}else {
				request.setAttribute("loginError", "* 密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			request.setAttribute("loginError", "* 用户不存在");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
