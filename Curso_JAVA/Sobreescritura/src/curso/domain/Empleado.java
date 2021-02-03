package curso.domain;

public class Empleado
{
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles()
    {
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre()
    {
        return this.nombre;
    }
}
