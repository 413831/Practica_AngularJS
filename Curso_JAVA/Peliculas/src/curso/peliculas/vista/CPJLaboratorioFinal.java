package curso.peliculas.vista;

import curso.peliculas.domain.Pelicula;
import curso.peliculas.negocio.CatalogoPeliculasImpl;
import curso.peliculas.negocio.ICatalogoPeliculas;

import java.util.Scanner;

public class CPJLaboratorioFinal
{
    public static void main(String[] args) {
	    int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while(opcion != 0)
        {
            System.out.println("Elige una opcion: \n"
            + "1. Iniciar catalogo de peliculas.\n"
            + "2. Agregar pelicula\n"
            + "3. Listar peliculas\n"
            + "4. Buscar pelicula\n"
            + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion)
            {
                case 1 :
                    catalogo.iniciarCatalogo();
                    break;
                case 2 :
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3 :
                    catalogo.listarPeliculas();
                    break;
                case 4 :
                    System.out.println("Introduce una pelicula a buscar");
                    var peliculaBuscada = scanner.nextLine();
                    catalogo.buscarPelicula(peliculaBuscada);
                    break;
                case 0 :
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
