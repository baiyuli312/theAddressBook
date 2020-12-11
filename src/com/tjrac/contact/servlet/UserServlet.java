package com.tjrac.contact.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjrac.contact.dao.impl.ContactDaoImpl;
import com.tjrac.contact.pojo.Contact;

/**
 * @description 通讯录显示
 * @author LIU
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactDaoImpl daoImpl = new ContactDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String act = request.getParameter("act");
		if (act != null) {
			// 根据传输的act调用不同的方法
			switch (act) {
			case "select":
				selectAllContact(request, response);
				break;
			case "toUpdatePage":
				toUpdatePage(request, response);
				break;
			case "insert":
				insertContact(request, response);
				break;
			case "update":
				updateContact(request, response);
				break;
			case "delete":
				deleteContact(request, response);
				break;
			default:selectAllContact(request, response);
				break;
			}
		} else {
			response.getWriter().print("act参数不能为空");
		}
	}

	private void deleteContact(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer contactId = Integer.valueOf(request.getParameter("contactId"));
		if (daoImpl.delete(contactId)) {
			request.getSession().setAttribute("resultMSG", "删除成功");
		} else {
			request.getSession().setAttribute("resultMSG", "删除失败");
		}
		response.sendRedirect("UserServlet?act=select");
	}

	/**
	 * 修改联系人信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void updateContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contactId = request.getParameter("contactId");
		String contactName = request.getParameter("contactName");
		String contactSex = request.getParameter("contactSex");
		String contactMobilePhone = request.getParameter("contactMobilePhone");
		String contactFicedPhone = request.getParameter("contactFicedPhone");
		String contactEmail = request.getParameter("contactEmail");
		String contactQQ = request.getParameter("contactQQ");
		String contactUnit = request.getParameter("contactUnit");
		String contactAddress = request.getParameter("contactAddress");
		String contactGrouping = request.getParameter("contactGrouping");
		Contact contact = new Contact();
		if (contactId != null) {
			contact.setContactId(Integer.valueOf(contactId));
		}
		if (contactName != null) {
			contact.setContactName(contactName);
		}
		if (contactSex != null) {
			contact.setContactSex(contactSex);
		}
		if (contactMobilePhone != null) {
			contact.setContactMobilePhone(contactMobilePhone);
		}
		if (contactFicedPhone != null) {
			contact.setContactFicedPhone(contactFicedPhone);
		}
		if (contactEmail != null) {
			contact.setContactEmail(contactEmail);
		}
		if (contactQQ != null) {
			contact.setContactQQ(contactQQ);
		}
		if (contactUnit != null) {
			contact.setContactUnit(contactUnit);
		}
		if (contactAddress != null) {
			contact.setContactAddress(contactAddress);
		}
		if (contactGrouping != null) {
			contact.setContactGrouping(contactGrouping);
		}
		if(daoImpl.update(contact)) {
			request.getSession().setAttribute("resultMSG", "修改联系人信息成功");
			response.sendRedirect("UserServlet?act=select");
		}else {
			request.setAttribute("updateContact", contact);
			request.getSession().setAttribute("resultMSG", "修改联系人信息失败");
			request.getRequestDispatcher("pages/update.jsp").forward(request, response);
		}
		
	}
	
	/**
	 * 添加联系人信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void insertContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contactName = request.getParameter("contactName");
		String contactSex = request.getParameter("contactSex");
		String contactMobilePhone = request.getParameter("contactMobilePhone");
		String contactFicedPhone = request.getParameter("contactFicedPhone");
		String contactEmail = request.getParameter("contactEmail");
		String contactQQ = request.getParameter("contactQQ");
		String contactUnit = request.getParameter("contactUnit");
		String contactAddress = request.getParameter("contactAddress");
//		String contactGrouping = request.getParameter("contactGrouping");
		Contact contact = new Contact();
		if (contactName != null) {
			contact.setContactName(contactName);
		}
		if (contactSex != null) {
			contact.setContactSex(contactSex);
		}
		if (contactMobilePhone != null) {
			contact.setContactMobilePhone(contactMobilePhone);
		}
		if (contactFicedPhone != null) {
			contact.setContactFicedPhone(contactFicedPhone);
		}
		if (contactEmail != null) {
			contact.setContactEmail(contactEmail);
		}
		if (contactQQ != null) {
			contact.setContactQQ(contactQQ);
		}
		if (contactUnit != null) {
			contact.setContactUnit(contactUnit);
		}
		if (contactAddress != null) {
			contact.setContactAddress(contactAddress);
		}
//		if (contactGrouping != null) {
//			contact.setContactGrouping(contactGrouping);
//		}
		if(daoImpl.insert(contact)) {
			request.getSession().setAttribute("resultMSG", "新增联系人成功");
			response.sendRedirect("UserServlet?act=select");
		}else {
			request.getSession().setAttribute("resultMSG", "新增联系人失败");
			request.getRequestDispatcher("pages/insert.jsp").forward(request, response);
		}
	}
	
	/**
	 * 查看所有联系人信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void selectAllContact(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Contact> list = daoImpl.selectByMap(new HashMap<String, Object>(0));
		request.setAttribute("contactList", list);
		request.getRequestDispatcher("pages/index.jsp").forward(request, response);
	}
	
	/**
	 * 更新联系人页面
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void toUpdatePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int contactId = Integer.valueOf(request.getParameter("contactId"));
		Contact contact = daoImpl.selectByContactID(contactId);
		request.setAttribute("updateContact", contact);
		request.getRequestDispatcher("pages/update.jsp").forward(request, response);
	}

}
