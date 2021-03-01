public class Turma
{
    private Aluno[] alunos;

    public Turma(int numAlunos)
    {
        this.alunos = new Aluno[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            this.alunos[i] = new Aluno();
        }
    }

    public void setAluno(int index, String nome)
    {
        this.alunos[index].setNome(nome);
    }
    public Aluno getAluno(int index)
    {
        return this.alunos[index];
    }

    public void computaVotoAluno(int index)
    {
        this.alunos[index].computaVoto();
    }

    public int getSize()
    {
        return this.alunos.length;
    }

    public int recuperaVencedor()
    {
        int indexVencedor = 0;

        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i].contaVotos() > this.alunos[indexVencedor].contaVotos()) {
                indexVencedor = i;
            }
        }

        return indexVencedor;
    }

    public double calculaPorcentagem(int index)
    {
        return this.alunos[index].contaVotos() * 100 / this.alunos.length;
    }
}