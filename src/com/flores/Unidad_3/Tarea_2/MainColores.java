package com.flores.Unidad_3.Tarea_2;

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
