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
public class Binario extends Numero  {
    public void converter(int value){
       String bin = Integer.toBinaryString(value);
       System.out.println("Binario: " + bin);
      
    }
}
