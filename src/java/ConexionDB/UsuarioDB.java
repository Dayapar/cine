/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import Logica.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;/*

/**
 *
 * @author Mizaki
 */
public class UsuarioDB {
      Conexion con;
    

    public UsuarioDB() {

        con = new Conexion();

    }

    // mostrar solo un producto
     public ResultSet mostrarUsuario (int id) throws SQLException{
    
          PreparedStatement pstm = con.getConexion().prepareStatement(" "
                + "SELECT * FROM usuario "
                + "WHERE  idusuario = ?");
       
        pstm.setInt(1, id);
        ResultSet res = pstm.executeQuery();
        return res;
    }
     
     public ResultSet mostrarUsuarioByName (String name) throws SQLException{
    
          PreparedStatement pstm = con.getConexion().prepareStatement(" "
                + "SELECT * FROM usuario "
                + "WHERE  nombre = '"
                +"?"
                +"'");
       
        pstm.setString(2, name);//confirmar la posicion
        ResultSet res = pstm.executeQuery();
        return res;
    } 
         
    public ResultSet listarUsuario() throws SQLException{
            PreparedStatement pstm = con.getConexion().prepareStatement(" "
                + "SELECT idusuario,nombre,apellido,d_identificacion,telefono,email,f_nacimiento FROM usuario");
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
         
     public void insertarUsuario (Usuario user){         
         try {            
            PreparedStatement pstm = con.getConexion().prepareStatement(""
                    + "INSERT INTO usuario (idusuario,nombre,apellido,d_identificacion,telefono,email,f_nacimiento) VALUES (?,?,?,?,?,?,?)");
            pstm.setLong(1, user.getIdusuario());
            pstm.setString(2, user.getNombre());
            pstm.setString(3, user.getApellido());
            pstm.setString(4, user.getD_identificacion());
            pstm.setLong(5, user.getTelefono());
            pstm.setString(6, user.getEmail());
            pstm.setString(7, user.getF_nacimiento());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }  
     
     public void insertarUsuario() {
        try {
            
           PreparedStatement pstm = con.getConexion().prepareStatement(""
                     + "INSERT INTO usuario (idusuario,nombre,apellido,d_identificacion,telefono,email,f_nacimiento) VALUES (?,?,?,?,?,?,?)");
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     
    
     public void actualizarUsuario (Usuario user){
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement("UPDATE usuario SET nombre=?,apellido=?,d_identificacion=?,telefono=?,email=?,f_nacimiento=? WHERE idusuario=?");
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getD_identificacion());
            ps.setLong(4, user.getTelefono());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getF_nacimiento());
            ps.setLong(7, user.getIdusuario());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("No actualizó UsuarioDB");
        }
     }
     
    public void eliminarUsuario (Usuario c){
           PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement("DELETE FROM usuario WHERE idusuario=?");
            ps.setLong(1,c.getIdusuario());
            ps.executeUpdate();
           } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
     public void eliminarUsuario (int id){
        PreparedStatement ps;
       try {
            ps = con.getConexion().prepareStatement("DELETE FROM usuario WHERE idusuario=?");
            ps.setLong(1,id);
            ps.executeUpdate();
           } catch (Exception e) {
            System.out.println(e.toString());
        }
    }  

//    public void setIdusuario(int aInt) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
