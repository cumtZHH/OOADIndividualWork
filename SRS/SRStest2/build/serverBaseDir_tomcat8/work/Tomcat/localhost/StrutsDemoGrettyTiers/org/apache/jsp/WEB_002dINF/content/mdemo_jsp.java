/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-16 08:09:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" </HEAD>\r\n");
      out.write("<body>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar ctxMenu = $('#ctxMenu1');\r\n");
      out.write("\tvar tree = $('#tree1');\r\n");
      out.write("\ttree.mac('dtree', {\r\n");
      out.write("\t\ttreeConfig: {\r\n");
      out.write("\t\t\ttitle: 'All Regions',\r\n");
      out.write("\t\t\trootVisible: true\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tctxMenu: ctxMenu,\r\n");
      out.write("\t\tmenuOffset: { x: 0, y: 0 },\r\n");
      out.write("\t\tdoInsert: function(dt, callback){\r\n");
      out.write("\t\t\tvar d = dt.data;\r\n");
      out.write("\t\t\td.level = d.level?d.level:0;\r\n");
      out.write("\t\t\tvar p = { level: 1, path: '/', parent: 'root' };\r\n");
      out.write("\t\t\tif(d.level>0){\r\n");
      out.write("\t\t\t\tp.parent = d.key;\r\n");
      out.write("\t\t\t\tp.level = d.level + 1;\r\n");
      out.write("\t\t\t\tif(d.level==1){\r\n");
      out.write("\t\t\t\t\tp.path = '/'+ d.key + '/';\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tp.path = d.path + d.key + '/';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tp.value = d.value;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tApp.open({\r\n");
      out.write("\t\t\t\taction: 'editRegion',\r\n");
      out.write("\t\t\t\ttitle: 'Add Region',\r\n");
      out.write("\t\t\t\tmodal: true,\r\n");
      out.write("\t\t\t\tparams: p\r\n");
      out.write("\t\t\t}, function(dd){\r\n");
      out.write("\t\t\t\tcallback(dd);\r\n");
      out.write("\t\t\t\t//dt.deactivate();\r\n");
      out.write("\t\t\t\t//dt.activate();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdoUpdate: function(dt, callback){\r\n");
      out.write("\t\t\tvar d = dt.data;\r\n");
      out.write("\t\t\tApp.open({\r\n");
      out.write("\t\t\t\taction: 'editRegion',\r\n");
      out.write("\t\t\t\ttitle: 'Edit Region',\r\n");
      out.write("\t\t\t\tmodal: true,\r\n");
      out.write("\t\t\t\tparams: d\r\n");
      out.write("\t\t\t}, function(dd){\r\n");
      out.write("\t\t\t\tcallback(dd);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdoDelete: function(dt, callback){\r\n");
      out.write("\t\t\tApp.confirm('Are you sure you want to delete?', function(){\r\n");
      out.write("\t\t\t\tApp.alert('Delete is not allowed in this demo.')\r\n");
      out.write("//\t\t\t\tvar p = { id: dt.data.key, level: dt.data.level };\r\n");
      out.write("//\t\t\t\t$.post('delete.php', p, function(data){\r\n");
      out.write("//\t\t\t\t\tvar ro = App.eval(data);\r\n");
      out.write("//\t\t\t\t\tif(ro.success){\r\n");
      out.write("//\t\t\t\t\t\tApp.alert(Msg.info.success, [ Msg.del ]);\r\n");
      out.write("//\t\t\t\t\t\tcallback();\r\n");
      out.write("//\t\t\t\t\t\tvar tx = tree.getNode(dt.data.parent);\r\n");
      out.write("//\t\t\t\t\t\ttx.activate();\r\n");
      out.write("//\t\t\t\t\t}else{\r\n");
      out.write("//\t\t\t\t\t\tApp.alert(ro.data, ro.params);\r\n");
      out.write("//\t\t\t\t\t}\r\n");
      out.write("//\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tloader: {\r\n");
      out.write("\t\t\turl: '/javascript/dtree/list.php',\r\n");
      out.write("\t\t\tparams: { key: 'root' },\r\n");
      out.write("\t\t\tautoLoad: true\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonCtxMenu: function(el){\r\n");
      out.write("\t\t\tvar d = el.prop('dtnode').data;\r\n");
      out.write("\t\t\tctxMenu.enableContextMenuItems();\r\n");
      out.write("\t\t\tif(!d.level){\r\n");
      out.write("\t\t\t\tctxMenu.disableContextMenuItems('update,delete');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t$('.demoSource').val($('#demo').html());\r\n");
      out.write("\tApp.setLanguage();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("            <div id=\"tree1\"><div class=\"ui-dynatree-container\"><span id=\"ui-dynatree-id-root\" class=\"ui-dynatree-folder ui-dynatree-expanded ui-dynatree-has-children ui-dynatree-lastsib ui-dynatree-exp-el ui-dynatree-ico-ef\"><span class=\"ui-dynatree-icon\"></span><a href=\"#\" class=\"ui-dynatree-title\">All Regions</a></span><div><span id=\"ui-dynatree-id-_1\" class=\"ui-dynatree-document ui-dynatree-lastsib ui-dynatree-statusnode-wait ui-dynatree-exp-cl ui-dynatree-ico-c\"><span class=\"ui-dynatree-empty\"></span><span class=\"ui-dynatree-connector\"></span><span class=\"ui-dynatree-icon\"></span><a href=\"#\" class=\"ui-dynatree-title\">Loading…</a></span></div></div></div>\r\n");
      out.write("<ul id=\"ctxMenu1\" class=\"ctxMenu hidden\">\r\n");
      out.write("\t<li action=\"insert\" class=\"add item clear\">\r\n");
      out.write("\t\t<span style=\"display: block\">\r\n");
      out.write("\t\t\t<span class=\"icon icon-plus\"></span>\r\n");
      out.write("\t\t\t<span>Add Region</span>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li action=\"update\" class=\"edit item clear\">\r\n");
      out.write("\t\t<span style=\"display: block\">\r\n");
      out.write("\t\t\t<span class=\"icon icon-pencil\"></span>\r\n");
      out.write("\t\t\t<span>Edit Region</span>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li action=\"delete\" class=\"delete item clear\">\r\n");
      out.write("\t\t<span style=\"display: block\">\r\n");
      out.write("\t\t\t<span class=\"icon icon-minus\"></span>\r\n");
      out.write("\t\t\t<span>Delete Region</span>\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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