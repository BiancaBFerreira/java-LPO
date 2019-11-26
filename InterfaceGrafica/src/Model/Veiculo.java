/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Veiculo {
      private int id, marca,modelo;
    private String Cadastro,placa,motor,cor;
  
    
    public void setID(int i) throws Exception {
        if(i>0) {
            this.id=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
       public int getID(){
           return this.id;
       }
         public void setId(int id) {
        this.id = id;
    }
          public int getId() {
        return id;
    }
         public void setMarca(int marca) {
        this.marca = marca;
    }
        public int getMarca() {
        return marca;
    }
         public void setModelo(int modelo) {
        this.modelo = modelo;
    }
         public int getModelo() {
        return modelo;
    }
          public void setCadastro(String cadastro) {
        this.Cadastro = cadastro;
    }
             public String getCadastro() {
        return Cadastro;
    } 
        public void setPlaca(String placa) {
        this.placa = placa;
    }
         public String getPlca() {
        return placa;
    }
       public void setMotor(String motor) {
        this.motor = motor;
    } 
         public String getMotor() {
        return motor;
    }
         public void setCor(String cor ) {
        this.cor = cor;
    } 

    public String getCor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPlaca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

