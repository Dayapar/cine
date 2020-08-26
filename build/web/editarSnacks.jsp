<%-- 
    Document   : editarSnacks
    Created on : 24/08/2020, 08:50:04 PM
    Author     : Mizaki
--%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ConexionDB.SnacksDB"%>
<%@page import="Logica.Snacks"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CineDistrito | Editar Snacks</title>
           
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
            <span class="site-heading-lower">Editar Snacks</span>
        </h1>
            <div class="card-header text-center">
                <h2 class="titulo" style="color:white" >Información de registro</h2>
            </div>
       <div class="container">
        <form id="frmActualizarSnacks" action="ActualizarSnacks" method="POST">
             
            <table  class="table table-striped table-dark">
                <tr>
                    <td>Codigo</td>
                    <td><input type="text" id="idsnacks"  name="idsnacks" value="<%= ((Snacks)session.getAttribute("snacks")).getIdsnacks()%>"></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" id="nombre"  name="nombre" value="<%= ((Snacks)session.getAttribute("snacks")).getNombre()%>"></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><input type="text" id="precio" name="precio" value="<%= ((Snacks)session.getAttribute("snacks")).getPrecio()%>"></td>
                </tr>
                <tr>
                    <td>Cantidad</td>
                    <td><input type="text" id="cantidad" name="cantidad" value="<%= ((Snacks)session.getAttribute("snacks")).getCantidad()%>"></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="button" class="btn btn-success" value="Guardar" onclick="submit();"></td>
                </tr>                  
            </table>
        </form>
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
