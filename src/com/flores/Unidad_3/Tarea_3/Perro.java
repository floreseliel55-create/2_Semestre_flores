package com.flores.Unidad_3.Tarea_3;

public class Perro extends Animal {
    private String nombre;
    public Perro(String nombre){
        super("Perro");
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void printSonido(){
        System.out.println("Guau guau");
    }
    public String toString(){
        return super.toString()+", me llamo "+ nombre;
    }
    
}
