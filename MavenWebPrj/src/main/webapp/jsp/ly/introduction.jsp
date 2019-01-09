<%--
  Created by IntelliJ IDEA.
  User: liuyun
  Date: 2019/1/9
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initialscale=1" />
    <title>产品介绍</title>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/shouye.css"/>
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
                    <a class="navbar-brand" href="shouye.jsp">蒂芙尼蛋糕官网|TIFFANY CAKE</a>
                </div>
                <div class="collapse navbar-collapse" id="example-navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="shouye.jsp">首页</a></li>
                        <li class="active"><a href="#">产品介绍</a></li>
                        <li><a href="#">制作方式</a></li>
                        <li><a href="#">帮助中心</a></li>
                        <li><a href="#">关于我们</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                其它 <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="search.jsp">搜索产品</a></li>
                                <li class="divider"></li>
                                <li><a href="#">加入我们</a></li>
                                <li><a href="#">评价</a></li>
                                <li class="divider"></li>
                                <li><a href="#">企业试吃</a></li>
                                <li class="divider"></li>
                                <li><a href="peisong.jsp">配送范围</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="dl">
                    <p>登录/注册
                        <a href="#">
                            <span class="glyphicon glyphicon-user"></span>
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <ol class="breadcrumb plain pl10">
            <li>全部</li>
            <li><a href="cheese.jsp" title="芝士蛋糕">芝士蛋糕</a></li>
            <li class="active"><a href="cheese.jsp" title="数字蛋糕">数字蛋糕</a></li>
            <li><a href="cheese.jsp" title="美刀刀蛋糕">美刀刀蛋糕</a></li>
            <li><a href="cheese.jsp" title="秋冬季蛋糕">秋冬季蛋糕</a></li>
            <li><a href="cheese.jsp" title="草莓蛋糕">草莓蛋糕</a></li>
            <li><a href="cheese.jsp" title="红圆舞蛋糕">红圆舞蛋糕</a></li>
            <li><a href="cheese.jsp" title="怦然心动蛋糕">怦然心动蛋糕</a></li>
            <li><a href="cheese.jsp" title="千层蛋糕">千层蛋糕</a></li>
        </ol>
    </div>
</div>

<!--缩略图begin-->
<div class="container-fluid">
    <div class="row">
        <div class="suo">
            <div class="container-fluid" style="margin-top: 50px;">
                <div class="row">
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/l.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">芝士蛋糕</h3>
                                <!--<p>一些示例文本。一些示例文本。</p>-->
                                <p style="text-align: center;line-height: px;">
                                    纯正芝士与醇香奶油的梦幻组合
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/m.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">数字蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    惊艳你的每个重大时刻
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/n.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">美刀刀蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    美元蛋糕，纯手工制作
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/o.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">秋冬季蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    一年中最悠闲的时刻
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/p.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">草莓蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    一颗颗草莓,让人少女心爆棚
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/q.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">红圆舞蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    树莓红丝绒，芝士乳酪夹心
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/r.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">怦然心动蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    心动的感觉
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-md-3">
                        <div class="thumbnail">
                            <a href="cheese.jsp">
                                <img src="${path}/imgs/s.png" alt="通用的占位符缩略图">
                            </a>
                            <div class="caption">
                                <h3 class="text-center">千层蛋糕</h3>
                                <p style="text-align: center;line-height: px;">
                                    多层酥皮夹以芝士组合而成
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--缩略图end-->

<div class="container-fluid">
    <div class="row">
        <hr>
    </div>
</div>
<div class="footer-copyright">
    <div class="container">
        <p>
            <span>Copyright &copy;2012-2017 蒂芙尼蛋糕官网|TIFFANY CAKE版权所有</span>
            <span>沪ICP备12045835</span>
            <span>沪公网安备31010802001150</span>
            <span></span>
        </p>
    </div>
</div>

<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap文件-->
<script src="${path}/plugins/bootstrap/js/bootstrap.js" type="text/javascript"></script>
</body>
</html>
