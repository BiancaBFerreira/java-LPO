/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

    
import Model.Clientes;
import java.sql.*;
import java.util.ArrayList;



public class ClientesController {
 private Conexao bd;

   public ClientesController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao(); 
   }
        
        
        public void insert( Clientes c) throws SQLException {
       
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO clientes (id,RG,CEP,CPF,nome,cidade,estado,bairro,numero) VALUES (?, ?, ?, ?,?,?,?,?,?)");
         
        stmt.setInt(1, c.getId());
        stmt.setInt(2, c.getRg());
        stmt.setInt(3, c.getCep());
        stmt.setInt(4, c.getCPF());
        stmt.setString(5, c.getNome());
        stmt.setString(6, c.getCidade());
        stmt.setString(7, c.getEstado());
        stmt.setString(8, c.getBairro());
        stmt.setString(9, c.getNumero());
         
        stmt.execute();
        stmt.close();        
    }
          public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM carro WHERE id= ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
    }
    
    
    /**
     * 
     * @param id
     * @return 
     */
    public Clientes getById(int id) throws SQLException {
        
        Clientes c = new Clientes();
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM clientes WHERE id= ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
        
        return c;
    }

    public void update(Clientes c) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE carro SET  rg = ?, cep = ?, cpf = ?,nome = ?,cidade = ?,estado =?,bairro =?,numero =? WHERE id= ?");
         
       
        stmt.setInt(1, c.getRg());
        stmt.setInt(2, c.getCep());
        stmt.setInt(3, c.getCPF());
        stmt.setString(4, c.getNome());
        stmt.setString(5, c.getCidade());
        stmt.setString(6, c.getEstado());
        stmt.setString(7, c.getBairro());
        stmt.setString(8, c.getNumero());
        stmt.setInt(8, c.getId());
         
        stmt.execute();
        stmt.close();       
    }
    
    
    /**
     * 
     * @param id 
     */
   
    
    
    /**
     * 
     * @param id
     * @return 
     */
 
}
    
    
    
    
    
    
    
    
    
    


    
    
         
         
         
         
     
    

    
    
    

