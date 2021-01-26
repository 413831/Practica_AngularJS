package com.curso.clases;

public class Caja
{
    // Atributos
    int ancho;
    int alto;
    int profundo;

    // Constructores
    public Caja()
    {}

    public Caja(int ancho, int alto, int profundo)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Métodos
    public int calcularVolumen()
    {
        return this.ancho * this.alto * this.profundo;
    }
}
