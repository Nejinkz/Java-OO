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
public class Convertor {
    public static void main(String[] args) {
      Binario b= new Binario();
        b.converter(15);
      Hexadecimal h= new Hexadecimal();
        h.converter(15);
      Octal o= new Octal();
        o.converter(15);
    }
}
