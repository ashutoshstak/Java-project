package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function f1()\n");
      out.write("            {\n");
      out.write("                a1=document.getElementById(\"t1\");\n");
      out.write("                //a1.size=40;\n");
      out.write("                //a1.type=\"password\";\n");
      out.write("                a1.type=\"date\";\n");
      out.write("            }\n");
      out.write("            function f2()\n");
      out.write("            {\n");
      out.write("                a1=document.getElementById(\"img1\");\n");
      out.write("                a1.height=100;\n");
      out.write("                a1.width=300;\n");
      out.write("                a1.src=\"st2.jpg\";\n");
      out.write("            }\n");
      out.write("            function f3()\n");
      out.write("            {\n");
      out.write("                a1=document.getElementById(\"t2\");\n");
      out.write("                a2=document.getElementById(\"t3\");\n");
      out.write("                s=a1.value;\n");
      out.write("                a2.value=s;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"text\" name=\"t1\" id=\"t1\"><br>\n");
      out.write("        <input type=\"button\" value=\"ABCD\" name=\"b1\" id=\"b1\"><br>\n");
      out.write("        <img src='st1.jpg' id=\"img1\"><br>\n");
      out.write("        <hr>\n");
      out.write("        <input type=\"button\" value=\"Click Here\" onClick=\"f1()\" /><br>\n");
      out.write("        <input type=\"button\" value=\"Click Here\" onClick=\"f2()\" /><br>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" name=\"t2\" id=\"t2\" onKeyUp=\"f3()\"><br>\n");
      out.write("        <input type=\"text\" name=\"t3\" id=\"t3\"><br>\n");
      out.write("        <input type=\"button\" value=\"Click Here\" onClick=\"f3()\" /><br>\n");
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
