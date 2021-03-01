import java.util.Scanner;

public class Exercicio_12
{
    public static void main(String args[])
    {
        Pesca pesca;
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos peixes foram pescados? ");
        pesca = new Pesca(read.nextInt());
        read.nextLine();

        for (int i = 0; i < pesca.getSize(); i++) {
            System.out.print("Informe o peso do peixe " + ( i+1 ) + ": ");
            pesca.setPesoPeixe(i, read.nextDouble());
            read.nextLine();
        }

        read.close();

        System.out.println("O valor da multa a ser paga é " + pesca.calculaValorMulta());
    } 
}