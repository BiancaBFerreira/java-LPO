/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Clientes;
import Model.Veiculo;
import java.sql.*;
import java.util.ArrayList;


public class VeiculoController {
        private Conexao bd;
        public VeiculoController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao(); 
   }
        
        
        public void insert( Veiculo i) throws SQLException {
       
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO clientes (id,marca,modelo,cadastro,placa,motor,cor) VALUES (?, ?, ?, ?,?,?,?)");
         
        stmt.setInt(1, i.getId());
        stmt.setInt(2, i.getMarca());
        stmt.setInt(3, i.getModelo());
        stmt.setString(4, i.getCadastro());
        stmt.setString(5, i.getPlaca());
        stmt.setString(6, i.getMotor());
        stmt.setString(7, i.getCor());
        
         
        stmt.execute();
        stmt.close();        
    }
    
    
    public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM veiculo WHERE id= ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
    }

    /**
     *
     * @param id
     * @throws SQLException
     */
      
      
       public void update(Veiculo i) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE carro SET  marca = ?, modelo = ?, cadastro = ?,placa = ?,motor = ?,cor =? WHERE id= ?");
         
       
               
        stmt.setInt(1, i.getId());
        stmt.setInt(2, i.getMarca());
        stmt.setInt(3, i.getModelo());
        stmt.setString(4, i.getCadastro());
        stmt.setString(5, i.getPlaca());
        stmt.setString(6, i.getMotor());
        stmt.setString(7, i.getCor());
         
        stmt.execute();
        stmt.close();       
    }
    
    
}
