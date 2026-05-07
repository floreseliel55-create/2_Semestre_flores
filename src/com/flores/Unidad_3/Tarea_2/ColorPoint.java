/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */
// Conclusión: ColorPoint hereda de Point y añade color para mostrar cómo especializar una clase base.
package com.flores.Unidad_3.Tarea_2;

import com.flores.Unidad_4.Tarea_4.Point;

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
