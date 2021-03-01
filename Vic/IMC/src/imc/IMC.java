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
public class IMC {

  
    public static void main(String[] args) {
       Homem h = new Homem();
        
        h.setnome("Carlin");
        h.setdataNascimento("15/05/1982");
        h.setaltura(1.98);
        h.setpeso(85);
        h.resultIMC();
        
        Mulher m = new Mulher();
        
        m.setnome("Sarinha kikada fatal");
        m.setdataNascimento("15/05/2003");
        m.setaltura(1.67);
        m.setpeso(85);
        m.resultIMC();
    }
    
}
