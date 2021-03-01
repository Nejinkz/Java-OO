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
public abstract class Numero {
    public int value;
    public abstract void converter(int value);
      
    
    
    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
