package curso.peliculas.negocio;

import curso.peliculas.datos.AccesoDatosImpl;
import curso.peliculas.datos.IAccesoDatos;
import curso.peliculas.domain.Pelicula;
import curso.peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas
{
    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl()
    {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula)
    {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try
        {
            anexar = this.datos.existe(NOMBRE_RECURSO);
            this.datos.escribir(pelicula,NOMBRE_RECURSO,anexar);
        }
        catch (AccesoDatosEx accesoDatosEx)
        {
            System.out.println("Error de acceso a datos");
            accesoDatosEx.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas()
    {
        try
        {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            int indice = 1;

            for (var pelicula: peliculas)
            {
                System.out.println(indice + " - " + pelicula);
                indice++;
            }
        }
        catch (AccesoDatosEx ex)
        {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombrePelicula)
    {
        String resultado = null;
        try
        {
            resultado = this.datos.buscar(NOMBRE_RECURSO,nombrePelicula);

            if(resultado == null)
            {
                resultado = "Pelicula no encontrada";
            }
            System.out.println("resultado = " + resultado);
        }
        catch (AccesoDatosEx ex)
        {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void iniciarCatalogo()
    {
        try
        {
            if(this.datos.existe(NOMBRE_RECURSO))
            {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            }
            else
            {
                this.datos.crear(NOMBRE_RECURSO);
            }
        }
        catch (AccesoDatosEx accesoDatosEx)
        {
            System.out.println("Error al iniciar catalogo de peliculas");
            accesoDatosEx.printStackTrace();
        }
    }
}
