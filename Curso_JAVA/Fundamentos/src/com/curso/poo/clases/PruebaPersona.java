package com.curso.poo.clases;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.nombre = "Pepito";
        persona1.apellido = "Lopez";
        persona1.setSueldo(5000);
        persona1.mostrarInfo();

        Persona persona2 = new Persona("Manuela","Obradora",80000,false);
        //persona2.mostrarInfo();
        System.out.println("persona2 = " + persona2);
    }
}
