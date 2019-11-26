/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Clientes;
import Model.Cor;
import Model.Marca;
import java.sql.*;
import java.util.ArrayList;

public class MarcaV {
private Conexao bd; 

public MarcaV() throws SQLException, ClassNotFoundException {
        this.bd = new Conexao();        
    }   
    public void insert( Marca i) throws SQLException {
    
    PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO marca (marca) VALUES (?)");
        
          stmt.setString(1, i.getMarca());
          stmt.execute();
          stmt.close();     
        
    } 
     public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM marca WHERE id = ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
    }
    
    public Marca getById(int id) throws SQLException {
        
        Marca i = new Marca();
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM marca WHERE id = ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
        
        return i;
    }
   public void update(Marca i) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE marca SET  marca = ?, WHERE id= ?");
         
       
        stmt.setString(1, i.getMarca());
       
         
        stmt.execute();
        stmt.close();       
    }
    
    
}
