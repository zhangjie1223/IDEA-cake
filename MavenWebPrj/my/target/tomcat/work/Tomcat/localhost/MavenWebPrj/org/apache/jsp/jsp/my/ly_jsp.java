/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 08:40:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.my;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ly_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!--引入bootstrap.min.css文件-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.css\" />\r\n");
      out.write("    <!--引入自定义样式-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/css/cake.css\" />\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .fl{float:left;}\r\n");
      out.write("        .fr{float:right;}\r\n");
      out.write("        .cl:after{\r\n");
      out.write("            content: \"\";\r\n");
      out.write("            display: block;\r\n");
      out.write("            clear: both;\r\n");
      out.write("        }\r\n");
      out.write("        .content form table{\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .box{\r\n");
      out.write("            width: 909px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        .box table{\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("        }\r\n");
      out.write("        .box .pic{\r\n");
      out.write("            margin-left: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        .footer_img{\r\n");
      out.write("            width: 1350px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\" style=\"margin-bottom: 0px;\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#example-navbar-collapse\">\r\n");
      out.write("                <span class=\"sr-only\">切换导航</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\" \">蒂芙尼蛋糕官网|TIFFANY CAKE</a >\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"example-navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li class=\"active\"><a href=\"../../jsp/ly/shouye.jsp\">首页</a></li>\r\n");
      out.write("                <li><a href=\"../../jsp/ly/introduction.jsp\">产品介绍</a></li>\r\n");
      out.write("                <li><a href=\"../../jsp/jmh/make.jsp\">制作教程</a></li>\r\n");
      out.write("                <li><a href=\"../../jsp/sjr/321.jsp\">帮助中心</a></li>\r\n");
      out.write("                <li><a href=\"../../jsp/my/about.jsp\">关于我们</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        其它 <b class=\"caret\"></b>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"../../jsp/zj/search.jsp\">搜索产品</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"../../jsp/cm/jm.jsp\">加入我们</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"../../jsp/my/ly.jsp\">企业试吃</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"../../jsp/sjr/peisong.jsp\">配送范围</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"title\">\r\n");
      out.write("    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/shichi.png\"  width=\"100%\" style=\"min-width: 1400px;\"/>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("    <div class=\"content_right float_right\">\r\n");
      out.write("        <table width=\"100%\" class=\"qiyeshichi_table margin_top_100\">\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form name=\"liuyanform\" id=\"form\" action=\"\" method=\"post\">\r\n");
      out.write("        <div class=\"box cl\">\r\n");
      out.write("            <table border=\"0\" align=\"center\" class=\"fl\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"100\">\r\n");
      out.write("                        <b>您的公司全称:</b>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"text\" class=\"qiyeshichi_text\" size=\"35\" name=\"company\" id=\"company\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <b> 您的公司地址：</b>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"country\" id=\"selCountries_\" onchange=\"region.changed(this, 1, 'selProvinces_')\" class=\"text_box02\">\r\n");
      out.write("                            <option value=\"1\">上海</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"province\" id=\"selProvinces_\" onchange=\"region.changed(this, 2, 'selCities_')\" class=\"text_box02\">\r\n");
      out.write("                            <option value=\"0\">请选择</option>\r\n");
      out.write("                            <option value=\"2\">长宁区</option>\r\n");
      out.write("                            <option value=\"3\">闸北区</option>\r\n");
      out.write("                            <option value=\"4\">闵行区</option>\r\n");
      out.write("                            <option value=\"5\">徐汇区</option>\r\n");
      out.write("                            <option value=\"6\">浦东新区</option>\r\n");
      out.write("                            <option value=\"7\">杨浦区</option>\r\n");
      out.write("                            <option value=\"8\">普陀区</option>\r\n");
      out.write("                            <option value=\"9\">静安区</option>\r\n");
      out.write("                            <option value=\"10\">卢湾区</option>\r\n");
      out.write("                            <option value=\"11\">虹口区</option>\r\n");
      out.write("                            <option value=\"12\">黄浦区</option>\r\n");
      out.write("                            <option value=\"13\">南汇区</option>\r\n");
      out.write("                            <option value=\"14\">松江区</option>\r\n");
      out.write("                            <option value=\"15\">嘉定区</option>\r\n");
      out.write("                            <option value=\"16\">宝山区</option>\r\n");
      out.write("                            <option value=\"17\">青浦区</option>\r\n");
      out.write("                            <option value=\"19\">奉贤区</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"city\" id=\"selCities_\" onchange=\"region.changed(this, 3, 'selDistricts_')\" class=\"text_box02\">\r\n");
      out.write("                            <option value=\"0\">请选择</option>\r\n");
      out.write("                            <option value=\"3\">外环内</option>\r\n");
      out.write("                            <option value=\"4\">外环外</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"district\" id=\"selDistricts_\" style=\"display:none\" class=\"text_box02\">\r\n");
      out.write("                            <option value=\"0\">请选择</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><b>详细地址：</b></td>\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                        <input type=\"text\" class=\"qiyeshichi_text\" size=\"35\" name=\"address\" id=\"address\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <b>公司人数：  </b>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                        <input type=\"text\" class=\"qiyeshichi_text\" size=\"10\" name=\"number\" id=\"number\">人\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <b>您的姓名：</b>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                        <input type=\"text\" class=\"qiyeshichi_text\" size=\"10\" name=\"username\" id=\"username\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <b>您的手机号码：</b>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"text\" class=\"qiyeshichi_text\" size=\"18\" name=\"mobile\" id=\"mobile\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <b>留言：</b>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <textarea name=\"liuyan\" rows=\"5\" cols=\"30\"></textarea>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"submit\" value=\"提交\" name=\"Submit\" class=\"shouhuoxinxi_queding_re\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div class=\"pic fr\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/qiyeshichi_1.jpg\"  >\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer_img\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/shichi2.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!--引入jquery文件-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--引入bootstrap.js-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
