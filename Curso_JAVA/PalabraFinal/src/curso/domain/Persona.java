package curso.domain;

public final class Persona
{
    public final static double CONSTANTE = 3.144444444;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    private String nombre;

    public final void imprimir()
    {
        System.out.println("Metodo imprimir");
    }

}
