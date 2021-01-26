package com.curso.operaciones;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 6;
        aritmetica1.b = 8;
        
        //aritmetica1.sumar();
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(10,20);
        System.out.println("resultado = " + resultado);

        // Constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);
    }
}
