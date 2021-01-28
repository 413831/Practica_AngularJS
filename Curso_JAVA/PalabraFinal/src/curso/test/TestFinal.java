package curso.test;

import curso.domain.Persona;

public class TestFinal
{
    public static void main(String[] args)
    {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        final Persona persona1 = new Persona();
        System.out.println("Nombre = " + persona1.getNombre());
    }
}
