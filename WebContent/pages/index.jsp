<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="java.sql.*"%>
<%@ page import="com.tjrac.contact.pojo.Contact" %>
<!DOCTYPE html>
<html>

<head>
    <title>蓝桥用户管理</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            text-decoration: none;
            list-style: none;
        }

        body {
            width: 1080px;
            height: 550px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
            box-shadow: 0 0 10px 1px rgba(0, 0, 0, 0.2);
            border-radius: 6px;
            display: flex;
            flex-direction: column;
            justify-content: flex-start;
            align-items: center;
        }

        h1 {
            margin-top: 30px;
            color: #3E82FF;
        }

        h3 {
            margin: 20px 0 0 50px;
            align-self: flex-start;
            display: block;
            width: 80px;
            height: 28px;
            text-align: center;
            background: #3E82FF
            
        }

        h3 a {
            color: #fff;
        }

        .list {
            margin-top: 20px;
            text-align: center;
        }

        .list table {
            font-size: 14px;
            color: #fff;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
        }

        .list table th {
        width: 93px;
            border-width: 1px;
            padding: 8px;
            border-bottom-style: solid;
            /* border-top-style: solid; */
            border-color: #666666;
            background-color: #3E82FF;
        }

        .list table td {
            width: 93px;
            border-width: 1px;
            padding: 8px;
            color: black;
            border-bottom-style: solid;
            border-color: #666666;
            background-color: #ffffff;
            overflow: hidden;
        }
        .list table td a{
            color: #3E82FF;
        }
    </style>
</head>

<body>
    <h1 class="callout">用户管理</h1>
    <h3><a href="${pageContext.request.contextPath}/pages/insert.jsp" class="wzc-btn">添加用户</a></h3>
    <div class="list">
        <table class="wzc-table">
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>性别</th>
                <th>移动电话</th>
                <th>固定电话</th>
                <th>邮箱</th>
                <th>QQ</th>
                <th>住址</th>
                <th>操作</th>
            </tr>
            <%
                List<Contact> cList = (List<Contact>)request.getAttribute("contactList");
                if(cList==null){
                    request.getRequestDispatcher(request.getContextPath()+"/UserServlet?act=select").forward(request, response);
                }else{
                    for(Contact contact:cList){
            %>
            <tr>
                
                <td><%=contact.getContactId()%></td>
                <td><%=contact.getContactName()==null?"":contact.getContactName()%></td>
                <td><%=contact.getContactSex()==null?"":contact.getContactSex()%></td>
                <td><%=contact.getContactMobilePhone()==null?"":contact.getContactMobilePhone()%></td>
                <td><%=contact.getContactFicedPhone()==null?"":contact.getContactFicedPhone()%></td>
                <td><%=contact.getContactEmail()==null?"":contact.getContactEmail()%></td>
                <td><%=contact.getContactQQ()==null?"":contact.getContactQQ()%></td>
                <td><%=contact.getContactAddress()==null?"":contact.getContactAddress()%></td>
                <td><a href="${pageContext.request.contextPath}/UserServlet?act=toUpdatePage&contactId=<%=contact.getContactId()%>" style="margin:0 10px;">
                    <i class="fa fa-edit fa-fw"></i> 修改</a>
                    <a href="${pageContext.request.contextPath}/UserServlet?act=delete&contactId=<%=contact.getContactId()%>">
                        <i class="fa fa-trash fa-fw"></i> 删除</a>
                </td>
            </tr>
            <%}} %>
        </table>
        <%
            Object resultMSG = request.getSession().getAttribute("resultMSG");
            if(resultMSG!=null){
        %><script type="text/javascript">alert("<%=resultMSG.toString() %>")</script><%
                request.getSession().removeAttribute("resultMSG");
            }
        %>
    </div>
</body>

</html>