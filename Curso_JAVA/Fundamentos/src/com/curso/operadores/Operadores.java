package com.curso.operadores;

public class Operadores {

    public static void main(String[] args) {
	    // write your code here
        int a = 5;
        int b = 3;
        int resultado;

        resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado division = " + resultado);

        resultado = a % b;
        System.out.println("resultado módulo = " + resultado);

        if (a % 2 == 0)
        {
            System.out.println("Es número par");
        }
        else
        {
            System.out.println("Es número impar");
        }
    }
}
