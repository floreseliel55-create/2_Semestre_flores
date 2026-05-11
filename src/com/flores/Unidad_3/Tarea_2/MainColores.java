/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */

// La Clase colorPoint hereda de point por lo tanto hereda sus atributos y metodos.
// Ademas añade un nuevo atributo color y sus metodos getter y setter y el metodo toString.

// La clase Point 3D extiende de Point y añade una nueva Dimension z, con un constructor con los 3 atributos
// En el cual invoca al constructor de la superclase para inicializar x e y, y luego inicializa z con el valor pasado como parametro
// y si se usa el constructor se aumenta el contador de puntos.
// En el metodo toString se invoca al de la superclase para mostrar las coordenadas x e y y luego se añade la coordenada z
// El metodo medio esta siendo sobrecargado porque tiene el mismo nombre pero diferente firma y hace lo mismo pero se añade el medio de z.
// Conclusión: esta clase demuestra herencia y sobrecarga de métodos para trabajar con puntos 2D y 3D de forma ordenada.

package com.flores.Unidad_3.Tarea_2;

import com.flores.Unidad_4.Tarea_4.Point;

public class MainColores {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(3,5);
        Point3D p3D = new Point3D(1);
        ColorPoint cp1 = new ColorPoint();
        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        System.out.println("cp1 = "+cp1);
        System.out.println("p3D = "+p3D);
        p3D.setX(2);
        p3D.setY(5);
        p3D.setZ(3);
        System.out.println("Cambios en X, Y y Z en p3D " + p3D);
        cp1.setX(4);
        System.out.println("Cambió X en cp1 = "+cp1);
        p1.setY(9);
        System.out.println("Cambió Y en p1 = "+p1);
        System.out.println("Genera un nuevo punto con medio = "+p2.medio(p1));
        System.out.println("Genera un nuevo punto con medio = "+ p3D.medio(p3D));
        cp1.setColor("Verde");
        System.out.println("cambió color en cp1 = "+cp1);
        System.out.println("Total de puntos creados = "+Point.totalPuntos);
    }
}
