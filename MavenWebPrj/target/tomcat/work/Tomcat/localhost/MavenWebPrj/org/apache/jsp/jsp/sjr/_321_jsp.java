/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-09 08:40:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.sjr;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _321_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/public.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"//cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <title>蒂芙尼蛋糕官网</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .navbar{\r\n");
      out.write("            top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        #outer{\r\n");
      out.write("            top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\" style=\"background-color: powderblue;\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#example-navbar-collapse\">\r\n");
      out.write("                <span class=\"sr-only\">切换导航</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\" \">蒂芙尼蛋糕官网|TIFFANY CAKE</a>\r\n");
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
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"outer\">\r\n");
      out.write("\r\n");
      out.write("    <!--主体内容-->\r\n");
      out.write("    <section class=\"publicMian \">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <h2 class=\"leftH2\"><span class=\"span1\"></span>功能列表 <span></span></h2>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul class=\"list\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\">帮助中心</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <div class=\"location\">\r\n");
      out.write("                <strong>你现在所在的位置是:</strong>\r\n");
      out.write("                <span>帮助中心</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"hll_content\">\r\n");
      out.write("                <div class=\"content_bt\"><span style=\"color:red;\">评价/投诉</span></div>\r\n");
      out.write("                <div class=\"hll_bjk \">\r\n");
      out.write("                    <div style=\"width:100%;padding-top:10px;\">注意：带<span style=\"color:black;\">*</span>项目为必填项，请认真填写各项内容。</div>\r\n");
      out.write("                    <form name=\"fgmessageBoardForm\" method=\"post\" action=\"message.php\" class=\"ajaxForm\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"act\" value=\"act_add_message\" />\r\n");
      out.write("                        <div class=\"zc_xx\">\r\n");
      out.write("                            <!-- <ul>\r\n");
      out.write("                <li class=\"text_right\"><b>*</b>主题：</li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"xx\"><input name=\"msg_title\" maxlength=\"60\" size=\"60\" value=\"\" class=\"bg\" type=\"text\"></div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul> -->\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"text_right\"><b>*</b>留言类型：</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"xx\">\r\n");
      out.write("                                        <select name=\"msg_type\">\r\n");
      out.write("                                            <option value=\"-1\">请选择</option>\r\n");
      out.write("                                            <option value=\"1\">投诉建议</option>\r\n");
      out.write("                                            <option value=\"2\">产品咨询</option>\r\n");
      out.write("                                            <option value=\"3\">业务咨询</option>\r\n");
      out.write("                                            <option value=\"5\">团购业务</option>\r\n");
      out.write("                                            <option value=\"0\">其他</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"text_right\"><b>*</b>姓名：</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"xx\"><input name=\"user_name\" maxlength=\"20\" size=\"26\" value=\"\" class=\"bg\" type=\"text\"></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"text_right\"><b>*</b>Email：</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"xx\"><input name=\"email\" maxlength=\"50\" size=\"26\" value=\"\" class=\"bg\" type=\"text\"></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"text_right\"><b>*</b>联系电话：</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"xx\"><input name=\"msg_phone\" size=\"26\" value=\"\" class=\"bg\" type=\"text\"></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"text_right\"><b>*</b>评价：</li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"xx\"><textarea name=\"msg_content\" cols=\"70\" rows=\"4\"></textarea></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-success\" style=\"width:100px; rows=\"4\";left: 100px;>提交</button>\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-success\" style=\"width:100px; rows=\"4\";left: 100px;>重置</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!--点击删除按钮后弹出的页面-->\r\n");
      out.write("    <div class=\"zhezhao\"></div>\r\n");
      out.write("    <div class=\"remove\" id=\"removeUse\">\r\n");
      out.write("        <div class=\"removerChid\">\r\n");
      out.write("            <h2>提示</h2>\r\n");
      out.write("            <div class=\"removeMain\">\r\n");
      out.write("                <p>你确定要删除该用户吗？</p>\r\n");
      out.write("                <a href=\"#\" id=\"yes\">确定</a>\r\n");
      out.write("                <a href=\"#\" id=\"no\">取消</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <hr>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-copyright\">\r\n");
      out.write("        <div class=\"container\" style=\"text-align: center;\">\r\n");
      out.write("            <span>Copyright &copy;2012-2017 蒂芙尼蛋糕官网|TIFFANY CAKE版权所有</span>\r\n");
      out.write("            <span>沪ICP备12045835</span>\r\n");
      out.write("            <span>沪公网安备31010802001150</span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--引入jquery文件-->\r\n");
      out.write("<script src=\"../../plugins/jquery/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--引入bootstrap.js-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../plugins/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
