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
public class Clientes {
   
    private int id,RG,CEP,CPF;
    private String nome,cidade,estado,endereco,bairro,numero;
  
    
    public void setID(int c) throws Exception {
        if(c>0) {
            this.id=1;
       } else {
          throw new Exception("Id nÃ£o pode ser igual a zero ou menor que zero");
        }
     
        }
       public int getId(){
           return this.id;
       }
          public void setId(int id) {
        this.id = id;
    }
        public int getRg() {
        return this.RG;
    }
        public int setRg() {
        return this.RG;
    }
        
         public int getCep() {
        return this.CEP;
    }

     public int setCep() {
        return this.CEP;
    }
      public int getCPF() {
        return this.CPF;
    }
      public int setCPF() {
        return this.CPF;
    }
        public String getNome() {
        return nome;
    }

      public void setNome(String nome) {
        this.nome = nome;
    }
          public String getCidade() {
        return cidade;
    }
      public void setCidade(String cidade) {
        this.cidade = cidade;
    }
        public String getEstado() {
        return estado;
    }
        public void setEstado(String estado) {
        this.estado = estado;
    } 
        public String getEndereco() {
        return endereco;
    }
        public void setEndereco(String endereco) {
        this.endereco= endereco;
    } 
             public String getBairro() {
        return bairro;
    }
          public void setBairro(String bairro) {
        this.bairro= bairro;
    } 
      public String getNumero() {
        return numero;
    }
            public void setNumero(String Numero) {
        this.numero= numero;
    } 
        
    }
       
       
       
       
    


