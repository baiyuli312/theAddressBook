<%@page import="com.tjrac.contact.pojo.Contact"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style>
        * {
            padding: 0;
            margin: 0;
            text-decoration: none;

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
            align-items: center;
        }
        .callout {
            color: #3E82FF;
            margin-top: 50px;
        }
        .list{
            margin-top: 80px;
        }
        .list form table {
            /* height: 80px; */
            border: 1px solid #3E82FF;
            font-size: 20px;
            border-collapse: collapse;
        }
        input{
            text-align: center;
            border: none;
            outline: none;
            height: 100%;
            font-size: 16px;
            /* background-color: #3E82FF; */
            width: 100%;
        }
        td,th {
            height: 50px;
            width: 230px;
            text-align: center;
        }
        .wzc-btn{
            background: none;
            /* color: #fff; */
            font-size: 16px;
        }
    </style>
</head>

<body>
    <%
	Contact contact = (Contact)request.getAttribute("updateContact");
%>
    <h1 class="callout">新增用户信息</h1>
    <div class="list">
        <form action="${pageContext.request.contextPath}/UserServlet?act=update" method="post"
            style="width:100%;text-align:center;">
            <input name="contactId" type="hidden" value='<%=contact.getContactId() %>'>
            <table class="wzc-table" border="1">
                <tr>
                    <th>联系人ID</th>
                    <td><input name="contactId" type="text"
                            value='<%=contact.getContactId()==null?"":contact.getContactId()%>'></td>
                    <th>联系人姓名</th>
                    <td><input name="contactName" type="text"
                            value='<%=contact.getContactName()==null?"":contact.getContactName()%>'></td>
                </tr>
                <tr>
                    <th>联系人性别</th>
                    <td><input name="contactSex" type="text"
                            value='<%=contact.getContactSex()==null?"":contact.getContactSex()%>'></td>
                    <th>联系人移动电话</th>
                    <td><input name="contactMobilePhone" type="text"
                            value='<%=contact.getContactMobilePhone()==null?"":contact.getContactMobilePhone()%>'></td>
                </tr>
                <tr>
                    <th>联系人固定电话</th>
                    <td><input name="contactFicedPhone" type="text"
                            value='<%=contact.getContactFicedPhone()==null?"":contact.getContactFicedPhone()%>'></td>
                    <th>联系人邮箱</th>
                    <td><input name="contactEmail" type="text"
                            value='<%=contact.getContactEmail()==null?"":contact.getContactEmail()%>'></td>
                </tr>
                <tr>
                    <th>联系人住址</th>
                    <td><input name="contactAddress" type="text"
                            value='<%=contact.getContactAddress()==null?"":contact.getContactAddress()%>'></td>
                    <th>联系人QQ</th>
                    <td><input name="contactQQ" type="text"
                            value='<%=contact.getContactQQ()==null?"":contact.getContactQQ()%>'></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="sub" type="submit" value="修改" class="wzc-btn" style="width: 200px;">
                    </td>
                    <td colspan='2'><a href="${pageContext.request.contextPath}/UserServlet?act=select" class="wzc-btn">返回</a></td>
                </tr>
            </table>
        </form>
    </div>
    <%
	Object resultMSG = request.getSession().getAttribute("resultMSG");
	if(resultMSG!=null){
%>
    <script type="text/javascript">
    alert("<%=resultMSG.toString() %>")
</script>
    <%
		request.getSession().removeAttribute("resultMSG");
	}
%>
</body>

</html>