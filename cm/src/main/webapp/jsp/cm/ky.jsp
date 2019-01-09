<%--
  Created by IntelliJ IDEA.
  User: 蔡勐
  Date: 2019/1/9
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#example-navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href=" ">蒂芙尼蛋糕官网|TIFFANY CAKE</a >
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="../../jsp/ly/shouye.jsp">首页</a></li>
                <li><a href="../../jsp/ly/introduction.jsp">产品介绍</a></li>
                <li><a href="../../jsp/jmh/make.jsp">制作教程</a></li>
                <li><a href="../../jsp/sjr/321.jsp">帮助中心</a></li>
                <li><a href="../../jsp/my/about.jsp">关于我们</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        其它 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="../../jsp/zj/search.jsp">搜索产品</a></li>
                        <li class="divider"></li>
                        <li><a href="../../jsp/cm/jm.jsp">加入我们</a></li>
                        <li class="divider"></li>
                        <li><a href="../../jsp/my/ly.jsp">企业试吃</a></li>
                        <li class="divider"></li>
                        <li><a href="../../jsp/sjr/peisong.jsp">配送范围</a></li>

                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div >
    <h1><p align="center" class="bg-success"><font color="#C12E2A"><em>南京大学店盛大开业</em></p></h1>
</div>
<h5 class="page-header"><font color="#000000"> </h5>
<div class="row">
    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/imgs/7.jpg"
                 alt="新店开业风采展示">
        </a>
    </div>

    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/imgs/8.jpg" alt="新店开业风采展示">
        </a>
    </div>

    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/imgs/9.jpg" alt="新店开业风采展示">
        </a>
    </div>

    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/imgs/10.jpg" alt="新店开业风采展示">
        </a>

    </div>

    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/imgs/11.jpg" alt="新店开业风采展示">
        </a>
        <div class="caption">
            <h3><p align="center"><font color="#2AABD2">～～～新店开业风采展示～～～</p></h3>
        </div>
    </div>

    <div class="col-sm-6 col-md-4">
        <a href="#" class="thumbnail">
            <img src="${path}/imgs/12.jpg" alt="新店开业风采展示">
        </a>
    </div>
</div>
<div class="center-block" style="width:664px;background-color:#28A4C9;">
    <h1><font color="#EC971F"><em>店面介绍</em></font></h1>
    <h5 class="page-header"><font color="#000000"> </h5>
    <h4>蒂芙尼蛋糕南京大学店坐落于美丽的古都南京，是一所从开店以来就异常火爆的面包甜品店</h4>
    <img src="${path}/imgs/13.jpg">
    <h4>  南京大学蒂芙尼蛋糕店不仅种类丰富，而且口感也算的上是面包中的米其林</h4>
    <img src="${path}/imgs/14.jpg">
    <h4>整个采访过程中店长感慨：选择蒂芙尼，幸福一辈子！</h4>

</body>
</html>
