package com.flores.Unidad_3.Tarea_9;
/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */
public class Cat extends Animal {
    // Tuve que añadir constructor pq daba error debido a que el padre tener un constructor con parametros
    public Cat(String especie) {
        super(especie);
    }
    public static void hide(){
        System.out.println(" El metodo escondido en gato ");
    }
    public void override(){
        System.out.println(" El metodo sobreescrito en gato ");
    }
    public void printSonido(){
        System.out.println("Miau miau");
    }
    public void printMensaje(){
        System.out.println("Soy un gato de la especie "+getEspecie());
    }
}