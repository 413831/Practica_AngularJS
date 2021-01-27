package com.curso.poo.test;

import com.curso.poo.domain.Persona;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.setNombre("Pepito");
        persona1.setApellido("Lopez");
        persona1.mostrarInfo();

        Persona persona2 = new Persona("Manuela","Obradora",false);
        //persona2.mostrarInfo();
        System.out.println("persona2 = " + persona2);
    }
}
