package curso.paquete2;

import curso.paquete1.Clase1;

public class ClaseHija extends Clase1
{
    public ClaseHija()
    {
        super();
        super.atributoProtected = "Modificacion atributo protected";
        super.metodoProtected();
    }
}
