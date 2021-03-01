public class Peixe {
    private double peso;

    public double getPeso()
    {
        return peso;
    }
    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getPesoExcedente(double pesoPermitido)
    {
        if (this.peso > pesoPermitido)
        {
            return this.peso - pesoPermitido;
        }
        return 0;
    }
}