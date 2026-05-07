package com.flores.Unidad_4.Tarea_1;

import java.lang.annotation.Documented;

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
    // Intento Redefinir el metodo añadiendo un texto que diga si hay o no hay igualdad.
    // El error ((Cannot override the final method from Point)) dice que no se puede sobreescribir o redefinir
    // El metodo final de Point.
    @Override 
    public boolean IgualdadXyY(Point p){
        if(p.x!=p.y){
            System.out.println(" No hay Igualdad: ");
            return false;
        }
        System.out.println(" Si hay Igualdad:");
        return true;
    }
}
