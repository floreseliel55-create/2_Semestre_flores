package com.flores.Unidad_3.Tarea_9;

/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */

public class Animal {
    private String especie;
    public Animal(String especie){
        this.especie=especie;
    }
    public String getEspecie(){
        return especie;
    }
    public void printMensaje(){
        System.out.println("Soy un animal de la especie "+especie);
    }
    public void printSonido(){
        System.out.println("El animal hace un sonido");
    }
    public String toString(){
        return "Animal "+especie;
    }
    public void override(){
        System.out.println(" El metodo sobreescrito en animal ");
    }
}
