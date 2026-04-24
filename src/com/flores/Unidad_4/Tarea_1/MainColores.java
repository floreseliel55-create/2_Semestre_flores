package com.flores.Unidad_4.Tarea_1;

import java.security.Permission;

import com.flores.unidad_2.revisados.Tarea_1_y_4.Persona;

public class MainColores {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(3,5);
        ColorPoint cp1 = new ColorPoint();
        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        System.out.println("cp1 = "+cp1);
        cp1.setX(4);
        System.out.println("Cambió X en cp1 = "+cp1);
        p1.setY(9);
        System.out.println("Cambió Y en p1 = "+p1);
        System.out.println("Genera un nuevo punto con medio = "+p2.medio(p1));
        cp1.setColor("Verde");
        System.out.println("cambió color en cp1 = "+cp1);
        System.out.println("Total de puntos creados = "+Point.totalPuntos);
        System.out.println(p2.IgualdadXyY(p2));
        
        Persona p3 = new Persona("Ricardo",20);
        System.out.println(p1.equals(p2));
        
    }
}
