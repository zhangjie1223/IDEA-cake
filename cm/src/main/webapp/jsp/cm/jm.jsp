<%--
  Created by IntelliJ IDEA.
  User: CM
  Date: 2019/1/9
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="//cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="//cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="//cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body background-color:#b0c4de;>
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

<div class="news oh">
    <div class="center-block" style="width:664px;background-color:#D43F3A;">
        <h1 class="display-1"><p align="center"><font color="#E38D13"><font-weight-bold>WELCOME TO JION TIFFANY CAKE</font></font></p></h1>
    </div>

</div>
<div class="container-fluid">
    <div class="row">
        <div id="myCarousel" class="carousel slide">
            <!-- 轮播（Carousel）指标 -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
                <li data-target="#myCarousel" data-slide-to="4"></li>
            </ol>
            <!-- 轮播（Carousel）项目 -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="${path}/imgs/2.png" alt="First slide" img class="center-block">
                </div>
                <div class="item">
                    <img src="${path}/imgs/3.png" alt="Second slide" img class="center-block">
                </div>
                <div class="item">
                    <img src="${path}/imgs/4.png" alt="Third slide" img class="center-block">
                </div>
                <div class="item">
                    <img src="${path}/imgs/5.png" alt="Forth slide" img class="center-block">
                </div>
                <div class="item">
                    <img src="${path}/imgs/6.png" alt="Fifth slide" img class="center-block">
                </div>
            </div>
            <!-- 轮播（Carousel）导航 -->
            <a class="carousel-control left" href="#myCarousel" data-slide="prev"> <span _ngcontent-c3="" aria-hidden="true" class="glyphicon glyphicon-chevron-right"></span></a>
            <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
            <script>
                $(function()
                {                $('#myCarousel').carousel({                    interval: 2000                })
                })
            </script>
        </div>
    </div>
</div>
<!--引入jquery文件-->
<script src="../plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="../plugins/bootstrap/js/bootstrap.js"></script>
<ul class="list-group">
    <h2><a href="#" class="list-group-item active"><p align="center">
        最新消息</p>
    </a></h2>
    <a href="#" class="list-group-item list-group-item-success">
        <p align="center"><a href="ky.jsp">～～2018年12月12日     新店开业     南京大学店～～</p>
    </a>
    <a href="#" class="list-group-item list-group-item-success">
        <p align="center"><a href="ky.jsp"> ～～2018年12月22日     新店开业     东南大学店～～</p></a>
    <a href="#" class="list-group-item list-group-item-success">
        <p align="center"><a href="ky.jspl">～～2018年12月24日     新店开业     河海大学店～～</p>
    </a>
    <a href="#" class="list-group-item list-group-item-success">
        <p align="center"><a href="ky.jsp">～～2018年12月27日     新店开业     南京财经大学店～～</p>
    </a>
</ul>

<div class="well">
    <h1 class="display-1"><p align="center"><font color="#E38D13">
        【TIFFANY CAKE加盟申请表】</font></p></h1>
    <div style="padding: 100px 100px 10px;">
        <h3>姓名</h3>
        <form class="bs-example bs-example-form" role="form">
            <div class="input-group input-group-sm">

                <input type='text' class="form-control">
            </div>
        </form>
        <h3>手机</h3>
        <form class="bs-example bs-example-form" role="form">
            <div class="input-group input-group-sm">

                <input type='text' class="form-control">
            </div>
            <h3>职业</h3>
        </form>
        <form class="bs-example bs-example-form" role="form">
            <div class="input-group input-group-sm">
                <input type='text' class="form-control">
            </div>
        </form>

        <h3>开店形式</h3>
        <div>
            <label class="checkbox-inline">
                <input type="checkbox" id="inlineCheckbox1" value="option1"> 个人开店
            </label>
            <label class="checkbox-inline">
                <input type="checkbox" id="inlineCheckbox2" value="option2"> 合伙开店
            </label>

            <h3>是否有过开店经验</h3>
            <div>
                <label class="checkbox-inline">
                    <input type="checkbox" id="inlineCheckbox1" value="option1"> 是
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" id="inlineCheckbox2" value="option2"> 否
                </label>


                <h3>从哪里了解我们</h3>
                <div>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="inlineCheckbox1" value="option1"> 微信微博
                    </label>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="inlineCheckbox2" value="option2"> 网络店铺
                    </label>
                    <label class="checkbox-inline">
                        <input type="checkbox" id="inlineCheckbox3" value="option3"> 实体店铺
                    </label>

                    <label class="checkbox-inline">
                        <input type="checkbox" id="inlineCheckbox3" value="option3">其他形式
                    </label>
                </div>
            </div>


            <h3>详细开店地址</h3>
            <form role="form">
                <div class="form-group">
                    <textarea class="form-control"  style="width:300px; rows="4"></textarea>
                </div>
            </form>



            <div >
                <button type="button" class="btn btn-success" style="width:100px; rows="4";left: 100px;>提交</button>
            </div>

        </div>

    </div>
    <br>
    <br>
    <h6><p align="center">
        客服专线：400-180-8585&nbsp;客服邮箱：TIFFANY CAKE@85coffee.com.cn&nbsp;
        <br />
        苏ICP备16035843号-1.     蒂芙妮蛋糕 面包烘焙专卖店 . 2018 苏味(南京)餐饮管理有限公司&nbsp;&copy;版权所有
    </p></h6>
</body>
</html>
