package curso.test;

import curso.domain.Persona;

public class TestArreglosObject
{
    public static void main(String[] args)
    {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Pepito");
        personas[1] = new Persona("Manolo");

        System.out.println("personas = " + personas);

        for (int i = 0; i < personas.length; i++)
        {
            System.out.println("Indice = " + i);
            System.out.println(personas[i]);
        }
    }
}
