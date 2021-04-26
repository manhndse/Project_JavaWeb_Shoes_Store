package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <form  action=\"add\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">ID</label>\n");
      out.write("                        <input name=\"id\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Name</label>\n");
      out.write("                        <input name=\"name\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Unit</label>\n");
      out.write("                        <input name=\"unit\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Price</label>\n");
      out.write("                        <input name=\"price\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Link Image</label>\n");
      out.write("                        <input name=\"image\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">CateID</label>\n");
      out.write("                        <input name=\"cateID\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Add</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">ID</th>\n");
      out.write("                            <th scope=\"col\">Name</th>\n");
      out.write("                            <th scope=\"col\">Image</th>\n");
      out.write("                            <th scope=\"col\">Price</th>\n");
      out.write("                            <th scope=\"col\">Unit</th>\n");
      out.write("                            <th scope=\"col\">Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.allProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <img style=\"height: 100px; width: 100px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                </td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.unit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"delete?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"update.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </c:forEach>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
