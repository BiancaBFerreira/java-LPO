/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Clientes;
import Model.Modelo;
import java.sql.*;
import java.util.ArrayList;


public class ModeloController {
     private Conexao bd;

   public ModeloController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao(); 
   }
    
    public void insert( Modelo i) throws SQLException {
       
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO modelo(id,nome) VALUES (?, ?)");
         
        stmt.setInt(1, i.getId());
        stmt.setString(2, i.getNome());
    
        stmt.execute();
        stmt.close();        
    }
     public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM modelo WHERE id= ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
        
    }
     
     public void update(Modelo i) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE modelo SET  nome = ?, WHERE id= ?");
         
       
     
        stmt.setString(1, i.getNome());
       
         
        stmt.execute();
        stmt.close();       
    }
     
    
    
    
}
