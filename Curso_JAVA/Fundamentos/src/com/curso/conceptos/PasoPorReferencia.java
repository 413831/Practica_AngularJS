package com.curso.conceptos;

import com.curso.poo.domain.Persona;

public class PasoPorReferencia
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.setNombre("Pepito");
        System.out.println("persona1 = " + persona1.getNombre());

        persona1 = cambiarValor(persona1);
        System.out.println("persona1 = " + persona1.getNombre());
        
    }

    public static Persona cambiarValor(Persona persona)
    {
        if(persona == null)
        {
            return null;
        }
        persona.setNombre("Karla");
        return persona;
    }
}
