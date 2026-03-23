package com.flores.unidad_2.No_Revisados.Tarea_14;

public class UsaEjercicios {

        // Main para probar los metodos

    public static void main(String[] args) {
        Ejercicios obj = new Ejercicios("Xixarito");
        Alumno[] arregloAlumnos = new Alumno[3]; 
        Alumno estudiante1 = new Alumno("Sergio","Flores", 'M', 10);
        Alumno estudiante2 = new Alumno("Juana", "Totilla", 'F',9);
        Alumno estudiante3 = new Alumno("Kimberly", "Loaiza", 'F',5);

        arregloAlumnos[0]=estudiante1;
        arregloAlumnos[1]=estudiante2;
        arregloAlumnos[2]=estudiante3;


        System.out.println("Metodo que me dice cuantas x tiene una palabra: ");
        System.out.println(obj.obtenerNumeroDeX('x'));
        System.out.println("Metodo que me dice la cantidad de numeros que hay en un String: ");
        System.out.println(obj.obtenerNumeroDeX("vegueta777"));
        System.out.println("Metodo que me dice si un numero es par o impar: ");
        System.out.println(obj.parOImpar(2));
        System.out.println("Metodo que me dice si es o no es primo:");
        System.out.println(obj.primoOno(11));
        System.out.println("Metodo que me da el numero escrito del 0 al 100");
        System.out.println(obj.numeroEscrito(52));
        System.out.println("Metodo que me dice cuantas mujeres hay en un arreglo de alumnos:");
        System.out.println(obj.mujeresCantidad(arregloAlumnos));
        System.out.println("Metodo que me dice el promedio de calificaciones: ");
        System.out.println(obj.promedioAlumno(arregloAlumnos));
        System.out.println("Metodo que devuelve cuantos alumnos reprobaron: ");
        System.out.println(obj.alumnosReprobados(arregloAlumnos));
    }
    
}
