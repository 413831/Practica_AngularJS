package curso.test;

import curso.domain.Gerente;

public class Main {

    public static void main(String[] args) 
    {
	    Gerente gerente1 = new Gerente("Pepito", 120000, "Sistemas");
        System.out.println("gerente1.obtenerDetalles() = " + gerente1.obtenerDetalles());
    }
}
