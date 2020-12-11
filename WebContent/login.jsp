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
                <div class="rightLogin">
                    <div class="header">
                        用户登录
                    </div>
                    <div class="login">
                        <form action="${pageContext.request.contextPath}/LoginServlet" method="POST">
                            <input type="text" name="userAccount" placeholder="请输入账号 ">
                            <input id="psw1" type="password" name="userPassword" placeholder="请输入密码 ">
                            <i class="iconfont icon-icon-test i-1 "></i>
                            <div class="tips">
                                ${loginError }
                            </div>
                            <button type="submit">登 录</button>
                        </form>
                    </div>
                    <div class="footer">
                        还没有注册?
                        <a id="toregister" href="regist.jsp ">立即注册</a>
                    </div>
                </div>

            </div>
        </main>
    </div>
</body>
<script src="js/index.js"></script>

</html>