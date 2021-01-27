package domain;

public class Persona
{
    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    public Persona(String nombre)
    {
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++;
        this.idPersona = Persona.contadorPersona;
    }

    public static int getContadorPersona()
    {
        return Persona.contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersonas)
    {
        Persona.contadorPersona = aContadorPersonas;
    }

    @Override
    public String toString()
    {
        return "Persona {" + "idPersona=" + this.idPersona + ", nombre='" + this.nombre + '\'' + '}';
    }
}
