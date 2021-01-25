package com.curso.operadores;

public class Condicionales
{
    public static void main(String[] args)
    {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;

        if(resultado)
        {
            System.out.println("Dentro del rango");
        }
        else
        {
            System.out.println("Fuera del rango");
        }

        var vacaciones = false;
        var diaDescanso = false;

        if( vacaciones || diaDescanso)
        {
            System.out.println("Padre puede asistir al juego");
        }
        else
        {
            System.out.println("El padre está ocupado");
        }

        var resultadoTernario = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultadoTernario = " + resultadoTernario);

        var numero = 8;
        resultadoTernario = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoTernario = " + resultadoTernario);
    }
}
