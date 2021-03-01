public class Candidato extends Aluno
{
    private int votos;

    public Candidato()
    {
        this.votos = 0;
    }

    public void computaVoto()
    {
        this.votos++;
    }
    public int contaVotos()
    {
        return this.votos;
    }
}