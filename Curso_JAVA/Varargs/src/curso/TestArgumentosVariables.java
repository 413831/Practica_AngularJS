package curso;

public class TestArgumentosVariables
{
    public static void main(String[] args)
    {
        imprimirNumeros(5,6,7,8,9,2);
        variosParametros("Pepito", 9,5,2);
    }

    private static void variosParametros(String nombre, int... numeros)
    {
        System.out.println("Nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros)
    {
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
