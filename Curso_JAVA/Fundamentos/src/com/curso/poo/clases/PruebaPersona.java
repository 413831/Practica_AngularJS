package com.curso.poo.clases;

public class PruebaPersona
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.nombre = "Pepito";
        persona1.apellido = "Lopez";
        persona1.mostrarInfo();

        Persona persona2 = new Persona();
        persona2.nombre = "Lucinda";
        persona2.apellido = "Garcia";
        persona2.mostrarInfo();
    }
}
