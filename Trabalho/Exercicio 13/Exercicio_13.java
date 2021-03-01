import java.util.Scanner;

public class Exercicio_13
{
    public static void main(String[] args) {
        Turma turma = new Turma(5);
        Scanner read = new Scanner(System.in);
        int indexVencedor;

        for (int i = 0; i < turma.getSize(); i++) {
            System.out.print("Informe o nome do aluno: ");
            turma.setAluno(i, read.nextLine());
        }

        System.out.println("\nIniciando a votação....");

        for (int i = 0; i < turma.getSize(); i++) {
            System.out.println("Vez de votar de " + turma.getAluno(i).getNome() + ". Informe o número do candidato: ");
            turma.computaVotoAluno(read.nextInt());
            read.nextLine();
        }

        read.close();

        indexVencedor = turma.recuperaVencedor();
        System.out.println("O vencedor foi " + turma.getAluno(indexVencedor).getNome() +  " com " + turma.calculaPorcentagem(indexVencedor) + "% dos votos.");
    }
}