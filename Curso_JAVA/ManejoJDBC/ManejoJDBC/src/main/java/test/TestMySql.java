package test;

import java.sql.*;
import java.lang.*;

public class TestMySql
{
    public static void main(String[] args)
    {
        /*
        Se agregan parámetros para cadena de conexión
        useSSL : Determina si se utiliza la conexión segura
        useTimezone : Determina si se va a utilizar una zona horaria especifica
        serverTimezona : Indica cual zona horaria se utilizará para la conexión
         */
        String url = "jdbc:mysql://localhost:3306/test?" +
                        "useSSL=false&" +
                        "useTimezone=true&" +
                        "serverTimezone=UTC&" +
                        "allowPublicKeyRetrieval=true";
        try
        {
            // Esta configuración es opcional y suele ser requerida en versiones anteriores de mysql
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "administrador");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM Personas";
            ResultSet resultado = sentencia.executeQuery(sql);

            while(resultado.next())
            {
                System.out.print("Id persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            sentencia.close();
            conexion.close();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        /*catch (ClassNotFoundException e)
        {
            e.printStackTrace(System.out);
        }*/

    }
}
