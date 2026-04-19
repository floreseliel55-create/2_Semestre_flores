package com.flores.Unidad_3.Tarea_4;

public class MainGrupo {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 'M', 20, "A001", "Ingeniería", 8.5);
        Alumno alumno2 = new Alumno("María", 'F', 22, "A002", "Medicina", 9.0);
        Alumno alumno3 = new Alumno("Carlos", 'M', 19, "A003", "Derecho", 7.8);
        
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }
}
