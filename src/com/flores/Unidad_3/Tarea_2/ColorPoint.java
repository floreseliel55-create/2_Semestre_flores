package com.flores.Unidad_3.Tarea_2;

// Clase derivada de Point
public class ColorPoint extends Point {
    // agrega un nuevo atributo color, con su getter y setter
    // no hay necesidad de un constructor
    private String color="Rojo";

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    // toString que sobre escribe el de Point para añadirle el color
    public String toString(){
        return super.toString()+" color: "+color;
    }
}
