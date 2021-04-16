package imagen;

public class Fernet implements Drink
{
    private int cantidadHielo;
    private int cantidadCoca;
    private int cantidadFernet;
    private Boolean listo;


    public Fernet()
    {
        this.listo = false;
    }

    @Override
    public void prepare()
    {
        int hielo = 3;
        int fernet = 30;
        int coca = 70;

        this.setCantidadHielo(hielo);
        this.setCantidadFernet(fernet);
        this.setCantidadCoca(coca);
        this.listo = true;
    }

    @Override
    public Boolean drink()
    {
        if(this.getCantidadHielo() > 0 &&
            this.getCantidadFernet() > 30 &&
            this.getCantidadCoca() > 70)
        {
            return true;
        }
        return false;
    }

    public int getCantidadHielo()
    {
        return cantidadHielo;
    }

    public void setCantidadHielo(int cantidadHielo)
    {
        this.cantidadHielo = cantidadHielo;
    }

    public int getCantidadCoca()
    {
        return cantidadCoca;
    }

    public void setCantidadCoca(int cantidadCoca)
    {
        this.cantidadCoca = cantidadCoca;
    }

    public int getCantidadFernet()
    {
        return cantidadFernet;
    }

    public void setCantidadFernet(int cantidadFernet)
    {
        this.cantidadFernet = cantidadFernet;
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
        final StringBuilder sb = new StringBuilder("Fernet{");
        sb.append("cantidadHielo=").append(cantidadHielo);
        sb.append(", cantidadCoca=").append(cantidadCoca);
        sb.append(", cantidadFernet=").append(cantidadFernet);
        sb.append(", listo=").append(listo);
        sb.append('}');
        return sb.toString();
    }
}
