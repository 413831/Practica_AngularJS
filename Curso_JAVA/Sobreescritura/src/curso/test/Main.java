package curso.test;

import curso.domain.*;

public class Main {

    public static void main(String[] args) 
    {
	    Gerente gerente1 = new Gerente("Pepito", 120000, "Sistemas");
        System.out.println("gerente1.obtenerDetalles() = " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Juan", 80000);
        //System.out.println(empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Carlita", 100000, "Contabilidad");
        //System.out.println(gerente.obtenerDetalles());
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado)
    {
        System.out.println(empleado.obtenerDetalles());
    }
}
