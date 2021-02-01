package curso.mundopc;

public class Mouse extends DispositivoEntrada
{
    private final int idMouse;
    private static int contadorRaton;

    public Mouse(String tipoEntrada, String marca)
    {
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorRaton;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
