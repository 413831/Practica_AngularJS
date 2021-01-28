package ventas;

import java.util.Arrays;

public class Orden
{
    private int idOrden;
    private Producto[] productos;
    private static int contadorOrdenes;
    private final static int MAX_PRODUCTOS = 10;

    public Orden()
    {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto)
    {
        for (int i = 0; i < this.productos.length; i++)
        {
            //this.productos[i].equals(null);
            if(this.productos[i] == null)
            {
                this.productos[i] = producto;
                break;
            }
        }
    }

    public void quitarProducto(Producto producto)
    {
        for (int i = 0; i < this.productos.length; i++)
        {
            //this.productos[i].equals(null);
            if(this.productos[i].getIdProducto() == producto.getIdProducto())
            {
                this.productos[i] = null;
                break;
            }
        }
    }

    public void modificarProducto(Producto producto)
    {
        for (int i = 0; i < this.productos.length; i++)
        {
            //this.productos[i].equals(null);
            if(this.productos[i].getIdProducto() == producto.getIdProducto())
            {
                this.productos[i] = producto;
                break;
            }
        }
    }

    public double calcularTotal()
    {
        double total = 0;

        for (int i = 0; i < this.productos.length; i++)
        {
            if(this.productos[i] != null)
            {
                total += this.productos[i].getPrecio();
            }
        }
        return total;
    }

    public void mostrarOrden()
    {
        final StringBuilder sb = new StringBuilder("Orden = ");
        sb.append(idOrden).append('\n');
        //sb.append(", productos=").append(Arrays.toString(productos));

        for (int i = 0; i < this.productos.length; i++)
        {
            if(this.productos[i] != null)
            {
                sb.append(this.productos[i]);
            }
        }

        sb.append("\n\n");
        sb.append("Total = $" + this.calcularTotal());

        System.out.println(sb.toString());
    }
}
