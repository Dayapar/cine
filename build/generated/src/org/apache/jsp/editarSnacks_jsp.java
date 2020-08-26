package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.ResultSet;
import ConexionDB.SnacksDB;
import Logica.Snacks;

public final class editarSnacks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CineDistrito | Editar Snacks</title>\n");
      out.write("           \n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Fuentes -->\n");
      out.write("    <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Estilos -->\n");
      out.write("    <link href=\"css/business-casual.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <!-- Menu acceso -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-dark row justify-content-center\">\n");
      out.write("        <a href=\"index.jsp\" class=\"navbar-brand pl-3\">\n");
      out.write("          <div>\n");
      out.write("          <img src=\"img/logo.png\" width=\"auto\" height=\"40%\" alt=\"logo\" align=\"center\">\n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("      </nav>\n");
      out.write("    <br /><br />\n");
      out.write("         <!-- Navegación -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark py-lg-4\" id=\"mainNav\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none\" href=\"index.jsp\">Cinema Distrito</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("          <ul class=\"navbar-nav mx-auto\">\n");
      out.write("            <li class=\"nav-item active px-lg-4\">\n");
      out.write("              <a class=\"nav-link text-uppercase text-expanded\" href=\"index.jsp\">Inicio</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item px-lg-4\">\n");
      out.write("              <a class=\"nav-link text-uppercase text-expanded\" href=\"listarSnacks.jsp\">Snacks</a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item px-lg-4\">\n");
      out.write("              <a class=\"nav-link text-uppercase text-expanded\" href=\"consultarUsuario.jsp\">Consultar Usuario</a>\n");
      out.write("            </li> \n");
      out.write("          ");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("          <!-- Menu acceso -->\n");
      out.write("        <h1 class=\"site-heading d-none d-lg-block\" style=\"color:white\" align=\"center\">\n");
      out.write("            <span class=\"site-heading-lower\">Snacks</span>\n");
      out.write("        </h1>\n");
      out.write("            <div class=\"card-header text-center\">\n");
      out.write("                <h2 class=\"titulo\">Información de registro</h2>\n");
      out.write("            </div>\n");
      out.write("            <form id=\"frmActualizarSnacks\" action=\"ActualizarSnacks\" method=\"POST\">\n");
      out.write("             \n");
      out.write("        <table  class=\"table table-striped table-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Codigo</td>\n");
      out.write("                <td><input type=\"text\" id=\"idsnacks\"  name=\"idsnacks\" value=\"");
      out.print( ((Snacks)session.getAttribute("snacks")).getIdsnacks());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nombre</td>\n");
      out.write("                <td><input type=\"text\" id=\"nombre\"  name=\"nombre\" value=\"");
      out.print( ((Snacks)session.getAttribute("snacks")).getNombre());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Precio</td>\n");
      out.write("                <td><input type=\"text\" id=\"precio\" name=\"precio\" value=\"");
      out.print( ((Snacks)session.getAttribute("snacks")).getPrecio());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Cantidad</td>\n");
      out.write("                <td><input type=\"text\" id=\"cantidad\" name=\"cantidad\" value=\"");
      out.print( ((Snacks)session.getAttribute("snacks")).getCantidad());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><input type=\"button\" class=\"btn btn-success\" value=\"Guardar\" onclick=\"submit();\"></td>\n");
      out.write("            </tr>                  \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
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
