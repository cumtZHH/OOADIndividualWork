/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-06-27 10:32:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mdemo1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write(" <HEAD>\r\n");
      out.write("  <TITLE> New Document </TITLE>\r\n");
      out.write("  <META NAME=\"Generator\" CONTENT=\"EditPlus\">\r\n");
      out.write("  <META NAME=\"Author\" CONTENT=\"\">\r\n");
      out.write("  <META NAME=\"Keywords\" CONTENT=\"\">\r\n");
      out.write("  <META NAME=\"Description\" CONTENT=\"\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"mcss/backstage.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"mcss/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"mcss/icon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"mcss/demo.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"mjs/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"mjs/jquery.easyui.min.js\"></script>\r\n");
      out.write(" </HEAD>\r\n");
      out.write("<body>\r\n");
      out.write("            <div class=\"cont\">\r\n");
      out.write("                <div class=\"title\">产品管理</div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"details_operation clearfix\">\r\n");
      out.write("                        <div class=\"bui_select\">\r\n");
      out.write("                            <input type=\"button\" value=\"添&nbsp;&nbsp;加\" class=\"add\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"fr\">\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <span>商品编号：</span>\r\n");
      out.write("                                <div class=\"bui_select\">\r\n");
      out.write("                                    <select name=\"\" id=\"\" class=\"select\">\r\n");
      out.write("                                        <option value=\"1\">测试内容</option>\r\n");
      out.write("                                        <option value=\"1\">测试内容</option>\r\n");
      out.write("                                        <option value=\"1\">测试内容</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <span>上架时间：</span>\r\n");
      out.write("                                    <input class=\"easyui-datetimebox\" required style=\"width:200px\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <span>搜索</span>\r\n");
      out.write("                                <input type=\"text\" value=\"\" class=\"search\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--表格-->\r\n");
      out.write("                    <table class=\"table\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th width=\"5%\">商品编号</th>\r\n");
      out.write("                                <th width=\"20%\">商品名称</th>\r\n");
      out.write("                                <th width=\"5%\">商品类编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"5%\">库存</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"10%\">价格</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"15%\">入库时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"20%\">首页图片</th>\r\n");
      out.write("                                <th>操作</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">p00001</label></td>\r\n");
      out.write("                                <td>衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</td>\r\n");
      out.write("                                <td>00001</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>78</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td> </td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\" ></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\" onclick=\"del_tr(this)\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <!--这里的id和for里面的c1 需要循环出来-->\r\n");
      out.write("                                <td><input type=\"checkbox\" id=\"c1\" class=\"check\"><label for=\"c1\" class=\"label\">001</label></td>\r\n");
      out.write("                                <td>后台设计</td>\r\n");
      out.write("                                <td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>测试内容</td>\r\n");
      out.write("                                <td align=\"center\"><input type=\"button\" value=\"修改\" class=\"btn\"><input type=\"button\" value=\"删除\" class=\"btn\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("<script>\r\n");
      out.write("  function del_tr(obj) {\r\n");
      out.write("  \tvar conf = confirm('确定删除吗？');\r\n");
      out.write("\tif(conf){\r\n");
      out.write("    $(obj).parent().parent().remove();\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
