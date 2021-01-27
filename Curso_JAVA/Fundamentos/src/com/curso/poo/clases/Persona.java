package com.curso.poo.clases;

public class Persona
{


    public String nombre;
    public String apellido;
    private double sueldo;
    private boolean eliminado;

    public Persona()
    {}

    public Persona(String nombre, String apellido, double sueldo, boolean eliminado)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public void mostrarInfo()
    {
        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
        System.out.println("sueldo = " + this.getSueldo());
        System.out.println("eliminado = " + this.isEliminado());
    }

    // Métodos

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

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
        return "Persona {" +
                "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                ", sueldo=" + this.sueldo +
                ", eliminado=" + this.eliminado +
                " }";
    }
}
