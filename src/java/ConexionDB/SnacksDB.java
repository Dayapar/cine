/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;
import Logica.Snacks;
import java.sql.*;

/**
 *
 * @author Mizaki
 */
public class SnacksDB {
    Conexion con;
    

    public SnacksDB() {

        con = new Conexion();

    }

    // mostrar solo un producto
     public ResultSet mostrarSnacks (int id) throws SQLException{
    
          PreparedStatement pstm = con.getConexion().prepareStatement(" "
                + "SELECT * FROM snacks "
                + "WHERE  idsnacks = ?");
       
        pstm.setInt(1, id);
        ResultSet res = pstm.executeQuery();
        return res;
    }
         
    public ResultSet listarSnacks() throws SQLException{
            PreparedStatement pstm = con.getConexion().prepareStatement(" "
                + "SELECT idsnacks,nombre,precio,cantidad FROM snacks");
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
         
     public void insertarSnacks (Snacks producto){         
         try {            
            PreparedStatement pstm = con.getConexion().prepareStatement(""
                    + "INSERT INTO snacks (idsnacks,nombre,precio,cantidad) VALUES (?,?,?,?)");
            pstm.setLong(1, producto.getIdsnacks());
            pstm.setString(2, producto.getNombre());
            pstm.setLong(3, producto.getPrecio());
            pstm.setLong(4, producto.getCantidad());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }  
     
     public void insertarSnacks() {
        try {
            
           PreparedStatement pstm = con.getConexion().prepareStatement(""
                    + "INSERT INTO snacks (idsnacks,nombre,precio,cantidad) VALUES (?,?,?,?)");
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     
    
     public void actualizarSnacks (Snacks producto){
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement("UPDATE snacks SET nombre=?,precio=?,cantidad=? WHERE idsnacks=?");
            ps.setString(1, producto.getNombre());
            ps.setLong(2, producto.getPrecio());
            ps.setLong(3, producto.getCantidad());
            ps.setLong(4, producto.getIdsnacks());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("No actualizó");
        }
     }
     
    public void eliminarSnacks (Snacks c){
           PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement("DELETE FROM snacks WHERE idsnacks=?");
            ps.setLong(1,c.getIdsnacks());
            ps.executeUpdate();
           } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
     public void eliminarSnacks (int id){
        PreparedStatement ps;
       try {
            ps = con.getConexion().prepareStatement("DELETE FROM snacks WHERE idsnacks=?");
            ps.setLong(1,id);
            ps.executeUpdate();
           } catch (Exception e) {
            System.out.println(e.toString());
        }
    }  
}
