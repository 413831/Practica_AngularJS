package curso.peliculas.negocio;

public interface ICatalogoPeliculas
{
    String NOMBRE_RECURSO = "peliculas.txt";

    /**
     * Metodo para agregar una pelicula al catalogo
     * @param nombrePelicula Nombre de la pelicula
     */
    void agregarPelicula(String nombrePelicula);

    /**
     * Método para listar las peliculas del catalogo
     */
    void listarPeliculas();

    /**
     * Método para buscar una pelicula en el catálogo
     * @param nombrePelicula
     */
    void buscarPelicula(String nombrePelicula);

    /**
     * Método para inicializar el catálogo
     */
    void iniciarCatalogo();
}
