package com.flores.Unidad_3.Tarea_3;

public class Gallina extends Animal {
    private String nombre;
    public Gallina(String nombre){
        super("Gallina");
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void printSonido(){
        System.out.println("Kikirikiii");
    }
    public String toString(){
        return super.toString()+", me llamo "+ nombre;
    }
    
}
