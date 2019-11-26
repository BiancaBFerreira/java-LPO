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
public class Telefone {
      private int ID,Numero;
   
    
    public void setID(int i) throws Exception {
        if(i>0) {
            this.Numero=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
     public void setTelefone(int ID) {
        this.ID = ID;
    }
       public int getID(){
           return this.ID;
       }
  
       public void setNumero(int Numero) {
        this.Numero= Numero;
    }
              public int getNumero(){
           return this.ID;
       
       
       

              }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

