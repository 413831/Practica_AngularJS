package curso.paquete2;

public class Clase3
{

    private String atributoPrivado = "Valor atributo privado";

    private Clase3()
    {
        System.out.println("Constructor privado");
    }

    public Clase3(String argumento)
    {
        this();
        System.out.println("Constructor publico");
    }

    private void metodoPrivado()
    {
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado()
    {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado)
    {
        this.atributoPrivado = atributoPrivado;
    }

}
