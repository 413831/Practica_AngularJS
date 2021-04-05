package curso.peliculas.datos;

import curso.peliculas.domain.Pelicula;
import curso.peliculas.excepciones.AccesoDatosEx;
import curso.peliculas.excepciones.EscrituraDatosEx;
import curso.peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements IAccesoDatos
{
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx
    {
        File archivo = new File(nombreRecurso);

        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx
    {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();

            while (linea != null)
            {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar pelicula: " + e.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al leer linea: " + e.getMessage());
        }

        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx
    {
        File archivo = new File(nombreRecurso);
        try
        {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));

            // Se llama al método ToString
            salida.println(pelicula);
            salida.close();
            System.out.println("Se ha escrito información al archivo: " + nombreRecurso);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String nombrePelicula) throws LecturaDatosEx
    {
        File archivo = new File(nombreRecurso);
        String resultado = null;

        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int indice = 1;
            linea = entrada.readLine();

            while(linea != null)
            {
                if(nombrePelicula != null && nombrePelicula.equalsIgnoreCase(linea))
                {
                    resultado = "Pelicula " + linea + " encontrada en el índice " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula: " + e.getMessage());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al leer linea: " + e.getMessage());
        }


        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx
    {
        File archivo = new File(nombreRecurso);
        try
        {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo correctamente");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo " + e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx
    {
        File archivo = new File(nombreRecurso);

        if(archivo.exists())
        {
            archivo.delete();
            System.out.println("Se ha borrado el archivo correctamente");
        }
    }
}
