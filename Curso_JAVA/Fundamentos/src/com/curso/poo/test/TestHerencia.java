package com.curso.poo.test;

import com.curso.poo.domain.Cliente;
import com.curso.poo.domain.Empleado;

import java.util.Date;

public class TestHerencia
{
    public static void main(String[] args)
    {
        Empleado empleado1 = new Empleado("Juan",56000);
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Pepito", "Paredes",
                                       'M', 29, "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
    }
}
