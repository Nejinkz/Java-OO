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
public abstract class PessoaIMC extends Pessoa {
    protected double peso;
    protected double altura;
    
public double getpeso() {
        return peso;
    }

public void setpeso(double peso) {
        this.peso = peso;
   }
public double getaltura() {
        return altura;
    }

public void setaltura(double altura) {
        this.altura = altura;
   } 
    
public abstract void resultIMC();

    @Override
    public String toString(){

    return "Nome: <<"+this.nome+">> Data de Nascimento: <<"+this.dataNascimento+">> Peso: <<"+this.peso+">> Altura: <<"+this.altura+">>";
}

    
}
