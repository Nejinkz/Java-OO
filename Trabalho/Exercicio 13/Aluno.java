public class Aluno {
    private String nome;
    private int votos;

    public Aluno()
    {
        this.nome = "";
        this.votos = 0;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
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