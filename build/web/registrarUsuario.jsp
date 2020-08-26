<%-- 
    Document   : registrarUsuario
    Created on : 25/08/2020, 08:14:03 PM
    Author     : Mizaki
--%>

<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ConexionDB.UsuarioDB"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CineDistrito | Registrar Usuario</title>
       <!-- Bootstrap -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Fuentes -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">

    <!-- Estilos -->
    <link href="css/business-casual.css" rel="stylesheet">

      
    </head>
    <body>
  <!-- Menu acceso -->
      <nav class="navbar navbar-expand-lg navbar-dark row justify-content-center">
        <a href="index.jsp" class="navbar-brand pl-3">
          <div>
          <img src="img/logo.png" width="auto" height="40%" alt="logo" align="center">
          </div>
        </a>
      </nav>
    <br /><br />
         <!-- Navegación -->
    <nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
      <div class="container">
        <a class="navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none" href="index.jsp">Cinema Distrito</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav mx-auto">
            <li class="nav-item active px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="index.jsp">Inicio</a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="listarSnacks.jsp">Snacks</a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="listarUsuario.jsp">Ver Usuarios</a>
            </li>
             <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="consultarUsuario.jsp">Consultar Usuario</a>
            </li> 
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="registrarUsuario.jsp">Registrese</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
        <!-- Menu acceso -->
        <h1 class="site-heading d-none d-lg-block" style="color:white" align="center">
            <span class="site-heading-lower">Registrar Usuario</span>
        </h1>
        <div class="container">
        <form id="nuevoRegistro" method="GET" enctype="multipart/form-data" class="pt-3 pb-5">
            <div class="row ">
                <div class="col-sm-12 col-md-6">
                    <div class="form-group">
                        <label for="codigo" style="color:white">Codigo:   </label>
                        <input type="text" class="form-control" id="idsnacks" name="idusuario" placeholder="Codigo">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="nombre" style="color:white">Nombre: </label>
                        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="apellido" style="color:white">Apellido: </label>
                        <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Apellido">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="d_ident" style="color:white">Documento de identificacion: </label>
                        <input type="text" class="form-control" id="d_ident" name="d_identificacion" placeholder="Documento de identificacion">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="telefono" style="color:white">Telefono: </label>
                        <input type="text" class="form-control" id="telefono" name="telefono" placeholder="Telefono">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="email" style="color:white">E-mail: </label>
                        <input type="text" class="form-control" id="email" name="email" placeholder="E-mail">
                    </div>
                    <br>
                    <div class="form-group">
                        <label for="f_nacimiento" style="color:white">Fecha de Nacimiento: </label>
                        <input type="date" class="form-control" id="f_nacimiento" name="f_nacimiento" placeholder="Fecha de Nacimiento">
                    </div>
                    <br>
                <input type="button" value="Agregar" class="btn btn-success" onclick="submit();">  
                <a href="listarUsuario.jsp"><input type="button" value="Ver" class="btn btn-success"  OnClick="submit();"></a>
                </div>
            </div>
       </form>
        <%if (!request.getParameterMap().isEmpty()) {
          
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
            
        }%>
    </div>
    
    <br><br>
    <!-- Pié de página -->
    <footer class="footer text-center py-5">
      <div class="container">
        <p class="m-0">
	        <a href="#" class="link">
	          <span class="fa-stack fa-lg">
	            <i class="fa fa-circle fa-stack-2x"></i>
	            <i class="fa fa-twitter fa-stack-1x fa-inverse"></i>
	          </span>
	        </a>
	        <a href="#" class="link">
	          <span class="fa-stack fa-lg">
	            <i class="fa fa-circle fa-stack-2x"></i>
	            <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
	          </span>
	        </a>
	        <a href="#" class="link">
	          <span class="fa-stack fa-lg">
	            <i class="fa fa-circle fa-stack-2x"></i>
	            <i class="fa fa-instagram fa-stack-1x fa-inverse"></i>
	          </span>
	        </a>
	    </p>
        <p class="m-0 mbt">
        	<a href="#" class="link" style="color:white">Política de privacidad</a> ·
        	<a href="#" class="link" style="color:white" >Aviso legal</a> ·
        	<a href="#" class="link" style="color:white" >Cookies</a>
		</p>
        <p class="m-0 mbt1" style="color:white">&copy; Cinema Distrito | Daysi Yara</p>
      </div>
	</footer>

    <!-- Bootstrap -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
