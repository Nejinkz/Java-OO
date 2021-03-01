import javax.swing.JOptionPane;

public class Exercicio3{
    
    public static void main (String[] args){
    
        Double grausCetigrados; 
        Double grausFahrenheit;
        
        System.out.println("Informe a temperatura em graus Centigrados");
        grausCetigrados = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe a temperatura em graus Centigrados: "));
        
        grausFahrenheit = ((grausCetigrados * 1.8)+32);
        System.out.println("A temperatura em graus Fahrenheit é" +
        grausFahrenheit);
        
        
    
    }






}