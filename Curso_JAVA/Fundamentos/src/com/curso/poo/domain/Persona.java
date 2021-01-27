package com.curso.poo.domain;

public class Persona
{
    protected String nombre;
    protected String apellido;
    protected char genero;
    protected int edad;
    protected String direccion;
    protected boolean eliminado;

    public Persona()
    {}

    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, boolean eliminado)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.eliminado = eliminado;
    }

    public Persona(String nombre, String apellido, char genero, int edad, String direccion, boolean eliminado)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.eliminado = eliminado;
    }

    public void mostrarInfo()
    {
        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
        System.out.println("eliminado = " + this.isEliminado());
    }

    // Métodos
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido){ this.apellido = apellido; }

    public int getEdad(){ return edad; }

    public void setEdad(int edad) { this.edad = edad; }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public char getGenero() { return genero; }

    public void setGenero(char genero) { this.genero = genero; }



    public boolean isEliminado()
    {
        return eliminado;
    }

    public void setEliminado(boolean eliminado)
    {
        this.eliminado = eliminado;
    }

    @Override
    public String toString()
    {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", eliminado=" + eliminado +
                '}';
    }
}
