package imagen;

public class Coffee implements Drink
{
    private int cantidadCafe;
    private int cantidadAzucar;
    private Boolean listo;



    public Coffee()
    {
        this.listo = false;
    }

    @Override
    public void prepare()
    {
        int cafe = 3;
        int azucar = 3;

        this.setCantidadCafe(cafe);
        this.setCantidadAzucar(azucar);
        this.setListo(true);
    }

    @Override
    public Boolean drink()
    {
        if(listo)
        {
            return true;
        }
        return false;
    }

    public int getCantidadAzucar()
    {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar)
    {
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadCafe()
    {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe)
    {
        this.cantidadCafe = cantidadCafe;
    }

    public Boolean getListo()
    {
        return listo;
    }

    public void setListo(Boolean listo)
    {
        this.listo = listo;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("cantidadCafe=").append(cantidadCafe);
        sb.append(", cantidadAzucar=").append(cantidadAzucar);
        sb.append(", listo=").append(listo);
        sb.append('}');
        return sb.toString();
    }
}
