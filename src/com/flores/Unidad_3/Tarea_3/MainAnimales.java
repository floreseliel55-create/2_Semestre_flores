/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */

// LA clase animal es la clase mas general que contiene lo que cualquier animal tiene
// la clase perro gato abeja y gallina heredan de la clase animal por lo tanto tienen sus atributos y metodos y añaden sus propios atributos y metodos para diferenciarse entre si
// Ademas que sobreescriben el metodo toString para mostrar su especie y su nombre en el caso de perro gato abeja y gallina y el metodo printSonido para mostrar su sonido caracteristico
// Conclusión: esta clase muestra cómo la herencia agrupa comportamientos comunes y permite especializar animales con sus propios sonidos y descripciones.
package com.flores.Unidad_3.Tarea_3;

public class MainAnimales {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais");
        Gato gato1= new Gato ("Bigotes");
        Abeja abeja1 = new Abeja("Barry");
        Gallina gallina1 = new Gallina("Clara");

        System.out.println(gato1);
        gato1.printMensaje();
        gato1.printSonido();

        System.out.println(perro1);
        perro1.printMensaje();
        perro1.printSonido();

        System.out.println(abeja1);
        abeja1.printMensaje();
        abeja1.printSonido();

        System.out.println(gallina1);
        gallina1.printMensaje();
        gallina1.printSonido();
    }
}
