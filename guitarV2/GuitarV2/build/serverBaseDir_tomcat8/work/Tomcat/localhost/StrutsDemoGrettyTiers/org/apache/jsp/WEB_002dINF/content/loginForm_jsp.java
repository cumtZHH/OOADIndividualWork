/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-16 12:37:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.24.3.jar", Long.valueOf(1468644515205L));
    _jspx_dependants.put("jar:file:/C:/gradle-2.11/caches/modules-2/files-2.1/org.apache.struts/struts2-core/2.3.24.3/216f43164806423390f3fc9f360ac20b8a2e6b17/struts2-core-2.3.24.3.jar!/META-INF/struts-tags.tld", Long.valueOf(1461132506000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.release();
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>perfect-欢迎登录</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("/*  验证码=====================*/\r\n");
      out.write("function changeValidateCode(obj) {      \r\n");
      out.write("/*** \r\n");
      out.write("  *   获取当前的时间作为参数，无具体意义    \r\n");
      out.write("  *   每次请求需要一个不同的参数，否则可能会返回同样的验证码     \r\n");
      out.write("  *   这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。   \r\n");
      out.write("  */  \r\n");
      out.write("var timenow = new Date().getTime();      \r\n");
      out.write("     \r\n");
      out.write("obj.src=\"randPic.action?d=\"+timenow;      \r\n");
      out.write("}      \r\n");
      out.write("</script> \r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"topBar\">\r\n");
      out.write("\t\t<img src=\"images/big.jpg\" class=\"img-resonsive\" alt=\"\"/>\r\n");
      out.write("\t\t<p class=\"p\">欢迎登录 Welcome</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t<p style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"login-box\">\r\n");
      out.write("                            <form action=\"login.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"login list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"l-tit\"><span class=\"glyphicon glyphicon-user\"></span> 账户名</li>\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input  name=\"cuname\" \r\n");
      out.write("\t\t\t\t\t\t\t\t");

//=========================REMEMBER
                  	Cookie[] cookies = request.getCookies();
                 	if(cookies!=null)
                 		{
                   			for (int i = 0; i < cookies.length; i++) 
                    			{
                      				 Cookie c = cookies[i];    
                      				if(c.getName().equalsIgnoreCase("loginName"))
                    				{
                    					String loginname=java.net.URLDecoder.decode(c.getValue(),"utf-8");
                    				
      out.write("\r\n");
      out.write("                    \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t value=\"");
      out.print(loginname);
      out.write('"');
}}} 
      out.write(" id=\"username\" type=\"text\" class=\"form-control\" placeholder=\"请输入您的用户名\"/></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"l-tit\"><span class=\"glyphicon glyphicon-lock\"></span> 密码</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><input name=\"cpassword\"  \r\n");
      out.write("\t\t\t\t\t\t\t\t");

//=========================REMEMBER
                  	Cookie[] cookies1 = request.getCookies();
                 	if(cookies!=null)
                 		{
                   			for (int i = 0; i < cookies1.length; i++) 
                    			{
                      				 Cookie c = cookies1[i];    
                      				if(c.getName().equalsIgnoreCase("password"))
                    				{
                    					String password=c.getValue();
                    				
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(password);
      out.write('"');
      out.write(' ');
}}}
      out.write(" id=\"password\" type=\"password\" class=\"form-control\" placeholder=\"请输入您的密码\"/></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write(" <!--验证码=========================================  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"l-tit\">验证码：</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("<img src=\"randPic.action\"  onclick=\"changeValidateCode(this)\" title=\"点击图片刷新验证码\"/>点击图片刷新</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--==========================================================  -->\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t <!--登录记住密码功能的实现  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input name=\"remember\" value=\"true\" id=\"rememberMe\" type=\"checkbox\" checked=\"checked\"> 记住密码\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"forget\"><a href=\"findForm\">忘记密码？</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"reg-partner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>使用合作方帐号登录</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-inline list-unstyled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">QQ</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">网易</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">新浪微博</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>|</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">微信</a></li>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t <a href=\"\"><input class=\"btn btn-primary btn-lg btn-block l-button btn-danger\" type=\"submit\" value=\"登 录&gt;&gt;\" /></a>\r\n");
      out.write("                         \r\n");
      out.write("                            </form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3\"></div>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr class=\"divider\"/>\r\n");
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

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /WEB-INF/content/loginForm.jsp(95,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("code");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }
}
