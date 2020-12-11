window.onload = function() {


        // 点击更多展开列表
        var more = document.getElementsByClassName("more");
        var moretag = document.getElementById("moretag");
        var tagList = document.getElementsByClassName("tagList");
        var arrow = document.getElementById("arrow");
        var moreFlag = false;
        more[0].onclick = function() {
            if (moreFlag == false) {
                tagList[0].style.maxHeight = "999px";
                moretag.innerHTML = "收起";
                arrow.className = "iconfont icon-arrow-top-copy";
                moreFlag = true;
            } else {
                tagList[0].style.maxHeight = "113px";
                moretag.innerHTML = "更多";
                arrow.className = "iconfont icon-arrow-top";
                moreFlag = false;
            }
        }

        //设置标签仅有一个可选中
        var dirLists = document.getElementsByClassName("dirList")[0].children;
        var tagLists = document.getElementsByClassName("tagList")[0].children;
        var nowLeftLists = document.getElementsByClassName("nowLeft")[0].children;
        var pageLists = document.getElementsByClassName("pageList")[0].children;

        setList(dirLists);
        setList(tagLists);
        setList(nowLeftLists);
        setList(pageLists);

        //niwRight列表展开内容点击切换
        var nowRightName = document.getElementsByClassName("nowRightName");
        var listLists = document.getElementsByClassName("listList")[0].children;
        for (var i = 0; i < listLists.length; i++) {
            listLists[i].onclick = function() {
                nowRightName[0].innerHTML = this.innerHTML;
            }
        }


        //加载页面中间20节课程
        var mainContent = document.getElementsByClassName("mainContent");
        var picArr = ["https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200325-1585103411810?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid8504-20190712-1562930274699?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/ncn1.jpg?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200907-1599458326246?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200903-1599111726579?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200807-1596796590958?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200507-1588836640198?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid18510-20190717-1563357693503?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid770606-20191017-1571278748855?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/1470809694694.png?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/1548916517593.png?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid770606-20190924-1569308986283?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/course/1542592801417_【596】-【Python3简明教程】.png?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid18510-20190718-1563414007419?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid214893-20191014-1571044901528?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid770606-20191205-1575541847039?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/course/1542944010138_[1208]-[自然语言处理基础入门]-(3).jpg?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/course/1542592873707_【608】-【C++实现简易Docker容器】.png?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid214893-20200331-1585634482951?imageView2/2/h/150/q/100",
            "https://dn-simplecloud.shiyanlou.com/courses/uid770606-20191111-1573441965331?imageView2/2/h/150/q/100"
        ];
        var titleArr = ["新手入门指南之玩转实验楼",
            "Python 新手入门课",
            "Linux 基础入门",
            "WebIDE 环境使用指南",
            "C++ 基础入门实战",
            "机器学习开放基础课程",
            "Django 基础入门",
            "C++ 从零实现 NoSQL 数据库",
            "知识图谱构建射雕三部曲人物关系",
            "Ansible 基础入门",
            "JavaScript 基础入门",
            "Python 异步网络编程实战",
            "Python3 简明教程",
            "PyTorch 入门与实战",
            "TensorFlow 2 深度学习入门与实践",
            "Spring Cloud 与 Docker 实战",
            "自然语言处理基础入门",
            "C++ 实现简易 Docker 容器",
            "C 语言简明教程",
            "Flask 实现一个问答社区"
        ];
        var textArr = ["本课程为实验楼新手入门指南，我们将带你了解实验楼的常用功能和环境使用方法。 课程将通过不同的小例子，让每位学员亲自体验到实验楼线上环境的便捷性和易用性。",
            "极度舒适的新手入门课程， 面向完全没有编程基础的同学。 你将在一下午入门 Linux、 Python 基础和Github 常用命令， 为未来的编程大楼打下稳固的基础。 ",
            "本课程教你如何熟练地使用 Linux，本实验中通过在线动手实验的方式学习 Linux 常用命令，用户与权限管理，目录结构与文件操作，环境变量，计划任务，管道与数据流重定向等基本知识点。",
            "随着云计算时代的全面到来，WebIDE 逐渐被开发者接受和喜爱。相对于本地 IDE，WebIDE 最大的好处就是随处可用，同时具备较好的代码安全性。以我们提供的 WebIDE 环境为例，你只需要几秒钟就可以开启线上开发环境。",
            " C 语言是面向过程的程序设计语言，而 C++ 语言是由 C 语言演变而来的一种面向对象的程序设计语言。课程实验内容从 C++ 语言的概念开始，通过理论学习和实验操作，初步熟知 C++ 语言。",
            " 机器学习开放基础课程是实验楼经由 Open Machine Learning Course 授权并制作的机器学习免费基础实战课。主要讲解机器学习常用的分类算法和回归算法，以及常用的数据预处理技巧。",
            "本课程主要讲解了 Python 的 Django 框架的基础知识。通过学习本课程，可以熟悉 Django 框架的组成结构，并能在学习过程中了解 Django 的强大功能。",
            "本课程使用 C++ 11 实现了一个完全兼容 redis 的 kv 数据库项目——Qedis ；该项目会使用到一些 C++11 核心特性和 STL 库，并利用已有的 tcp 网络库，逐步构建出一个完全兼容 Redis 的更高性能的内存数据库。通过本课程的学习，你可以学习到 C++11 的核心特性应用，Redis 核心功能逻辑实现，以及 Redis 服务的运作原理。",
            "知识图谱（Knowledge Graph）是一门前沿的交叉学科，用于将人类社会的海量知识结构化，并提供一个可理解，可解释的一个模型。本训练营将以《射雕三部曲》为例，从 0 构建起一个可以实际应用的知识图谱，在课程中你将学习 Neo4j 数据库的使用和知识图谱的构建。",
            "Ansible 这个简单易学的自动化工具可以满足业务线在速度和简洁性方面日益增加的需求，让我们更高效的同时管理多台服务器不再是想想而已。",
            "课程从什么是 JavaScript 开始，一步步讲解 JavaScript 基础语法、关键特性、JSON、WebAPI 等知识点。内容将会涉及网页窗口交互的方法以及通过 DOM 进行网页元素的相关操作。",
            "上个世纪 90 年代随着万维网的兴起，网络编程也开始逐渐发展。本课程将介绍如何使用 Socket 创建 TCP 客户端、协程原理、Linux 系统中的五种 I/O 模型、select/poll/epoll 实现 I/O 复用，以及基于 Socket 创建同步阻塞、多线程、异步程序爬取网络图片，后半部分学习异步事件库 pyuv 以及协程框架 greenlet 和 gevent 实现异步爬虫。",
            "简明易懂的 Python3 课程，不仅适用于那些有其它语言基础的同学，对没有编程经验的同学也非常友好。本课程不仅讲解了 Python3 基础知识，还介绍了 PEP8、Virtualenv、测试、项目结构以及 Flask 相关内容",
            "本课程是《深度学习原理与 PyTorch 实战》书籍的配套实践内容。《深度学习原理与 PyTorch 实战》是一本系统介绍深度学习及开源框架 PyTorch 的入门书，全书注重实战，讲解了卷积神经网络，循环神经网络，计算机视觉，迁移学习，自然语言处理等相关知识。",
            "TensorFlow 是由谷歌在 2015 年 11 月发布的深度学习开源工具，我们可以用它来快速构建深度神经网络，并训练深度学习模型。2019 年，TensorFlow 正式推出了 2.0 版本，也意味着 TensorFlow 从 1.x 正式过度到 2.x 时代。",
            "本课程主要讲解如何通过实验的方式实战 Spring Boot/Cloud 并结合 Docker 使用。课程包含了服务注册于发现中心 Eureka，Spring Boot Actuator 监控端点，Ribbon 客户端负载均衡，Feign 声明式 REST 调用，Docker Compose 的基本使用等知识点，最后通过 Dcoker Compose 介绍了接近实际开发的两个例子。",
            " 自然语言处理是指对人们平时日常使用的交流语言进行处理的一项技术。自然语言处理经过多年的发展，现今可以划分为两部分内容，即：自然语言的理解和自然语言的生成。本次实验将以文本分类为目标，介绍自然语言处理相关的基础操作和应用。学习完本课程后，建议继续学习：https://www.lanqiao.cn/courses/1329",
            "Docker 的本质是使用 LXC 实现类似虚拟机的功能，进而节省的硬件资源提供给用户更多的计算资源。本项目将 C++ 与 Linux 的 Namespace 及 Control Group 技术相结合，实现一个简易 Docker 容器。",
            "本课程讲解 C 语言的开发环境以及对 C 语言的剖析，引入大量的 C 语言程序案例，把算法和语法结合起来，通过引导大家由浅入深地编写 C 程序，让大家掌握 C 语言。我们将从中学会 C 语言语法、数组、模块化程序设计指针、文件的输入与输出等。",
            "从零开始实现一个完整的问答社区项目，包含用户评论、点赞、回复、签到，收藏、加精、置顶、搜索，登录注册和邮件激活、密码找回等功能。本课程主要使用 Flask 完成问答社区项目，适合对 Web 开发有一定基础，想进一步加强理解与运用的同学。"
        ];
        var numArr = ["418150",
            "68950",
            "306368",
            "1935",
            "179",
            "8011",
            "20358",
            "521",
            "593",
            "1101",
            "12684",
            "717",
            "91836",
            "411",
            "682",
            "759",
            "1433",
            "1753",
            "67041",
            "290"
        ];
        for (var i = 0; i < 20; i++) {
            mainContent[0].innerHTML += " <div class='section'><div class='tip'></div> <span><i class='iconfont icon-shoucang'></i></span> <a href='#'> <div class='imge'> <img src=" + picArr[i] + " > </div> <div class='intro'> <h6>" + titleArr[i] + "</h6> <div class='description'> " + textArr[i] + " </div> </div> <div class='Contentfooter'> <div class='num'><i class='iconfont icon-fa-users'></i>" + numArr[i] + "</div> <div class='type'></div> </div> </a> </div>";
        }
        //课程左上角小标
        setXinrenbixue(0);
        setBianjituijian(4);
        setBeishouhaoping(5);

        //课程右下角小标
        setXianmian(1);
        setVip(4);
        setVip(6);
        setVip(9);
        setVip(10);
        setVip(12);
        setVip(16);
        setVip(17);
        setVip(18);
        setXunlianying(7);
        setXunlianying(8);
        setXunlianying(11);
        setXunlianying(13);
        setXunlianying(14);
        setXunlianying(15);
        setXunlianying(19);


        //底部微信二维码
        var wechat = document.getElementsByClassName("wechat");
        var erweima = document.getElementsByClassName("erweima");
        wechat[0].onmouseover = function() {
            erweima[0].style.display = "block";
        }
        wechat[0].onmouseout = function() {
            erweima[0].style.display = "none";
        }

    }
    //设置标签仅有一个可选中
