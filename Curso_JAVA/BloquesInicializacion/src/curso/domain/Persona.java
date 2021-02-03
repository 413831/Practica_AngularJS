package curso.domain;

public class Persona
{
    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicialización estático
    static
    {
        System.out.println("Ejecucion bloque estatico");
        Persona.contadorPersonas = 0;
    }

    // Bloque de inicialización no-estático o dinámico
    {
        System.out.println("Ejecución bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona()
    {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona()
    {
        return idPersona;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
