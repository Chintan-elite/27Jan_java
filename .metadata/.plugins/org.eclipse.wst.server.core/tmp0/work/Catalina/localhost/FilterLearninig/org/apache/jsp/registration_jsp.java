/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.13
 * Generated at: 2022-05-23 03:33:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\r\n");
      out.write("    <title>Hello, world!</title>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    .err\r\n");
      out.write("    {\r\n");
      out.write("    \tcolor: red;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("  \t<div class=\"container\">\r\n");
      out.write("  \t<div class=\"row\">\r\n");
      out.write("  \t<div class=\"col-md-4\"></div>\r\n");
      out.write("  \t<div class=\"col-md-4\">\r\n");
      out.write("  \t\r\n");
      out.write("  \t<h1 class=\"text-success\">Registration form</h1>\r\n");
      out.write("  \t<form action=\"reg\"  method=\"post\">\r\n");
      out.write("  \t\r\n");
      out.write("  \t<div class=\"form-group\">\r\n");
      out.write("  \t<label>Username</label>\r\n");
      out.write("  \t<input type=\"text\" name=\"uname\" class=\"form-control\" id=\"uname\" value=\"");
if(request.getParameter("uname") != null){
      out.print(request.getParameter("uname"));
}
      out.write("\">\r\n");
      out.write("  \t<span id=\"unameE\" class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unameE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t\r\n");
      out.write("  \t<div class=\"form-group\">\r\n");
      out.write("  \t\t<label>Email</label>\r\n");
      out.write("  \t<input type=\"text\" name=\"email\" class=\"form-control\" id=\"email\" value=\"");
if(request.getParameter("email") != null){
      out.print(request.getParameter("email"));
}
      out.write("\">\r\n");
      out.write("  \t<span id=\"emailE\" class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t\r\n");
      out.write("  \t<div class=\"form-group\">\r\n");
      out.write("  \t\t<label>Password</label>\r\n");
      out.write("  \t<input type=\"text\" name=\"pass\" class=\"form-control\" id=\"pass\" value=\"");
if(request.getParameter("pass") != null){
      out.print(request.getParameter("pass"));
}
      out.write("\">\r\n");
      out.write("  \t<span id=\"passE\" class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${passE }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t\r\n");
      out.write("  \t<div class=\"form-group\">\r\n");
      out.write("  \t\t<label>Confirm Password</label>\r\n");
      out.write("  \t<input type=\"text\" class=\"form-control\" id=\"cpass\"  name=\"cpass\" value=\"");
if(request.getParameter("cpass") != null){
      out.print(request.getParameter("cpass"));
}
      out.write("\">\r\n");
      out.write("  \t<span id=\"cpassE\" class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpassE }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t\r\n");
      out.write("  \t<div class=\"form-group\">\r\n");
      out.write("  \t\t<label>Address</label>\r\n");
      out.write("  \t<input type=\"text\" name=\"adr\" class=\"form-control\" id = \"adr\" value=\"");
if(request.getParameter("adr") != null){
      out.print(request.getParameter("adr"));
}
      out.write("\" >\r\n");
      out.write("  \t<span id=\"adrE\" class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adrE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t<br>\r\n");
      out.write("  \t<input type=\"submit\" class=\"btn btn-success\" id=\"sbtn\">\r\n");
      out.write("  \t<input type=\"reset\" class=\"btn btn-info\">\r\n");
      out.write("  \t</form>\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t<div class=\"col-md-4\"></div>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \r\n");
      out.write("  \t\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  </body>\r\n");
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
