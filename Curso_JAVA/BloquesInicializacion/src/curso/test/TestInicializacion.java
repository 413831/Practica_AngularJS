package curso.test;

import curso.domain.Persona;

public class TestInicializacion
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona();
        System.out.println("person2 = " + persona2);
    }
}
