<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/iconfont.css">
    <title>蓝桥用户管理</title>
</head>

<body>
    <div class="app">
        <main>
            <div class="right">
                <div class="rightRegister">
                    <div class="header">
                        用户注册
                    </div>
                    <div class="login">
                        <form action="${pageContext.request.contextPath}/RegistServlet" method="post">
                            <input type="text" name="userAccount" placeholder="请输入手机号/邮箱">
                            <input id="psw2" name="userPassword" type="password" placeholder="请输入密码">
                            <i class="iconfont icon-icon-test i-2"></i>
                            <input id="psw3" name="reconfirmUserPassword" type="password" placeholder="请再次输入密码">
                            <i class="iconfont icon-icon-test i-3"></i>
                            <div class="tips">
                                ${registError }
                            </div>
                            <button type="submit">注 册</button>
                        </form>
                    </div>
                    <div class="footer">
                        已有帐号?
                        <a id="tologin"  href="login.jsp ">登录</a>
                    </div>
                </div>
            </div>
        </main>
    </div>
</body>
<script src="js/register.js"></script>
</html>