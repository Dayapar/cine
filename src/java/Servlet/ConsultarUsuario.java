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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mizaki
 */
public class ConsultarUsuario extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        Usuario consultar = new Usuario();
        UsuarioDB usuarioDB = new UsuarioDB();
        PrintWriter out = response.getWriter();
        
        int idusuario = Integer.parseInt(request.getParameter("idusuario"));
        String nombre = request.getParameter("nombre");
        ResultSet res = usuarioDB.mostrarUsuario(idusuario);
        //ResultSet rs = usuarioDB.mostrarUsuarioByName(nombre);    

    
            
        try {
//           if(nombre.length() != 0){ 
//         
//                    if(rs.next()){
//                    consultar.setIdusuario(rs.getInt("idusuario"));                     
//                    consultar.setNombre(rs.getString("nombre"));
//                    consultar.setApellido(rs.getString("apellido"));
//                    consultar.setD_identificacion(rs.getString("d_identificacion")); 
//                    consultar.setTelefono(rs.getInt("telefono"));
//                    consultar.setEmail(rs.getString("email"));
//                    consultar.setF_nacimiento(rs.getString("f_nacimiento"));
//                }   
//            }else{
                    if(res.next()){
                    consultar.setIdusuario(res.getInt("idusuario"));                     
                    consultar.setNombre(res.getString("nombre"));
                    consultar.setApellido(res.getString("apellido"));
                    consultar.setD_identificacion(res.getString("d_identificacion")); 
                    consultar.setTelefono(res.getInt("telefono"));
                    consultar.setEmail(res.getString("email"));
                    consultar.setF_nacimiento(res.getString("f_nacimiento"));
                //}   
            }
                 
            request.getSession().setAttribute("consultar", consultar);              
            response.sendRedirect("resultadobusqueda.jsp");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
