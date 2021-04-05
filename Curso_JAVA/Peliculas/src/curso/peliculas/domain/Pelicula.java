package curso.peliculas.domain;

public class Pelicula
{
    private String nombre;

    // Constructores
    public Pelicula()
    {}

    public Pelicula(String nombre)
    {
        this.nombre = nombre;
    }

    // Getter & Setter
    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }
}
