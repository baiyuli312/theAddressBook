<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	Object obj = request.getSession().getAttribute("user");
	if(obj==null){
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>个人通讯录</title>
    <link rel="stylesheet" href="css/1.css">
</head>

<body>
<p>恭喜你登录成功!</p>
<ul>
<li class="nav-item">
   	<a href="${pageContext.request.contextPath}/UserServlet?act=select" target="mainframe">
 		<i class="fa fa-file-text-o fa-fw fa-lg"></i>
 		<div>用户管理</div>
    </a>
</li>
</ul>

</body>

</html>