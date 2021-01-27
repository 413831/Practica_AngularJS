package test;

import domain.Persona;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona("Pepito");
        Persona persona2 = new Persona("Manuela");

        PruebaPersona.imprimir(persona1);
        PruebaPersona.imprimir(persona2);
    }

    public static void imprimir(Persona persona)
    {
        System.out.println("persona = " + persona);
    }
}
