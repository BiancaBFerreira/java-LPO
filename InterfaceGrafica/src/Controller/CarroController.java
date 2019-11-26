/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carro;
import java.sql.*;
import java.util.ArrayList;


public class CarroController {
     private Conexao bd;
    
    
    /**
     * 
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public CarroController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }    
    
    
    /**
     * 
     * @param c 
     */
    public void insert(Carro c) throws SQLException {
       
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO carro (modelo, cor, marca, placa) VALUES (?, ?, ?, ?)");
         
        stmt.setString(1, c.getModelo());
        stmt.setString(2, c.getCor());
        stmt.setString(3, c.getMarca());
        stmt.setString(4, c.getPlaca());
         
        stmt.execute();
        stmt.close();        
    }
    
    
    /**
     * 
     * @param c 
     */
    public void update(Carro c) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("UPDATE carro SET modelo = ? cor = ?, marca = ?, placa = ? WHERE id = ?");
         
        stmt.setString(1, c.getModelo());
        stmt.setString(2, c.getCor());
        stmt.setString(3, c.getMarca());
        stmt.setString(4, c.getPlaca());
        stmt.setInt(4, c.getId());
         
        stmt.execute();
        stmt.close();        
    }
    
    
    /**
     * 
     * @param id 
     */
    public void delete(int id) throws SQLException {
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM carro WHERE id = ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
    }
    
    
    /**
     * 
     * @param id
     * @return 
     */
    public Carro getById(int id) throws SQLException {
        
        Carro c = new Carro();
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM carro WHERE id = ? ");
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close(); 
        
        return c;
    }
}
    
    
    
    
    
    
    
    
    

