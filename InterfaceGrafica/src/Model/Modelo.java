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
public class Modelo {
      private int  id;
    private String Nome;
    
    
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
            public void setNome(String nome) {
        this.Nome = nome;
    }
       public  String getNome(){
           return this.Nome;
       }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       }
    

