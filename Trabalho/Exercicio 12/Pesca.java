public class Pesca
{
    private Peixe[] peixes;

    public Pesca(int numPeixes)
    {
        this.peixes = new Peixe[numPeixes];
        
        for (int i = 0; i < numPeixes; i++) {
            this.peixes[i] = new Peixe();
        }
    }

    public void setPesoPeixe(int index, double peso)
    {
        this.peixes[index].setPeso(peso);
    }
    public double getPesoPeixe(int index)
    {
        return this.peixes[index].getPeso();
    }

    public int getSize()
    {
        return this.peixes.length;
    }

    public double calculaValorMulta()
    {
        double excedente = 0;

        for (int i = 0; i < this.peixes.length; i++)
        {
            excedente += this.peixes[i].getPesoExcedente(50);    
        }

        return excedente * 4;    
    }
}