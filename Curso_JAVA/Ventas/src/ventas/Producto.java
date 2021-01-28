package ventas;

public class Producto
{


    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto()
    {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio)
    {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(int id, String nombre, double precio)
    {
        this.idProducto = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters & Setters
    public int getIdProducto()
    {
        return idProducto;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append("id = ").append(idProducto);
        sb.append(", nombre = '").append(nombre).append('\'');
        sb.append(", precio = $").append(precio);
        return sb.toString();
    }
}
