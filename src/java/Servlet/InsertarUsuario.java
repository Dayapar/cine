/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import ConexionDB.UsuarioDB;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mizaki
 */
@WebServlet(name = "InsertarUsuario", urlPatterns = {"/InsertarUsuario"})
public class InsertarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        Usuario user = new Usuario();
        UsuarioDB db = new UsuarioDB();
        
         try {
            user.setIdusuario(Integer.parseInt(request.getParameter("idusuario")));
            user.setNombre(request.getParameter("nombre"));
            user.setApellido(request.getParameter("apellido"));
            user.setD_identificacion(request.getParameter("d_identificacion"));
            user.setTelefono(Integer.parseInt(request.getParameter("telefono")));
            user.setEmail(request.getParameter("email"));
            user.setF_nacimiento(request.getParameter("f_nacimiento"));
            
            
            db.insertarUsuario(user);
            
            out.println("Codigo ["+ user.getIdusuario()+ "] <br>");
            out.println("Nombre ["+ user.getNombre()+ "] <br>");
            out.println("Apellido ["+ user.getApellido()+ "] <br>");
            out.println("Documento Identidad ["+ user.getD_identificacion()+ "] <br>");
            out.println("Telefono ["+ user.getTelefono()+ "] <br>");
            out.println("E-mail ["+ user.getTelefono()+ "] <br>");
            out.println("Fecha Nacimiento ["+ user.getF_nacimiento()+ "] <br>");
            
        } catch(NumberFormatException e ){
               // out.println("Id ["+ producto.getIdsnacks()+"] <br>");
            out.println("Codigo ["+ user.getIdusuario()+ "] <br>");
            out.println("Nombre ["+ user.getNombre()+ "] <br>");
            out.println("Apellido ["+ user.getApellido()+ "] <br>");
            out.println("Documento Identidad ["+ user.getD_identificacion()+ "] <br>");
            out.println("Telefono ["+ user.getTelefono()+ "] <br>");
            out.println("E-mail ["+ user.getTelefono()+ "] <br>");
            out.println("Fecha Nacimiento ["+ user.getF_nacimiento()+ "] <br>");
            out.println("Error --> " + "Campo requerido");
            }
            catch(Exception e){
                out.println("Codigo ["+ user.getIdusuario()+ "] <br>");
                out.println("Nombre ["+ user.getNombre()+ "] <br>");
                out.println("Apellido ["+ user.getApellido()+ "] <br>");
                out.println("Documento Identidad ["+ user.getD_identificacion()+ "] <br>");
                out.println("Telefono ["+ user.getTelefono()+ "] <br>");
                out.println("E-mail ["+ user.getTelefono()+ "] <br>");
                out.println("Fecha Nacimiento ["+ user.getF_nacimiento()+ "] <br>");
                out.println("Error --> " + e + e.getMessage());
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
