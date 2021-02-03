package curso.test;

import curso.paquete2.Clase3;

class Clase2 extends Clase3
{
    String atributoDefault = "Valor atributo default";

    Clase2()
    {
        super("Parametro");
        System.out.println("Constructor default");
    }

    void metodoDefault()
    {
        System.out.println("Metodo default");
    }
}
