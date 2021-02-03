package curso.test;

import curso.enumeracion.Continentes;
import curso.enumeracion.Dias;

public class TestEnumeraciones
{
    public static void main(String[] args)
    {
        System.out.println(Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente : " + Continentes.AMERICA);
        System.out.println("No. paises en el 4to continente: " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias)
    {
        switch (dias)
        {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
