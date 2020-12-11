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
 * @description 注册请求处理类
 * @author LIU
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String userAccount = request.getParameter("userAccount");
		String userPassword = request.getParameter("userPassword");
		String reconfirmUserPassword = request.getParameter("reconfirmUserPassword");
		if(userAccount == null || userAccount.trim().isEmpty()) {
			request.setAttribute("registError", "用户名不能为空");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		if (userPassword == null || userPassword.trim().isEmpty()) {
			request.setAttribute("registError", "密码不能为空");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		if (!userPassword.equals(reconfirmUserPassword)) {
			request.setAttribute("registError", "密码不一致");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
			return;
		}
		UsersDaoImpl daoImpl = new UsersDaoImpl();
		User user = new User();
		user.setUserAccount(userAccount);
		user.setUserPassword(userPassword);
		if(daoImpl.selectByUserAccount(userAccount) != null) {
			request.setAttribute("registError", "注册失败,该用户名已存在");
			request.getRequestDispatcher("regist.jsp").forward(request, response);
		}else {
			if(daoImpl.insert(user)) {
				response.sendRedirect("login.jsp");
			}else {
				request.setAttribute("registError", "注册失败,发生未知错误");
				request.getRequestDispatcher("regist.jsp").forward(request, response);
			}
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
