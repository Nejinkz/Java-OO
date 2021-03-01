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
public class Hexadecimal {
        public void converter(int value){
          String hex = Integer.toHexString(value);
          System.out.println("Hexa decimal: " + hex);
    }
}
