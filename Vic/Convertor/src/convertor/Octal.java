/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor;

/**
 *
 * @author victo
 */
public class Octal {
      public void converter(int value){
        String oct = Integer.toOctalString(value);
        System.out.println("Octal: " + oct);
    }
}

