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
public class Locadora {

      private int  id_Locadora,localretirada,datahora,id_valortotal,id_valordiarias,formapagamento,quantidadedias,id_residencia;
    private String nome;
  
    
    public void setID(int a) throws Exception {
        if(a>0) {
            this.id_Locadora=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
       public int getID(){
           return this.id_Locadora;
       }
    }

    /**
     * @param args the command line arguments
     */
   
    

