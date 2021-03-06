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
import static java.lang.System.out;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mizaki
 */
@WebServlet(name = "CargarUsuario", urlPatterns = {"/CargarUsuario"})
public class CargarUsuario extends HttpServlet {

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
        
         try  {
            int idusuario = Integer.parseInt(request.getParameter("idx"));
            String opc = request.getParameter("opc");
            out.write(opc);
            ResultSet res = db.mostrarUsuario(idusuario);
            if (res.next()){
            user.setIdusuario(res.getInt("idusuario"));
            user.setNombre(res.getString("nombre"));
            user.setApellido(res.getString("apellido"));
            user.setD_identificacion(res.getString("d_identificacion"));
            user.setTelefono(res.getInt("telefono"));
            user.setEmail(res.getString("email"));
            user.setF_nacimiento(res.getString("f_nacimiento"));
            
            
                if(opc.equals("edit")){
                    request.getSession().setAttribute("user", user);
                    response.sendRedirect("editarUsuario.jsp"); 
                }
                if(opc.equals("delete")){
                    db.eliminarUsuario(user);
                    response.sendRedirect("listarUsuario.jsp"); 
                }
                //System.out.println("entro al try");
            }
        }catch(Exception e){
            System.out.println("No funciona Cargar usuario" + e);
            
        }finally {            
            out.close();
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
