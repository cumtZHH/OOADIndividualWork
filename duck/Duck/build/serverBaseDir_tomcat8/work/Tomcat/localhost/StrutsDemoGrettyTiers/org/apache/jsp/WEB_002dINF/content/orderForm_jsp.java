/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-16 03:02:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.*;
import java.text.SimpleDateFormat;
import cn.edu.cumt.ec.dao.BuyList;

public final class orderForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("cn.edu.cumt.ec.dao.BuyList");
    _jspx_imports_classes.add("java.text.DateFormat");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>订单结算</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/order.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/styletwo.css\" rel=\"stylesheet\">\r\n");
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
      out.write("\t\t\t<p class=\"perfect\">perfect订单结算页面</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"containerBar\">\r\n");
      out.write("\t<form method=\"post\" action=\"order.action\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default \">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">收货信息</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"shopping-cont padding-shop\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"order-item\"><em>*</em>选 择 地 区：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"1\">&nbsp; &nbsp; 上 海 &nbsp; &nbsp; </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"2\">&nbsp; &nbsp; 北 京 &nbsp; &nbsp; </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"3\">&nbsp; &nbsp; 江 苏 &nbsp; &nbsp; </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"4\">&nbsp; &nbsp; 浙 江 &nbsp; &nbsp; </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
									int r2=(int)(Math.random()*(10));
									long now = System.currentTimeMillis();//一个13位的时间戳
									String oid =String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);// 订单ID 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em></span>订  单  号：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"oid\" type=\"text\" class=\"form-control fr\" value=\"");
      out.print(oid);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em></span>详 细 地 址：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"oaddress\" type=\"text\" class=\"form-control fr\" placeholder=\"最多输入20个汉字\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em></span>用  户  名：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"ocuname\" type=\"text\" class=\"form-control fr\" placeholder=\"最多输入10个汉字\" value=\"");
      out.print(session.getAttribute("cuname") );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li><br/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em></span>收  货  人：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"oname\" type=\"text\" class=\"form-control fr\" placeholder=\"最多输入10个汉字\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li><br/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em></span>联 系 方 式：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"otel\" type=\"text\" class=\"form-control fr\" placeholder=\"如12345678901\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default \">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">支付方式</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"shopping-cont padding-shop\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pay\"/> &nbsp;&nbsp; &nbsp;&nbsp;<img src=\"images/icon/weixin.jpg\" class=\"inmag-responsive\" alt=\"\"/>微信支付 扫一扫\r\n");
      out.write("\t\t\t\t\t\t\t    <img src=\"images/icon/erweima.png\" class=\"inmag-responsive\" alt=\"\"/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pay\"/><img src=\"images/icon/alipay.jpg\" class=\"inmag-responsive\" alt=\"\"/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pay\"/><span>货到付款</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default \">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">发票信息</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"shopping-order padding-shop\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"> 需要发票<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em>发票类型：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-order\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"1\">商业零售发票 </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"2\"> 增值发票  </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"3\">企业发票 </option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"4\">电子发票</option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><span class=\"order-item\"><em>*</em>发票抬头：</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-order\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"1\">个人</option>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value =\"2\"> 企业</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"请填写详细抬头\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"ototalprice\" value=\"");
      out.print(request.getParameter("totalprice"));
      out.write("\"/>\r\n");
      out.write("\t\t ");
List shopList= (List) session.getAttribute("shop");
        for (int t = 0; t < shopList.size(); t++) {
          BuyList shop = (BuyList) shopList.get(t);
      out.write("\r\n");
      out.write("          <input type=\"hidden\" name=\"");
      out.print(shop.id );
      out.write("\" value=\"");
      out.print(request.getParameter(shop.id));
      out.write("\"/>\r\n");
      out.write("          \r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("\t\t<button class=\"btn btn-primary btn-lg btn-block btn-danger\" type=\"submit\">提交订单</button> \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t<!--  \t<div class=\"modal\" id=\"mymodal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("    \t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">订单完成</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t<p>订单已成功提交,期待您的再次光临</p><br/>\r\n");
      out.write("\t\t\t\t<p><span class=\"glyphicon glyphicon-arrow-left fl\"></span><span class=\"fl\"><a href=\"index\"> 回首页</a></span><span class=\"glyphicon glyphicon-arrow-right fr\"></span></span><span class=\"fr\"><a href=\"\"> 查询订单状态</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default btn-danger\" data-dismiss=\"modal\">确定</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">取消</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!-- /.modal-content -->\r\n");
      out.write("\t</div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("\t</div>\r\n");
      out.write("<hr/>\r\n");
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
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--  <script>\r\n");
      out.write("  $(function(){\r\n");
      out.write("    $(\".btn\").click(function(){\r\n");
      out.write("      $(\"#mymodal\").modal(\"toggle\");\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("</script>-->\r\n");
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
