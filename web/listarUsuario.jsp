<%-- 
    Document   : listarUsuario
    Created on : 25/08/2020, 08:39:03 PM
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
        <title>CineDistrito | Usuario</title>
       
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
            <span class="site-heading-lower">Usuario</span>
        </h1>
            
    <%  
        UsuarioDB db = new UsuarioDB();
        ResultSet user = db.listarUsuario();  
    %>
    <div class="container">
    <table class="mt-5 table table-responsive-md  table-striped table-dark">
            <tr>
                <thead class="dark">                    
                    <th scope="col">Codigo</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Documento de Identidad</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">E-mail</th>
                    <th scope="col">Fecha Nacimiento</th>
                    <th scope="col">Opcion</th>
                </thead>
            </tr>
                <% while (user.next()){ %>
                    <tr align="center">
                        <td><%= user.getInt("idusuario") %></td>
                        <td><%= user.getString("nombre") %></td>
                        <td><%= user.getString("apellido") %></td>
                        <td><%= user.getString("d_identificacion") %></td>
                        <td><%= user.getInt("telefono") %></td>
                        <td><%= user.getString("email") %></td>
                        <td><%= user.getDate("f_nacimiento") %></td>
                        <td class="links">
                            <a href="CargarUsuario?opc=edit&idx=<%= user.getInt("idusuario") %>">Editar</a>
                            <a href="CargarUsuario?opc=delete&idx=<%= user.getInt("idusuario") %>">Borrar</a>
                        </td>
                    </tr>
                <% }%>
                <tr>
                 
            </tr>

        </table>
                <br><br>
                <td colspan="5" class="links" align="center"><a href="registrarUsuario.jsp"><input type="button" class="btn btn-success" value="Añadir" onclick="submit();"></a></td>
                <%--<td colspan="5" class="links"><a class="btn btn-success" href="editarSnacks.jsp">Ver</a></td>--%>
            
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
