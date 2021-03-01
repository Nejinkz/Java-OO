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
public class Mulher extends PessoaIMC {
     public void resultIMC() {
        double imc = super.getpeso()/(super.getaltura()*super.getaltura());
        if(imc <= 19){
            System.out.println("Abaixo do peso ideal:: ");
        }else if(imc > 19 && imc <= 25.8){
         System.out.println("Peso ideal:: ");
        }else{
            System.out.println("Acima do peso ideal:: ");
        }
    }
}
