package curso.test;

import curso.mundopc.*;

public class MundoPC
{
    public static void main(String[] args)
    {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Mouse mouseHP = new Mouse("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHP);

        Monitor monitorLG = new Monitor("LG",25);
        Teclado tecladoGamer = new Teclado("USB", "Genius");
        Mouse mouseGenius = new Mouse("Bluetooth", "Genius");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorLG, tecladoGamer,
                                                        mouseGenius);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        orden1.mostrarOrden();
    }
}
