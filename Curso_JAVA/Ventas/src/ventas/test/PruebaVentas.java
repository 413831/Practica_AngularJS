package ventas.test;

import ventas.Orden;
import ventas.Producto;

public class PruebaVentas
{
    public static void main(String[] args)
    {
        Producto producto1 = new Producto("Hamburguesa completa", 500);
        Producto producto2 = new Producto("Ensalada Caesar", 300);
        Producto producto3 = new Producto("Pollo con papas al horno", 600);
        Producto producto4 = new Producto("Milanesas con ensalada", 600);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);

        orden1.mostrarOrden();


    }
}
