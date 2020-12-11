<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>精选项目课程_IT热门课程_蓝桥课程 - 蓝桥</title>
        <link rel="stylesheet" href="css/app.css">
        <link rel="stylesheet" href="css/iconfont.css">
        <script src="js/app.js"></script>
    </head>

    <body>
        <div class="app">
            <nav>
                <div class="navContainer">
                    <a class="logo" href="shiyanlou.jsp"><img src="https://static.shiyanlou.com/lanqiao/frontend/dist/img/c87943b.svg" alt="蓝桥"></a>
                    <div class="navRight">
                        <ul class="navNav">
                            <a href="">
                                <li class="active">课程</li>
                            </a>
                            <a href="">
                                <li>路径</li>
                            </a>
                            <a href="">
                                <li>训练营</li>
                            </a>
                            <a href="">
                                <li>楼+</li>
                                <img src="https://static.shiyanlou.com/lanqiao/frontend/dist/img/icon-new.459ac7f.svg" alt="">
                            </a>
                            <a href="">
                                <li>会员</li>
                                <img src="https://static.shiyanlou.com/lanqiao/frontend/dist/img/icon-new.459ac7f.svg" alt="">
                            </a>
                            <a href="">
                                <li>比赛</li>
                            </a>
                            <a href="">
                                <li>社区</li>
                            </a>
                        </ul>
                        <div class="navMenu">
                            <div class="search">
                                <input type="text" name="" placeholder="搜索 课程/问答" id="searchArea">
                                <button><i class="iconfont icon-sousuo"></i></button>
                            </div>
                            <div class="logReg">
                                <a href="${pageContext.request.contextPath}/login.jsp" class="login">登录</a>
                                <a href="${pageContext.request.contextPath}/regist.jsp" class="register">注册</a>
                            </div>
                        </div>
                    </div>
                </div>

            </nav>
            <main>
                <div class="mainContainer">
                    <div class="mainNav">
                        <ul class="direction">
                            <span>方向：</span>
                            <div class="dirList">
                                <li class="active">全部</li>
                                <li class="asd">后端开发</li>
                                <li>Linux运维</li>
                                <li>云计算与大数据</li>
                                <li>数据库</li>
                                <li>信息安全</li>
                                <li>Web前端</li>
                                <li>计算机专业课</li>
                                <li>人工智能</li>
                                <li>系列专题</li>
                            </div>
                        </ul>
                        <ul class="tag">
                            <span>标签：</span>
                            <div class="tagList">
                                <li class="active">全部</li>
                                <li>Python</li>
                                <li>Web</li>
                                <li>Linux</li>
                                <li>基础入门</li>
                                <li>Java</li>
                                <li>C</li>
                                <li>C++</li>
                                <li>PHP</li>
                                <li>数据分析</li>
                                <li>入门实战</li>
                                <li>R</li>
                                <li>Spark</li>
                                <li>Go</li>
                                <li>JavaScript</li>
                                <li>HTML</li>
                                <li>Docker</li>
                                <li>NoSQL</li>
                                <li>Flask</li>
                                <li>书籍配套实验</li>
                                <li>Web安全</li>
                                <li>SpringBoot</li>
                                <li>Vue.js</li>
                                <li>Hadoop</li>
                                <li>Node.js</li>
                                <li>CSS</li>
                                <li>React</li>
                                <li>TensorFlow</li>
                                <li>scikt-learn</li>
                                <li>SQL</li>
                                <li>Python</li>
                                <li>Web</li>
                                <li>Linux</li>
                                <li>基础入门</li>
                                <li>Java</li>
                                <li>C</li>
                                <li>C++</li>
                                <li>PHP</li>
                                <li>数据分析</li>
                                <li>入门实战</li>
                                <li>R</li>
                                <li>Spark</li>
                                <li>Go</li>
                                <li>JavaScript</li>
                                <li>HTML</li>
                                <li>Docker</li>
                                <li>NoSQL</li>
                                <li>Flask</li>
                                <li>书籍配套实验</li>
                                <li>Web安全</li>
                                <li>SpringBoot</li>
                                <li>Vue.js</li>
                                <li>Hadoop</li>
                                <li>Node.js</li>
                                <li>CSS</li>
                                <li>React</li>
                                <li>TensorFlow</li>
                                <li>scikt-learn</li>
                                <li>SQL</li>
                            </div>
                            <button type="button" class="more"><i id="arrow" class="iconfont icon-arrow-top"></i><label id="moretag">更多</label></button>
                        </ul>
                        <hr>
                        <div class="nowNav">
                            <ul class="nowLeft">
                                <li class="active">综合</li>
                                <li>最新</li>
                                <li>最热</li>
                            </ul>
                            <div class="nowRight">
                                <div class="list">
                                    <span class="nowRightName">全部</span>
                                    <ul class="listList">
                                        <li>全部</li>
                                        <li>免费</li>
                                        <li>会员</li>
                                        <li>训练营</li>
                                    </ul>
                                </div>
                                <div class="button">加入私有课</div>
                            </div>
                        </div>
                    </div>
                    <div class="mainContent">
                        <!-- <div class="section">
                        <div class="tip">新人必学</div>
                        <span><i class="iconfont icon-shoucang"></i></span>
                        <a href="#">
                            <div class="imge">
                                <img src="https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200325-1585103411810?imageView2/2/h/150/q/100" alt="新手入门指南之玩转实验楼">
                            </div>
                            <div class="intro">
                                <h6>新手入门指南之玩转实验楼</h6>
                                <div class="description">
                                    本课程为实验楼新手入门指南，我们将带你了解实验楼的常用功能和环境使用方法。 课程将通过不同的小例子，让每位学员亲自体验到实验楼线上环境的便捷性和易用性。
                                </div>
                            </div>
                            <div class="Contentfooter">
                                <div class="num"><i class="iconfont icon-fa-users"></i>418150</div>
                                <div class="type">限免</div>
                            </div>
                        </a>
                    </div> -->

                    </div>
                    <div class="pages">
                        <section class="toLast"><i class="iconfont icon-dingbudaohang_wangzuoqiehuanyeqian"></i>上一页</section>

                        <ul class="pageList">
                            <li class="active">1</li>
                            <li>2</li>
                            <li>3</li>
                            <li>...</li>
                            <li>28</li>
                            <li>29</li>
                        </ul>
                        <section class="toNext">下一页<i class="iconfont icon-dingbudaohang_wangyouqiehuanyeqian"></i></section>

                    </div>
                    <div class="floater">
                        <a href="#">
                            <img src="https://static.shiyanlou.com/lanqiao/frontend/dist/img/premium-vip-icon.2a64526.png">
                        </a>
                        <div class="floaterInfo">开通会员，即刻开始学习</div>
                    </div>
                </div>
            </main>
            <footer>
                <div class="footerContainer">
                    <div class="footerLeft">
                        <div><img src="https://static.shiyanlou.com/lanqiao/frontend/dist/img/lanqiao-logo.5de12f2.svg" alt="蓝桥"></div>
                        <p>连接高校和企业</p>
                        <div>
                            <div class="wechat"><i class="iconfont icon-we-chat"></i></div>
                            <div class="erweima"><img src="https://static.shiyanlou.com/lanqiao/frontend/dist/img/wx-code.aba03b8.png" alt=""></div>
                        </div>
                    </div>
                    <div class="footerRight">
                        <ul>
                            <li class="title">公司</li>
                            <li><a href="#">关于我们</a></li>
                            <li><a href="#">联系我们</a></li>
                            <li><a href="#">加入我们</a></li>
                        </ul>
                        <ul>
                            <li class="title">产品与服务</li>
                            <li><a href="#">会员服务</a></li>
                            <li><a href="#">蓝桥杯大赛</a></li>
                            <li><a href="#">实战训练营</a></li>
                            <li><a href="#">就业班</a></li>
                            <li><a href="#">保入职</a></li>
                        </ul>
                        <ul>
                            <li class="title">合作</li>
                            <li><a href="#">1+X证书</a></li>
                            <li><a href="#">高校实验教学</a></li>
                            <li><a href="#">企业内训</a></li>
                            <li><a href="#">合办学院</a></li>
                            <li><a href="#">成为作者</a></li>
                        </ul>
                        <ul>
                            <li class="title">学习路径</li>
                            <li><a href="#">Python学习路径</a></li>
                            <li><a href="#">Linux学习路径</a></li>
                            <li><a href="#">大数据学习路径</a></li>
                            <li><a href="#">Java学习路径</a></li>
                            <li><a href="#">PHP学习路径</a></li>
                            <li><a href="#">全部</a></li>
                        </ul>
                    </div>
                </div>
                <div class="footerfoot">
                    <a href="#">京公网安备</a> 11010802020352号 © Copyright 2020. 蓝桥网版权所有 |
                    <a href="#">京ICP备11024192号</a>
                </div>
            </footer>
        </div>
    </body>

    </html>