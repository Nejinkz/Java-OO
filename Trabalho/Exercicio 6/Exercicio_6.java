import java.util.Scanner;
public class Exercicio_6{
    
    public static void main(String[] args){
        
        int h1, h2, m1, m2;
         
        int aux1, aux2, soma, soma2;
        Scanner le = new Scanner(System.in);
        System.out.println("Digite a idade do homem mais velho: ");
        h1 = le.nextInt();
        System.out.println("Digite a idade do homem mais novo: ");
        h2 = le.nextInt();
        System.out.println("Digite a idade da mulher mais velha: ");
        m1 = le.nextInt();
        System.out.println("Digite a idade da mulher mais nova: ");
        m2 = le.nextInt();
        if(h1 > h2){
        aux1 = h1;
        
        
        }else{
        
            aux1=h2;
        
        
        
        }if(m1 > m2){
        
        aux2=m2;
        
        }else{
        
         aux2=m1;
              
        }
        soma = aux1 + aux2;
        System.out.println(soma);
       
        
        
        
        }
        
        }
       
        
    
    
    
    
        
        
    
    
    