function setList(arr) {
    for (var i = 0; i < arr.length; i++) {

        arr[i].onclick = function() {
            for (var j = 0; j < arr.length; j++) {
                if (arr[j].className == "active") {
                    arr[j].classList.remove("active");
                }
            }
            this.className = "active";
        }

    }
}

//设置课程左上角小标-编辑推荐
function setBianjituijian(n) {
    console.log(n);
    var tips = document.getElementsByClassName("tip");
    tips[n].innerHTML = "编辑推荐";
    tips[n].style.display = "block";
}
//设置课程左上角小标-新人必学
function setXinrenbixue(n) {
    console.log(n);
    var tips = document.getElementsByClassName("tip");
    tips[n].innerHTML = "新人必学";
    tips[n].style.display = "block";
}
//设置课程左上角小标-备受好评
function setBeishouhaoping(n) {
    console.log(n);
    var tips = document.getElementsByClassName("tip");
    tips[n].innerHTML = "备受好评";
    tips[n].style.display = "block";
}
//设置课程右下角小标-限免
function setXianmian(n) {
    var types = document.getElementsByClassName("type");
    types[n].innerHTML = " 限免";
    types[n].classList.add("xianmian");
}
//设置课程右下角小标-vip
function setVip(n) {
    var types = document.getElementsByClassName("type");
    types[n].innerHTML = "会员";
    types[n].classList.add("vip");
}
//设置课程右下角小标-训练营
function setXunlianying(n) {
    var types = document.getElementsByClassName("type");
    types[n].innerHTML = "训练营";
    types[n].classList.add("xunlianying");
}