/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-16 03:02:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.edu.cumt.ec.dao.BuyList;

public final class buycar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("cn.edu.cumt.ec.dao.BuyList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>购物车</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/buycar.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"topBar\">\r\n");
      out.write("\t\t<div class=\"comWidth\">\r\n");
      out.write("\t\t\t<div class=\"fl\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"collection\">收藏perfect</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fr\">\r\n");
      out.write("\t\t\t\t");
if(session.getAttribute("cuname")==null){ 
      out.write("\r\n");
      out.write("\t\t\t\t欢迎来到普菲克特超市！&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"loginForm\">[登录]&nbsp;&nbsp;</a>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t本站访问次数为：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationScope.counter}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t欢迎来到普菲克特超市！&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"backdeal\">[退出]&nbsp;&nbsp;</a>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"registerForm\">[免费注册]</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"logoBar\">\r\n");
      out.write("\t\t\t<p class=\"perfect\">perfect购物车页面</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mainBar\">\r\n");
      out.write("\t<form action=\"orderForm\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table id=\"cartTable\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th><label><input class=\"check-all check\" type=\"checkbox\"/>&nbsp;全选</label></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>商品</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>单价</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>数量</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>小计</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t    ");

    List shopList= (List) session.getAttribute("shop");

      if (shopList==null||shopList.size()==0) {
    
      out.write("\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("   alert(\"购物车没有物品\");\r\n");
      out.write("    window.location.href=document.referrer;\r\n");
      out.write("</script>\r\n");
      out.write("    ");

      } else {
        for (int t = 0; t < shopList.size(); t++) {
          BuyList shop = (BuyList) shopList.get(t);
    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"checkbox\"><input class=\"check-one check\" type=\"checkbox\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"operation\">");
      out.print(t+1);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"goods\"><img src=\"");
      out.print(shop.photo);
      out.write("\" alt=\"\"/><span>");
      out.print(shop.warename);
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"price\">");
      out.print(shop.price);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"count\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"reduce\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"");
      out.print(shop.id);
      out.write("\" class=\"count-input\" type=\"text\" value=\"1\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add\">+</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"subtotal\">");
      out.print(shop.price);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"operation\"><span class=\"delete\">删除</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div class=\"foot\" id=\"foot\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"fl select-all\"><input type=\"checkbox\" class=\"check-all check\"/>&nbsp;全选</label>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"delete\" id=\"deleteAll\" href=\"javascript:;\">清空</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fr closing\">\r\n");
      out.write("\t\t\t\t\t\t");
if(session.getAttribute("cuname")!=null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button class=\"buttonformat\" type=\"submit\">去结算</button>\r\n");
      out.write("\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button class=\"buttonformat\" type=\"button\" onclick=\"alert('请先登录！')\">去结算</button>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fr total\">合计：￥<input name=\"totalprice\" id=\"priceTotal\" value=\"0.0\"/></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fr selected\" id=\"selected\">已选商品\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"selectedTotal\">0</span>件\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"arrow up\">︽</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"arrow down\">︾</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"selected-view\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"selectedViewList\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--<div><img src=\"images/1.jpg\"><span>取消选择</span></div>-->\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"arrow\">◆<span>◆</span></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    ");
}    
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t<footer>\r\n");
      out.write("\t\t\t\t\t<p class=\"alc\">Copyright &copy;2016-2018  普菲克特perfect 版权所有</p>\r\n");
      out.write("\t\t\t\t</footer>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
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
