package curso.test;

public class TestMatrices
{
    public static void main(String[] args)
    {
        int edades[][] = new int[3][3];
        StringBuilder grafico = new StringBuilder();
        
        edades[0][0] = 5;

        for (int fila = 0; fila < edades.length ; fila++)
        {
            for (int columna = 0; columna < edades[fila].length; columna++)
            {
                edades[fila][columna] = columna + fila;
                grafico.append("[" + edades[fila][columna] + "]");
                System.out.println(fila + "-" + columna);
                System.out.println("edades[fila][columna] = " + edades[fila][columna]);
            }
            grafico.append("\n");
        }
        System.out.println(grafico.toString());
    }
}
