package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.ResultSet;
import ConexionDB.UsuarioDB;
import Logica.Usuario;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CineDistrito | Registrar Usuario</title>\n");
      out.write("       <!-- Bootstrap -->\n");
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
      out.write("            <li class=\"nav-item px-lg-4\">\n");
      out.write("              <a class=\"nav-link text-uppercase text-expanded\" href=\"registrarUsuario.jsp\">Registrese</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("        <!-- Menu acceso -->\n");
      out.write("        <h1 class=\"site-heading d-none d-lg-block\" style=\"color:white\" align=\"center\">\n");
      out.write("            <span class=\"site-heading-lower\">Registrar Usuario</span>\n");
      out.write("        </h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form id=\"nuevoRegistro\" method=\"GET\" enctype=\"multipart/form-data\" class=\"pt-3 pb-5\">\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <div class=\"col-sm-12 col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"codigo\" style=\"color:white\">Codigo:   </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"idsnacks\" name=\"idsnacks\" placeholder=\"Codigo\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"nombre\" style=\"color:white\">Nombre: </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"apellido\" style=\"color:white\">Apellido: </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"apellido\" name=\"apellido\" placeholder=\"Apellido\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"d_ident\" style=\"color:white\">Documento de identificacion: </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"d_ident\" name=\"d_identificacion\" placeholder=\"Documento de identificacion\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"telefono\" style=\"color:white\">Telefono: </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"telefono\" name=\"telefono\" placeholder=\"Telefono\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\" style=\"color:white\">E-mail: </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"E-mail\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"f_nacimiento\" style=\"color:white\">Fecha de Nacimiento: </label>\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"f_nacimiento\" name=\"f_nacimiento\" placeholder=\"Fecha de Nacimiento\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                <input type=\"button\" value=\"Agregar\" class=\"btn btn-success\" onclick=\"submit();\">  \n");
      out.write("                <a href=\"listarUsuario.jsp\"><input type=\"button\" value=\"Ver\" class=\"btn btn-success\"  OnClick=\"submit();\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("       </form>\n");
      out.write("        ");
if (!request.getParameterMap().isEmpty()) {
          
                UsuarioDB db = new UsuarioDB();
               
          try{
                
                Usuario user = new Usuario();
                user.setIdusuario(Integer.parseInt(request.getParameter("idusuario")));
                user.setNombre(request.getParameter("nombre"));
                user.setApellido(request.getParameter("apellido"));
                user.setD_identificacion(request.getParameter("d_identificacion"));
                user.setTelefono(Integer.parseInt(request.getParameter("telefono")));
                user.setEmail(request.getParameter("email"));
                user.setF_nacimiento(request.getParameter("f_nacimiento"));
            
                db.insertarUsuario(user);
                //out.println("Numero documento ["+ producto.getK_num_documento()+"] <br>");
                out.println("Codigo ["+ user.getIdusuario()+ "] <br>");
                out.println("Nombre ["+ user.getNombre()+ "] <br>");
                out.println("Apellido ["+ user.getApellido()+ "] <br>");
                out.println("Documento Identidad ["+ user.getD_identificacion()+ "] <br>");
                out.println("Telefono ["+ user.getTelefono()+ "] <br>");
                out.println("E-mail ["+ user.getTelefono()+ "] <br>");
                out.println("Fecha Nacimiento ["+ user.getF_nacimiento()+ "] <br>");
                          
            //response.sendRedirect("listaclientes.jsp");
            }
            catch(NumberFormatException e ){
                out.println("Codigo ["+ request.getParameter("idusuario")+ "] <br>");
                out.println("Nombre ["+ request.getParameter("nombre")+ "] <br>");
                out.println("Apellido ["+ request.getParameter("apellido")+ "] <br>");
                out.println("Doc. Identidad ["+ request.getParameter("d_identificacion")+ "] <br>");
                out.println("Telefono ["+ request.getParameter("telefono")+ "] <br>");
                out.println("E-mail ["+ request.getParameter("email")+ "] <br>");
                out.println("Fecha Naci ["+ request.getParameter("f_nacimiento")+ "] <br>");
                out.println("Error --> " + "Campo requerido");
            }
            catch(Exception e1){
                 out.println("Codigo ["+ request.getParameter("idusuario")+ "] <br>");
                out.println("Nombre ["+ request.getParameter("nombre")+ "] <br>");
                out.println("Apellido ["+ request.getParameter("apellido")+ "] <br>");
                out.println("Doc. Identidad ["+ request.getParameter("d_identificacion")+ "] <br>");
                out.println("Telefono ["+ request.getParameter("telefono")+ "] <br>");
                out.println("E-mail ["+ request.getParameter("email")+ "] <br>");
                out.println("Fecha Naci ["+ request.getParameter("f_nacimiento")+ "] <br>");
                out.println("Error --> " + e1 + e1.getMessage());
            }
            
        }
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("    <!-- Pié de página -->\n");
      out.write("    <footer class=\"footer text-center py-5\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <p class=\"m-0\">\n");
      out.write("\t        <a href=\"#\" class=\"link\">\n");
      out.write("\t          <span class=\"fa-stack fa-lg\">\n");
      out.write("\t            <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("\t            <i class=\"fa fa-twitter fa-stack-1x fa-inverse\"></i>\n");
      out.write("\t          </span>\n");
      out.write("\t        </a>\n");
      out.write("\t        <a href=\"#\" class=\"link\">\n");
      out.write("\t          <span class=\"fa-stack fa-lg\">\n");
      out.write("\t            <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("\t            <i class=\"fa fa-facebook fa-stack-1x fa-inverse\"></i>\n");
      out.write("\t          </span>\n");
      out.write("\t        </a>\n");
      out.write("\t        <a href=\"#\" class=\"link\">\n");
      out.write("\t          <span class=\"fa-stack fa-lg\">\n");
      out.write("\t            <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("\t            <i class=\"fa fa-instagram fa-stack-1x fa-inverse\"></i>\n");
      out.write("\t          </span>\n");
      out.write("\t        </a>\n");
      out.write("\t    </p>\n");
      out.write("        <p class=\"m-0 mbt\">\n");
      out.write("        \t<a href=\"#\" class=\"link\" style=\"color:white\">Política de privacidad</a> ·\n");
      out.write("        \t<a href=\"#\" class=\"link\" style=\"color:white\" >Aviso legal</a> ·\n");
      out.write("        \t<a href=\"#\" class=\"link\" style=\"color:white\" >Cookies</a>\n");
      out.write("\t\t</p>\n");
      out.write("        <p class=\"m-0 mbt1\" style=\"color:white\">&copy; Cinema Distrito | Daysi Yara</p>\n");
      out.write("      </div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
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
