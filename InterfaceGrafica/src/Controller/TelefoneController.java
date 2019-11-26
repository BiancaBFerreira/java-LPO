/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Telefone;
import java.sql.*;
import java.util.ArrayList;

public class TelefoneController {
     private Conexao bd;

    public TelefoneController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao(); 
        }
   
    public void insert( Telefone i) throws SQLException {
       
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO telefone (id,telefone,clientes) VALUES (?, ?)");
         
        stmt.setInt(1, i.getId());
        stmt.setInt(2, i.getNumero());
     
      

        stmt.execute();
        stmt.close();        
    }
 
 
     public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM telefone WHERE id= ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
    }
 public void update(Model.Telefone i) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE telefone SET  numero = ?, WHERE id= ?");
         
       
        stmt.setInt(1, i.getNumero());
       
         
        stmt.execute();
        stmt.close();       
    }



}