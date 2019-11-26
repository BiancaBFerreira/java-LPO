/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cor;
import java.sql.*;
import java.util.ArrayList;

 
public class CorController {
   private Conexao bd;
    
       public CorController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }   
    public void insert(Cor i) throws SQLException {
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO cor (cor) VALUES (?)");
        
          stmt.setString(1, i.getCor());
          stmt.execute();
          stmt.close();     
        
    }
    
    public void update(Cor i) throws SQLException {  
       
       PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE cor SET cor = ? WHERE id = ?");
       
   stmt.setString(1, i.getCor());
          stmt.execute();
          stmt.close();
       
         }
       public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM cor WHERE id = ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
    }
        public Cor getById(int id) throws SQLException {
        
        Cor i = new Cor();
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM cor WHERE id = ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
        
        return i;
    }
       
}
