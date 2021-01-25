package com.curso.operadores;

public class Unarios {

    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Incremento
        // 1.pre-incremento (símbolo antes de la variable)
        var e = 3;
        var f = ++e; // Primero se incrementa la variable y despues se usa el valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // 2.postincremento (símbolo despues de la variable)
        var g = 5;
        var h = g++;
        System.out.println("g = " + g); // Primero se utiliza el valor y despues se incrementa;
        System.out.println("h = " + h);

        // Decremento
        // 1.pre-decremento (símbolo antes de la variable)
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // 2.postdecremento (símbolo despues de la varialbe)
        var k = 4;
        var l = k--;



    }
}
