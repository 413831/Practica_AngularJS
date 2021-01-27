package curso.test;

import curso.operaciones.Operaciones;

public class Main {

    public static void main(String[] args) {
        var resultado = Operaciones.sumar(1, 5);
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);
    }
}
