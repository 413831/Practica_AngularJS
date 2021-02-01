package curso.mundopc;

public class Computadora
{
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadoras;

    private Computadora()
    {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse)
    {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public int getIdComputadora()
    {
        return this.idComputadora;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Monitor getMonitor()
    {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public Teclado getTeclado()
    {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado)
    {
        this.teclado = teclado;
    }

    public Mouse getMouse()
    {
        return this.mouse;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }
}
