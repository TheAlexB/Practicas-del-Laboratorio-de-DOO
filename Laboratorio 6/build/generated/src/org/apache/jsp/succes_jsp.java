package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class succes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (session.getAttribute("usuario")==null)
        response.sendRedirect("login.jsp");
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio de sesion Correcta</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:");
 cookie() ">
       
        <h1>Inicio de sesion extiso</h1>
         <h2>Hola <%= session.getAttribute("usuario") 
      out.write("</h2>\n");
      out.write("         <h2>Email: ");
      out.print( session.getAttribute("email") );
      out.write("</h2>\n");
      out.write("         <h2>Nombre:  ");
      out.print( session.getAttribute("nombre") );
      out.write("</h2>\n");
      out.write("         <h2>Apellidos:  ");
      out.print( session.getAttribute("apellido") );
      out.write("</h2>\n");
      out.write("         <h2>Ocupacion:  ");
      out.print( session.getAttribute("ocupacion") );
      out.write("</h2>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <form action=\"SuccessController\" methos=\"POST\"/>\n");
      out.write("         Color: <select name=\"op\">\n");
      out.write("               <option name=\"\"> Seleccionar </option>\n");
      out.write("               <option name=\"aqua\" > Aqua </option>\n");
      out.write("               <option name=\"rojo\"> Rojo </option>\n");
      out.write("             \n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("         <input type=\"submit\" value=\"Guardar\"    /><br>\n");
      out.write("         </form>   \n");
      out.write("         \n");
      out.write("            \n");
      out.write("         <a href=\"LogoutController\">Cerrar Sesion</a>\n");
      out.write("         \n");
      out.write("    </form>\n");
      out.write("         \n");
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
