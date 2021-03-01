import java.util.Scanner;
 
public class CalculoSalario {
   
    public static void main(String[] args) {
    
    Scanner sc1 = new Scanner(System.in);
    double salarioBruto = 0;
    double descontoINSS = 0;
    double descontoIR = 0;
    double salarioLiquido = 0;
   
    
    System.out.println("Insira a quantidade de horas trabalhadas:");
    double horasTrabalhadas = sc1.nextDouble();
    System.out.println("Insira o valor da hora trabalhada:");
    double valorHoraTrabalhada = sc1.nextDouble();
    System.out.println("Insira o número de dependentes:");
    double numeroDependentes = sc1.nextDouble();
   
    salarioBruto = horasTrabalhadas * valorHoraTrabalhada + (50 * numeroDependentes);
   
    
    if (salarioBruto <= 1000) {
        descontoINSS = (salarioBruto * 8.5)/100; //operações entre parênteses são feitas separadamente
    }
    if (salarioBruto > 1000) {
        descontoINSS = (salarioBruto * 9)/100;
    }
    if (salarioBruto > 500 && salarioBruto <= 1000) {
        descontoIR = (salarioBruto * 5) / 100;
    }
    if (salarioBruto > 1000) {
        descontoIR = (salarioBruto * 7) / 100;
    }
   
    salarioLiquido = salarioBruto - descontoINSS - descontoIR;
    System.out.println("Informação cálculos:\n");
    System.out.println("Salário bruto: R$" + salarioBruto);
    System.out.println("Salário líquido: R$" + salarioLiquido);
    System.out.println("Desconto INSS: R$" + descontoINSS);
    System.out.println("Desconto IR: R$" + descontoIR);
 
    }
}