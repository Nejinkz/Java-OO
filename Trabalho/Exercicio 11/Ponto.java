public class Ponto {
    private int coordX;
    private int coordY;

    public Ponto(int coordX, int coordY)
    {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX()
    {
        return coordX;
    }
    public void setCoordX(int coordX)
    {
        this.coordX = coordX;
    }

    public int getCoordY()
    {
        return coordY;
    }
    public void setCoordY(int coordY)
    {
        this.coordY = coordY;
    }

    public double calculaDistancia(Ponto pd)
    {
        return Math.sqrt(
            Math.pow((this.getCoordX() - pd.getCoordX()),2) +
            Math.pow((this.getCoordY() - pd.getCoordY()),2)
        );
    }
}