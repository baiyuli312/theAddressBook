<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style>
        *{
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
    <h1 class="callout">修改用户信息</h1>
    <div class="list">
        <form action="${pageContext.request.contextPath}/UserServlet?act=insert" method="post">
            <table class="wzc-table" border="1">
                <tr>
                    <th>联系人姓名</th>
                    <td><input name="contactName" type="text"></td>
                    <th>联系人性别</th>
                    <td><input name="contactSex" type="text"></td>
                </tr>
                <tr>
                    <th>联系人移动电话</th>
                    <td><input name="contactMobilePhone" type="text"></td>
                    <th>联系人固定电话</th>
                    <td><input name="contactFicedPhone" type="text"></td>
                </tr>
                <tr>
                    <th>联系人邮箱</th>
                    <td><input name="contactEmail" type="text"></td>
                    <th>联系人QQ</th>
                    <td><input name="contactQQ" type="text"></td>
                </tr>
                <tr>
                    <th>联系人地址</th>
                    <td><input name="contactAddress" type="text"></td>
                    <th></th>
                    <td></td>
                </tr>
                <tr>
                    <td colspan='2'><input name="sub" type="submit" value="添加" class="wzc-btn">
                    </td>
                    <td colspan='2'><a href="${pageContext.request.contextPath}/UserServlet?act=select" class="wzc-btn">返回</a></td>
                </tr>
            </table>
        </form>
</body>

</html>