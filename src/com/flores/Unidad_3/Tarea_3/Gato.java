package com.flores.Unidad_3.Tarea_3;

public class Gato extends Animal {
    private String nombre;
    public Gato(String nombre){
        super("Gato ");
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void printSonido(){
        System.out.println("Miau miau");
    }
    public String toString(){
        return super.toString()+", me llamo "+ nombre;
    }

}
