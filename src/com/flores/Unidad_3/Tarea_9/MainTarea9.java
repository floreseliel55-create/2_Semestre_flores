package com.flores.Unidad_3.Tarea_9;
/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */
public class MainTarea9 {
    public static void main(String[] args) {
        Cat myCat = new Cat("Egipcia");
        Animal myAnimal =  (Animal) myCat;
        // Debido a que el metodo hide es especifico de Cat no se puede llamar 
        // myAnimal.hide();
        // Este funciona porque este metodo esta en ambas clases, pero ejecuta el de Cat
        myAnimal.override();
        myAnimal.printSonido();
        myAnimal.printMensaje();
    }
}