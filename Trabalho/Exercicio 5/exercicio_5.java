import java.util.Scanner;
  public class exercicio_5{
    
 public static void main(String[] args){

    int codigo;
    int anoN, mesN, diaN, idade;
    int anoI, mesI, diaI, anosE;
    
    Scanner le = new Scanner(System.in);
    
    System.out.println("Digite o codigo do empregado ::");
    codigo = le.nextInt();
    
    System.out.println("Digite a data de nascimento x/y/zzzz");
    
    System.out.println("dia de nascimento::");
    diaN = le.nextInt();
    
    System.out.println("mes e nascimento:: ");
    mesN = le.nextInt();
    
    System.out.println("Ano de nascimento:: ");
    anoN = le.nextInt();
    
    
    
    System.out.println("Digite a data de ingressao x/y/zzzz");
    
    System.out.println("dia de ingressao::");
    diaI = le.nextInt();
    
    System.out.println("mes e ingressao:: ");
    mesI = le.nextInt();
    
    System.out.println("Ano de ingressao:: ");
    anoI = le.nextInt();
    
    idade= (2020 - anoN);
    System.out.println("O empregado de N= ::" +codigo+ " possui no ano de 2020 a idade de ::"
     +idade+"anos");
    
    anosE = (2020 - anoI);
    System.out.println("O empregado de N= ::" +codigo+ " possui no ano de 2020::"
    +anosE+" anos trabalhados na empresa");
    
    System.out.println("Condição 1: 65 anos de idade ou 30 trabalhados");
    if(idade>=65 && anosE >= 30){
        System.out.println("Requerer aposentadoria");
    
    }else{
        System.out.println("Não requerer");
    }
    
    

}
   




















}