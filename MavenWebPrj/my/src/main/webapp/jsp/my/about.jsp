<%--
  Created by IntelliJ IDEA.
  User: 张杰
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
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" href="${path}/plugins/bootstrap/css/bootstrap.css" />
    <!--引入自定义样式-->
    <link rel="stylesheet" type="text/css" href="${path}/webapp/css/cake.css" />
    <style type="text/css">
        body{
            margin: 0px;
            padding: 0px;
            font-family:"微软雅黑";
            font-size: 14px;
        }
        .gushi_2_title
        {
            color: #a98672;
            font-weight: bold;
        }

        .float_left{
            display: inline-block;
            float: left;
            width: 20%;
            height: 66px;
            padding-left: 60px;

        }
        .float_left ul li div{
            margin-top: 15px;
        }
        .title_cursor{
            color:;
            font-size: 20px;
        }
        .short_title
        {
            font-size: 13px;
            color: #a98672;
        }
        .gushi_right
        {
            line-height: 30px;
            width: 1100px;
        }
        .float_right{
            float: right;
        }

        .gushi_2{
            margin-top: 5px;
        }
        .float_left{
            float: left;
        }

        li
        {
            list-style: none;
        }

        img{
            float: right;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation" style="margin-bottom:0px;">
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
<img src="../../imgs/about.png"/>
<div class="content margin_top_20">
    <div class="float_left">
        <div class="gushi_left">
            <ul>
                <li>
                    <div class="title_cursor">
                        <a>蒂芙妮的故事</a>
                    </div>
                    <div class="short_title">
                        <a>公司简介</a>
                    </div>
                    <div class="short_title">
                        <a>我们的团队</a>
                    </div>
                    <div class="short_title ">
                        <a>精选进口食材</a>
                    </div>
                    <div  class="short_title">
                        <a>联系我们</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="gushi_right float_right">
    <div class="gushi_2 margin_top_10">

        <div class="gushi_2_title">
            让.弗朗索瓦.阿诺德（JEAN-FRANCOIS ARNAUD）<br />
            高级产品研发顾问
        </div>
        <div class="gushi_2_font">
            来自法国甜品世界的让.弗朗索瓦.阿诺德是2000年度全法M.O.F得主，是法国公认优秀的甜品大师。其家族三代从事甜品事业，祖父曾为皇室制作甜点。自上世纪70年代起致力于甜品创意与研发至今。获得多项国际甜品赛事冠军，并担任多项国际赛事的终身评委。在马来西亚创立国际西点培训学校，培养出多名年轻大师。
        </div>
        <div class="gushi_2_title">
            M.O.F简介
        </div>
        <div class="gushi_2_font">
            Meilleurs Ouvriers de France即法国优秀手工业从业者的全称，是法国手工业从业者的无上荣誉，该比赛每四年举办一次。自1924年在法国设立至今，食品行业每年获奖者不超过5人，全法国获奖的厨师、甜品师不超过100人。<br />
            该称号Un des Meilleurs Ouvriers de France (简称M.O.F), 是法国对于相关手工业从业者独特的一种荣誉，即可以代表法国国家进行推广相关的产品。 该荣誉是由法国劳工部进行颁发，并且由法兰西共和国总统在爱丽舍宫内亲自授予的。  <br />
            让.弗朗索瓦.阿诺德身着的红白蓝三色领的制服便是此荣耀的见证，只有M.O.F大师才有资格穿着代表法国荣誉的红白蓝三色领制服，普通厨师是不能穿这款制服的。       	  <br />
        </div>
    </div>
</div>
<img src="${path}/imgs/gushi_our_term.jpg"
<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/js/bootstrap.min.js"></script>
</body>
</html>
