/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author victo
 */
public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    
public String getnome() {
        return nome;
    }

public void setnome(String nome) {
        this.nome = nome;
    }
public String getdataNascimento() {
        return dataNascimento;
    }

public void setdataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
   } 

    @Override
    public String toString(){

    return "Nome: <<"+this.nome+">> Data de Nascimento: <<"+this.dataNascimento+">>";
}
    
   
}
