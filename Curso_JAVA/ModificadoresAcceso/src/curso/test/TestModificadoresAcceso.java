package curso.test;

import curso.paquete1.Clase1;
import curso.paquete2.ClaseHija;

public class TestModificadoresAcceso
{
    public static void main(String[] args)
    {
        // Clase1 clase1 = new Clase1();
        // System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);

        ClaseHija claseHija = new ClaseHija();
        System.out.println("Clase Hija = " + claseHija);

        Clase2 claseDefault = new Clase2();
        claseDefault.metodoDefault();
        claseDefault.setAtributoPrivado("Modificacion atributo privado");
        System.out.println("claseDefault.getAtributoPrivado() = " + claseDefault.getAtributoPrivado());

    }
}
