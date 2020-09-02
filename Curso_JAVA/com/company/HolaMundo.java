package com.company;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args)
    {
        // Salida por pantalla
        System.out.println("Hola mundo desde Java");
        // Variables
        int numeroEntero; // declaracion
        String nombre;

        numeroEntero = 10; // asignacion
        nombre = "Pepito";

        System.out.println(numeroEntero);
        System.out.println(nombre);

        // Inferencia de tipos - Java 10
        var numeroIndefinido = 365; // Se requiere inicializar en la declaracion
        var stringIndefinido = "Palabrita";

        System.out.println("stringIndefinido = " + stringIndefinido);

        // Identificadores permitidos y recomendados
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;

        // Scanner
        Scanner console = new Scanner(System.in);

        System.out.println("Proporciona el titulo:");
        var titulo = console.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = console.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);


    }
}
