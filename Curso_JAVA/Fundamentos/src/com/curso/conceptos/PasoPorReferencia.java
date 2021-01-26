package com.curso.conceptos;

import com.curso.poo.clases.Persona;

public class PasoPorReferencia
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.nombre = "Pepito";
        System.out.println("persona1 = " + persona1.nombre);

        persona1 = cambiarValor(persona1);
        System.out.println("persona1 = " + persona1.nombre);
        
    }

    public static Persona cambiarValor(Persona persona)
    {
        if(persona == null)
        {
            return null;
        }
        persona.nombre = "Karla";
        return persona;
    }
}
