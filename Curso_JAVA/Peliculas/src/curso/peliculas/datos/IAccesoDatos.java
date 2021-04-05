package curso.peliculas.datos;

import curso.peliculas.domain.Pelicula;
import curso.peliculas.excepciones.*;

import java.util.List;

public interface IAccesoDatos
{
    /**
     * Verifica que exista el recurso recibido por parámetro
     * @param nombreRecurso Recurso de datos físicos
     * @return Retorna true si existe de lo contrario retorna false
     * @throws AccesoDatosEx
     */
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    /**
     * Lista todos los registros del recurso
     * @param nombre Recurso de datos fisicos
     * @return void
     * @throws LecturaDatosEx
     */
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    /**
     * Escribe una pelicula en el recurso recibido por parámetro
     * @param pelicula Pelicula a escribir
     * @param nombreRecurso Nombre del recurso físico
     * @param anexar Booleano que indica si se anexa o sobreescribe el archivo
     * @throws EscrituraDatosEx
     */
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    /**
     * Busca una pelicula en el recurso recibido
     * @param nombreRecurso Nombre del recurso físico
     * @param nombrePelicula Nombre de la pelicula a buscar
     * @return Nombre y ubicación en el recurso de la película o NULL
     * @throws LecturaDatosEx
     */
    String buscar(String nombreRecurso, String nombrePelicula) throws LecturaDatosEx;

    /**
     * Crea el recurso de acceso a datos
     * @param nombreRecurso Nombre del recurso físico
     * @throws AccesoDatosEx
     */
    void crear(String nombreRecurso) throws AccesoDatosEx;

    /**
     * Borra el recurso de acceso a datos
     * @param nombreRecurso Nombre del recurso físico
     * @throws AccesoDatosEx
     */
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
