/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-04 11:28:14 UTC
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <!-- Mobile specific metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <!-- Force IE9 to render in normal mode -->\n");
      out.write("        <!--[if IE]><meta http-equiv=\"x-ua-compatible\" content=\"IE=9\" /><![endif]-->\n");
      out.write("        <meta name=\"author\" content=\"SuggeElson\" />\n");
      out.write("        <meta name=\"description\" content=\"\"\n");
      out.write("        />\n");
      out.write("        <meta name=\"keywords\" content=\"\"\n");
      out.write("        />\n");
      out.write("        <meta name=\"application-name\" content=\"sprFlat admin template\" />\n");
      out.write("        <!-- Import google fonts - Heading first/ text second -->\n");
      out.write("        <link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Open+Sans:700\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Droid+Sans:400\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Droid+Sans:700\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<![endif]-->\n");
      out.write("        <!-- Css files -->\n");
      out.write("        <!-- Icons -->\n");
      out.write("        <link href=\"assets/css/icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- jQueryUI -->\n");
      out.write("        <link href=\"assets/css/sprflat-theme/jquery.ui.all.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Bootstrap stylesheets (included template modifications) -->\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Plugins stylesheets (all plugin custom css) -->\n");
      out.write("        <link href=\"assets/css/plugins.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Main stylesheets (template main css file) -->\n");
      out.write("        <link href=\"assets/css/main.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Custom stylesheets ( Put your own changes here ) -->\n");
      out.write("        <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Fav and touch icons -->\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/img/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/img/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/img/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"assets/img/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        <link rel=\"icon\" href=\"assets/img/ico/favicon.ico\" type=\"image/png\">\n");
      out.write("        <!-- Windows8 touch icon ( http://www.buildmypinnedsite.com/ )-->\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#3399cc\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login-page\">\n");
      out.write("        <!-- Start #login -->\n");
      out.write("        <div id=\"login\" class=\"animated bounceIn\">\n");
      out.write("            <img id=\"logo\" src=\"assets/img/logo.png\">\n");
      out.write("            <!-- Start .login-wrapper -->\n");
      out.write("            <div class=\"login-wrapper\">\n");
      out.write("                <ul id=\"myTab\" class=\"nav nav-tabs nav-justified bn\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#log-in\" data-toggle=\"tab\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a href=\"#register\" data-toggle=\"tab\">Register</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div id=\"myTabContent\" class=\"tab-content bn\">\n");
      out.write("                    <div class=\"tab-pane fade active in\" id=\"log-in\">\n");
      out.write("                        <div class=\"social-buttons text-center mt10\">\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary btn-alt btn-round btn-lg mr10\"><i class=\"fa-facebook s24\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary btn-alt btn-round btn-lg mr10\"><i class=\"fa-twitter s24\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-danger btn-alt btn-round btn-lg mr10\"><i class=\"fa-google-plus s24\"></i></a>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-info btn-alt btn-round btn-lg\"><i class=\"fa-linkedin s24\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"seperator\">\n");
      out.write("                            <strong>or</strong>\n");
      out.write("                            <hr>\n");
      out.write("                        </div>\n");
      out.write("                        <form class=\"form-horizontal mt10\" action=\"index.html\" id=\"login-form\" role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <input type=\"text\" name=\"email\" id=\"email\" class=\"form-control left-icon\" value=\"admin@sprflat.com\" placeholder=\"Your email ...\">\n");
      out.write("                                    <i class=\"ec-user s16 left-input-icon\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control left-icon\" value=\"somepass\" placeholder=\"Your password\">\n");
      out.write("                                    <i class=\"ec-locked s16 left-input-icon\"></i>\n");
      out.write("                                    <span class=\"help-block\"><a href=\"#\"><small>Forgout password ?</small></a></span> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-8\">\n");
      out.write("                                    <!-- col-lg-12 start here -->\n");
      out.write("                                    <label class=\"checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"remember\" id=\"remember\" value=\"option\">Remember me ?\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- col-lg-12 end here -->\n");
      out.write("                                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-4\">\n");
      out.write("                                    <!-- col-lg-12 start here -->\n");
      out.write("                                    <button class=\"btn btn-success pull-right\" type=\"submit\">Login</button>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- col-lg-12 end here -->\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"register\">\n");
      out.write("                        <form class=\"form-horizontal mt20\" action=\"#\" id=\"register-form\" role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <!-- col-lg-12 start here -->\n");
      out.write("                                    <input id=\"email1\" name=\"email\" type=\"email\" class=\"form-control left-icon\" placeholder=\"Type your email\">\n");
      out.write("                                    <i class=\"ec-mail s16 left-input-icon\"></i> \n");
      out.write("                                </div>\n");
      out.write("                                <!-- col-lg-12 end here -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <!-- col-lg-12 start here -->\n");
      out.write("                                    <input type=\"password\" class=\"form-control left-icon\" id=\"password1\" name=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                                    <i class=\"ec-locked s16 left-input-icon\"></i> \n");
      out.write("                                </div>\n");
      out.write("                                <!-- col-lg-12 end here -->\n");
      out.write("                                <div class=\"col-lg-12 mt15\">\n");
      out.write("                                    <!-- col-lg-12 start here -->\n");
      out.write("                                    <input type=\"password\" class=\"form-control left-icon\" id=\"confirm_password\" name=\"confirm_passowrd\" placeholder=\"Repeat password\">\n");
      out.write("                                    <i class=\"ec-locked s16 left-input-icon\"></i> \n");
      out.write("                                </div>\n");
      out.write("                                <!-- col-lg-12 end here -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <!-- col-lg-12 start here -->\n");
      out.write("                                    <button class=\"btn btn-success btn-block\">Register</button>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- col-lg-12 end here -->\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End #.login-wrapper -->\n");
      out.write("        </div>\n");
      out.write("        <!-- End #login -->\n");
      out.write("        <!-- Javascripts -->\n");
      out.write("        <!-- Load pace first -->\n");
      out.write("        <script src=\"assets/plugins/core/pace/pace.min.js\"></script>\n");
      out.write("        <!-- Important javascript libs(put in all pages) -->\n");
      out.write("        <script src=\"assets/js/jquery-1.8.3.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("        window.jQuery || document.write('<script src=\"assets/js/libs/jquery-2.1.1.min.js\">\\x3C/script>')\n");
      out.write("        </script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("        window.jQuery || document.write('<script src=\"assets/js/libs/jquery-ui-1.10.4.min.js\">\\x3C/script>')\n");
      out.write("        </script>\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/libs/excanvas.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/libs/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("        <!-- Bootstrap plugins -->\n");
      out.write("        <script src=\"assets/js/bootstrap/bootstrap.js\"></script>\n");
      out.write("        <!-- Form plugins -->\n");
      out.write("        <script src=\"assets/plugins/forms/icheck/jquery.icheck.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/forms/validation/jquery.validate.js\"></script>\n");
      out.write("        <script src=\"assets/plugins/forms/validation/additional-methods.min.js\"></script>\n");
      out.write("        <!-- Init plugins olny for this page -->\n");
      out.write("        <script src=\"assets/js/pages/login.js\"></script>\n");
      out.write("    </body>\n");
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