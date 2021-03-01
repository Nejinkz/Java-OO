public class Eleicao
{
    private Candidato[] candidatos;

    public Eleicao(int numCandidatos)
    {
        this.candidatos = new Candidato[numCandidatos];

        for (int i = 0; i < numCandidatos; i++)
        {
            this.candidatos[i] = new Candidato();
        }
    }
}