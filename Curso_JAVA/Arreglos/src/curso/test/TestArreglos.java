package curso.test;

public class TestArreglos
{
    public static void main(String[] args)
    {
        //int edades[] = {1,2,3,4,5};
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);
        
        for (int i = 0; i < edades.length; i++)
        {
            System.out.println("edades[i] = " + edades[i]);
        }
    }
    
    
    
}
