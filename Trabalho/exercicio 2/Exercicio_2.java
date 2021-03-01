import java.util.Scanner;
public class Exercicio_2{
    public static void main(String[] args){
    
        Scanner entrada = new Scanner (System.in);
        int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
        
        System.out.println("Calculadora de idade em \n\n"); 
        
         System.out.println("Digite os anos: ");
         IdadeAnos = entrada.nextInt();
         
         
         System.out.println("Digite os meses: ");
         IdadeMeses = entrada.nextInt();
         
         
         
         System.out.println("Digite os dias: ");
         IdadeDias = entrada.nextInt();
         
         IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
         System.out.println("Idade total em dias =" +IdadeTotalDias+"\n");
    
    }




}