public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public boolean saca(double valor)
    {
        if (valor <= this.limite)
        {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getNumero()
    {
        return numero;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void deposita(double valor)
    {
        this.saldo += valor;
    }

    public void transfere(Conta destino, double valor)
    {
        if (valor <= this.limite)
        {
            this.saldo -= valor;
            destino.deposita(valor);
        }
    }
}