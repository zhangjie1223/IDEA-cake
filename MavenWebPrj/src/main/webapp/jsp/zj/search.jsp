<%--
  Created by IntelliJ IDEA.
  User: 张杰
  Date: 2019/1/9
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>蒂芙尼蛋糕官网|TIFFANY CAKE </title>
    <link rel="stylesheet" type="text/css" href="../../plugins/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../../css/index.css" />
    <!--<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">-->
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <!--导航-->
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
                    <a class="navbar-brand" href="#">蒂芙尼蛋糕官网|TIFFANY CAKE</a>
                </div>
                <div class="collapse navbar-collapse" id="example-navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="shouye.jsp">首页</a></li>
                        <li><a href="introduction.jsp">产品介绍</a></li>
                        <li><a href="#">制作方式</a></li>
                        <li><a href="#">帮助中心</a></li>
                        <li><a href="#">加入我们</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                其它 <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="search.jsp">搜索产品</a></li>
                                <li class="divider"></li>
                                <li><a href="ly.jsp">留言板</a></li>
                                <li><a href="#">评价</a></li>
                                <li class="divider"></li>
                                <li><a href="about.jsp">企业试吃</a></li>
                                <li class="divider"></li>
                                <li><a href="#">配送范围</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</div>

<div class="wrap">
    <a href="">查看全部蛋糕</a>
</div>

<!--搜索begin-->

<div>
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=" ">搜索关键字</a>
            </div>
            <div>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">查询</button>
                </form>
            </div>
        </div>
    </nav>
</div>




<table class="table table-hover">
    <caption>搜索结果如下：</caption>
    <thead>
    <tr>
        <th>名称</th>
        <th>图片</th>
        <th>详细信息</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>抹茶雪域蛋糕</td>
        <td>图1</td>
        <td>配料</td>
    </tr>
    <tr>
        <td>雪域牛乳芝士</td>
        <td>图2</td>
        <td>配料</td>
    </tr>
    </tbody>
</table>





<!--搜索end-->


<!--缩略图begin-->
<div class="container-fluid" style="margin-top: 50px;">
    <div class="row">
        <div class="row">
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="../../imgs/caomeiqianceng.png" alt="通用的占位符缩略图">
                    <div class="caption">
                        <h3 class="text-center">草莓千层蛋糕</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="../../imgs/caomeixueyuzhishi.png" alt="通用的占位符缩略图">
                    <div class="caption">
                        <h3 class="text-center">草莓雪域蛋糕</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="../../imgs/hanyanrulaozhishi.png" alt="通用的占位符缩略图">
                    <div class="caption">
                        <h3 class="text-center">海盐乳酪芝士蛋糕</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-3">
                <div class="thumbnail">
                    <img src="../../imgs/hefengmochahongdou.png" alt="通用的占位符缩略图">
                    <div class="caption">
                        <h3 class="text-center">和风抹茶红豆蛋糕</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--缩略图end-->

<!--引入jquery文件-->
<script src="../../plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="../../plugins/bootstrap/js/bootstrap.js"></script>
<script>
    $(function() {
        $('#myCarousel').carousel({
            interval: 2000
        })
    })
</script>
<!--版权信息-->
<div class="footer-copyright">
    <div class="container">
        <p>
            <span>Copyright &copy;2012-2019 蒂芙尼蛋糕官网|TIFFANY CAKE版权所有</span>
            <span>沪ICP备12045835</span>
            <span>沪公网安备31010802001150</span>
            <span></span>
        </p >
    </div>
</div>
</body>
</html>
