/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 06:50:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.ly;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class introduction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initialscale=1\" />\r\n");
      out.write("    <title>产品介绍</title>\r\n");
      out.write("    <!--引入bootstrap.min.css文件-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/shouye.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!--导航-->\r\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                            data-target=\"#example-navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">切换导航</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"shouye.jsp\">蒂芙尼蛋糕官网|TIFFANY CAKE</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"example-navbar-collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"shouye.jsp\">首页</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">产品介绍</a></li>\r\n");
      out.write("                        <li><a href=\"#\">制作方式</a></li>\r\n");
      out.write("                        <li><a href=\"#\">帮助中心</a></li>\r\n");
      out.write("                        <li><a href=\"#\">关于我们</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                其它 <b class=\"caret\"></b>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"search.jsp\">搜索产品</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">加入我们</a></li>\r\n");
      out.write("                                <li><a href=\"#\">评价</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"#\">企业试吃</a></li>\r\n");
      out.write("                                <li class=\"divider\"></li>\r\n");
      out.write("                                <li><a href=\"peisong.jsp\">配送范围</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"dl\">\r\n");
      out.write("                    <p>登录/注册\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <ol class=\"breadcrumb plain pl10\">\r\n");
      out.write("            <li>全部</li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"芝士蛋糕\">芝士蛋糕</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"cheese.jsp\" title=\"数字蛋糕\">数字蛋糕</a></li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"美刀刀蛋糕\">美刀刀蛋糕</a></li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"秋冬季蛋糕\">秋冬季蛋糕</a></li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"草莓蛋糕\">草莓蛋糕</a></li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"红圆舞蛋糕\">红圆舞蛋糕</a></li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"怦然心动蛋糕\">怦然心动蛋糕</a></li>\r\n");
      out.write("            <li><a href=\"cheese.jsp\" title=\"千层蛋糕\">千层蛋糕</a></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--缩略图begin-->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"suo\">\r\n");
      out.write("            <div class=\"container-fluid\" style=\"margin-top: 50px;\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/l.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">芝士蛋糕</h3>\r\n");
      out.write("                                <!--<p>一些示例文本。一些示例文本。</p>-->\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    纯正芝士与醇香奶油的梦幻组合\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/m.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">数字蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    惊艳你的每个重大时刻\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/n.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">美刀刀蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    美元蛋糕，纯手工制作\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/o.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">秋冬季蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    一年中最悠闲的时刻\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/p.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">草莓蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    一颗颗草莓,让人少女心爆棚\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/q.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">红圆舞蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    树莓红丝绒，芝士乳酪夹心\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/r.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">怦然心动蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    心动的感觉\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <a href=\"cheese.jsp\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imgs/s.png\" alt=\"通用的占位符缩略图\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h3 class=\"text-center\">千层蛋糕</h3>\r\n");
      out.write("                                <p style=\"text-align: center;line-height: px;\">\r\n");
      out.write("                                    多层酥皮夹以芝士组合而成\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--缩略图end-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer-copyright\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <p>\r\n");
      out.write("            <span>Copyright &copy;2012-2017 蒂芙尼蛋糕官网|TIFFANY CAKE版权所有</span>\r\n");
      out.write("            <span>沪ICP备12045835</span>\r\n");
      out.write("            <span>沪公网安备31010802001150</span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--引入jquery文件-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--引入bootstrap文件-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
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