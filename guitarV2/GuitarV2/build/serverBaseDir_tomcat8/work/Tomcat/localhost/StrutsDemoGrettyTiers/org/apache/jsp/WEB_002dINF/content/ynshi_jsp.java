/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-13 03:47:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ynshi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>111</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/reset.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/introduce.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"js/jquery-1.8.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/base.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"preview\">\r\n");
      out.write("<div class=\"jqzoom\" id=\"spec-n1\" onclick=\"\">\r\n");
      out.write("<img height=\"300\" src=\"images/4.jpg\" jqimg=\"images/4.jpg\" width=\"300\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"spec-n5\">\r\n");
      out.write("<!-- <div class=\"control\" id=\"spec-left\">\r\n");
      out.write("<img src=\"http://keleyi.com/keleyi/phtml/jqtexiao/19/images/left.gif\" />\r\n");
      out.write("</div> -->\r\n");
      out.write("<div id=\"spec-list\">\r\n");
      out.write("<ul class=\"list-h\">\r\n");
      out.write("<li>\r\n");
      out.write("<img src=\"images/1.jpg\">\r\n");
      out.write("</li>\r\n");
      out.write("<li>\r\n");
      out.write("<img src=\"images/2.jpg\">\r\n");
      out.write("</li>\r\n");
      out.write("<li>\r\n");
      out.write("<img src=\"images/3.jpg\">\r\n");
      out.write("</li>\r\n");
      out.write("<li>\r\n");
      out.write("<img src=\"images/4.jpg\">\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- <div class=\"control\" id=\"spec-right\">\r\n");
      out.write("<img src=\"http://keleyi.com/keleyi/phtml/jqtexiao/19/images/right.gif\" />\r\n");
      out.write("</div> -->\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function () {\r\n");
      out.write("$(\".jqzoom\").jqueryzoom({\r\n");
      out.write("xzoom: 400,\r\n");
      out.write("yzoom: 400,\r\n");
      out.write("offset: 10,\r\n");
      out.write("position: \"right\",\r\n");
      out.write("preload: 1,\r\n");
      out.write("lens: 1\r\n");
      out.write("});\r\n");
      out.write("$(\"#spec-list\").jdMarquee({\r\n");
      out.write("deriction: \"left\",\r\n");
      out.write("width: 350,\r\n");
      out.write("height: 56,\r\n");
      out.write("step: 2,\r\n");
      out.write("speed: 4,\r\n");
      out.write("delay: 10,\r\n");
      out.write("control: true,\r\n");
      out.write("_front: \"#spec-right\",\r\n");
      out.write("_back: \"#spec-left\"\r\n");
      out.write("});\r\n");
      out.write("$(\"#spec-list img\").bind(\"mouseover\", function () {\r\n");
      out.write("var src = $(this).attr(\"src\");\r\n");
      out.write("$(\"#spec-n1 img\").eq(0).attr({\r\n");
      out.write("src: src.replace(\"\\/n5\\/\", \"\\/n1\\/\"),\r\n");
      out.write("jqimg: src.replace(\"\\/n5\\/\", \"\\/n0\\/\")\r\n");
      out.write("});\r\n");
      out.write("$(this).css({\r\n");
      out.write("\"border\": \"2px solid #ff6600\",\r\n");
      out.write("\"padding\": \"1px\"\r\n");
      out.write("});\r\n");
      out.write("}).bind(\"mouseout\", function () {\r\n");
      out.write("$(this).css({\r\n");
      out.write("\"border\": \"1px solid #ccc\",\r\n");
      out.write("\"padding\": \"2px\"\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"http://keleyi.com/keleyi/phtml/jqtexiao/19/js/lib.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"http://keleyi.com/keleyi/phtml/jqtexiao/19/js/keleyi.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"text-align: center; clear: both\">\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
