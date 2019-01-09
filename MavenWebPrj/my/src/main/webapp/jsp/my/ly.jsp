<%--
  Created by IntelliJ IDEA.
  User: 小可爱
  Date: 2019/1/9
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!--引入bootstrap.min.css文件-->
    <link rel="stylesheet" href="${path}/plugins/bootstrap/css/bootstrap.css" />
    <!--引入自定义样式-->
    <link rel="stylesheet" type="text/css" href="${path}/plugins/css/cake.css" />
    <style type="text/css">
        .fl{float:left;}
        .fr{float:right;}
        .cl:after{
            content: "";
            display: block;
            clear: both;
        }
        .content form table{

        }
        .box{
            width: 909px;
            margin: 0 auto;
            margin-top: 50px;
        }
        .box table{
            margin: 0px;
        }
        .box .pic{
            margin-left: 30px;
        }
        .footer_img{
            width: 1350px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default" role="navigation" style="margin-bottom: 0px;">
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
<div class="title">
    <img src="${path}/imgs/shichi.png"  width="100%" style="min-width: 1400px;"/>
</div>
<div class="content">
    <div class="content_right float_right">
        <table width="100%" class="qiyeshichi_table margin_top_100">
        </table>
    </div>
    <form name="liuyanform" id="form" action="" method="post">
        <div class="box cl">
            <table border="0" align="center" class="fl">
                <tbody>
                <tr>
                    <td width="100">
                        <b>您的公司全称:</b>
                    </td>
                    <td>
                        <input type="text" class="qiyeshichi_text" size="35" name="company" id="company">
                    </td>
                </tr>
                <tr>
                    <td>
                        <b> 您的公司地址：</b>
                    </td>
                    <td>
                        <select name="country" id="selCountries_" onchange="region.changed(this, 1, 'selProvinces_')" class="text_box02">
                            <option value="1">上海</option>
                        </select>
                        <select name="province" id="selProvinces_" onchange="region.changed(this, 2, 'selCities_')" class="text_box02">
                            <option value="0">请选择</option>
                            <option value="2">长宁区</option>
                            <option value="3">闸北区</option>
                            <option value="4">闵行区</option>
                            <option value="5">徐汇区</option>
                            <option value="6">浦东新区</option>
                            <option value="7">杨浦区</option>
                            <option value="8">普陀区</option>
                            <option value="9">静安区</option>
                            <option value="10">卢湾区</option>
                            <option value="11">虹口区</option>
                            <option value="12">黄浦区</option>
                            <option value="13">南汇区</option>
                            <option value="14">松江区</option>
                            <option value="15">嘉定区</option>
                            <option value="16">宝山区</option>
                            <option value="17">青浦区</option>
                            <option value="19">奉贤区</option>
                        </select>
                        <select name="city" id="selCities_" onchange="region.changed(this, 3, 'selDistricts_')" class="text_box02">
                            <option value="0">请选择</option>
                            <option value="3">外环内</option>
                            <option value="4">外环外</option>
                        </select>
                        <select name="district" id="selDistricts_" style="display:none" class="text_box02">
                            <option value="0">请选择</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><b>详细地址：</b></td>
                    <td colspan="2">
                        <input type="text" class="qiyeshichi_text" size="35" name="address" id="address">
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>公司人数：  </b>
                    </td>
                    <td colspan="2">
                        <input type="text" class="qiyeshichi_text" size="10" name="number" id="number">人
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>您的姓名：</b>
                    </td>
                    <td colspan="2">
                        <input type="text" class="qiyeshichi_text" size="10" name="username" id="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>您的手机号码：</b>
                    </td>
                    <td>
                        <input type="text" class="qiyeshichi_text" size="18" name="mobile" id="mobile">
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>留言：</b>
                    </td>
                    <td>
                        <textarea name="liuyan" rows="5" cols="30"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="提交" name="Submit" class="shouhuoxinxi_queding_re">
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="pic fr">
                <img src="${path}/imgs/qiyeshichi_1.jpg"  >
            </div>
        </div>
        <div class="footer_img">
            <img src="${path}/imgs/shichi2.png">
        </div>
    </form>



</div>
<!--引入jquery文件-->
<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
<!--引入bootstrap.js-->
<script type="text/javascript" src="${path}/plugins/js/bootstrap.min.js"></script>
</body>
</html>
