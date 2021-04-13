package datos;

import domain.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Se utiliza el patrón Data Access Object para las operaciones con la clase Persona
 */
public class PersonaDAO
{
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM Personas";
    private static final String SQL_INSERT = "INSERT INTO Personas(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Personas SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM Personas WHERE id_persona = ?";

    public List<Persona> seleccionar()
    {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        List<Persona> personas = new ArrayList<>();

        try
        {
            conexion = Conexion.getConnection();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();

            while(resultado.next())
            {
                personas.add(new Persona(resultado.getInt("id_persona"),
                                         resultado.getNString("nombre"),
                                         resultado.getString("apellido"),
                                         resultado.getString("email"),
                                         resultado.getString("telefono")));
            }
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        finally
        {
            try
            {
                Conexion.close(resultado);
                Conexion.close(sentencia);
                Conexion.close(conexion);
            }
            catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
        return personas;
    }

    public int insertar(Persona persona)
    {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try
        {
            conexion = Conexion.getConnection();
            sentencia = conexion.prepareStatement(SQL_INSERT);
            sentencia.setString(1, persona.getNombre());
            sentencia.setString(2, persona.getApellido());
            sentencia.setString(3, persona.getEmail());
            sentencia.setString(4, persona.getTelefono());
            registros = sentencia.executeUpdate();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        finally
        {
            try
            {
                Conexion.close(sentencia);
                Conexion.close(conexion);
            }
            catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }

        }
        return registros;
    }

    public int actualizar(Persona persona)
    {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try
        {
            conexion = Conexion.getConnection();
            sentencia = conexion.prepareStatement(SQL_UPDATE);
            sentencia.setString(1, persona.getNombre());
            sentencia.setString(2, persona.getApellido());
            sentencia.setString(3, persona.getEmail());
            sentencia.setString(4, persona.getTelefono());
            sentencia.setInt(5, persona.getIdPersona());
            registros = sentencia.executeUpdate();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        finally
        {
            try
            {
                Conexion.close(sentencia);
                Conexion.close(conexion);
            }
            catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
        return registros;
    }

    public void eliminar(int idPersona)
    {
        Connection conexion = null;
        PreparedStatement sentencia = null;

        try
        {
            conexion = Conexion.getConnection();
            sentencia = conexion.prepareStatement(SQL_DELETE);
            sentencia.setInt(1,idPersona);
            sentencia.executeUpdate();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        finally
        {
            try
            {
                Conexion.close(sentencia);
                Conexion.close(conexion);
            }
            catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
    }
}
