package com.curso.sentencias;

public class IfElse
{
    public static void main(String[] args)
    {
        var condicion = true;

        if(condicion)
        {
            System.out.println("Condicion verdadera");
        }
        else
        {
            System.out.println("Condicion falsa");
        }

        var letra = "a";

        if(letra == "a")
        {
            System.out.println("Es la letra A");
        }
        else if(letra == "b")
        {
            System.out.println("Es la letra B");
        }
        else if(letra == "c")
        {
            System.out.println("Es la letra C");
        }
        else
        {
            System.out.println("Es otra letra");
        }

        ///////////////////////////////////////

        var mes = 1;
        var estacion = "Estacion desconocida";

        if(mes == 1 || mes == 2 || mes == 12)
        {
            estacion = "Verano";
        }
        else if(mes == 3 || mes == 4 || mes == 5)
        {
            estacion = "Otoño";
        }
        else if(mes == 6 || mes == 7 || mes == 8)
        {
            estacion = "Invierno";
        }
        else if(mes == 9 || mes == 10 || mes == 11)
        {
            estacion = "Primavera";
        }
        System.out.println("estacion = " + estacion);




    }
}
