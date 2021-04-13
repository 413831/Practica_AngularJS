package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoJDBC
{
    public static void main(String[] args)
    {
        PersonaDAO personaDao = new PersonaDAO();



        // INSERT
        Persona persona = new Persona("Heraclito", "Iripideo", "elheridebera@mail.com", "1123545345");
        personaDao.insertar(persona);

        // SELECT
        List<Persona> personas = personaDao.seleccionar();

        // Lambda
        personas.forEach(System.out::println);
        // personas.forEach(persona -> System.out.println(persona));
    }
}
