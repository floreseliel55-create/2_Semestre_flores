package com.flores.Unidad_4.Tarea_5;

import com.flores.unidad_5.Persona;

// Explicacion de la implementacion de interface cloneable y el metodo clone en las clases Persona y Cliente
// se genera una referencia vacia, uso el clone de object lo que genera un nuevo objeto en memoria y copia todos los atributos
// regresa un object por lo tanto se castea a una Persona la excepcion se debe poner si no se implementa el cloneable
// y al final se devuelve la copia del objeto
public class MainClone {
    public static void main(String[] args) {
        Persona p1 = new Persona("Sergio", 'M', 20);
        Object p2 = p1.clone();
        Persona p3= (Persona) p2;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.setNombre("Manuel");
        p3.setNombre("Carlos");
        System.out.println(p1);
        System.out.println(p3);
    }
}
