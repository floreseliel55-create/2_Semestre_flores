package com.flores.unidad_2.No_Revisados.Tarea_15;

public class UsaTarea15 {
    public static void main(String[] args) {
    Tarea15 obj = new Tarea15();
    PuntoX15 punt1 = new PuntoX15(0, 0);
    PuntoX15 punt2 = new PuntoX15(0, 0);
    PuntoX15 punt3 = new PuntoX15(6, 7);
    PuntoX15 punt4 = new PuntoX15(1, 2);
    PuntoX15[] arregloPuntos = new PuntoX15[4];
    arregloPuntos[0]=punt1;
    arregloPuntos[1]=punt2;
    arregloPuntos[2]=punt3;
    arregloPuntos[3]=punt4;
    System.out.println("Imprime cuantos puntos estan en 0 en X y Y:");
    System.out.println(obj.puntosOrigen(arregloPuntos));
    System.out.println("Imprime cuantas decenas caben en un numero de 0 a 100:");
    System.out.println(obj.decenasCampo(58));
    System.out.println("Convierte pesos a Dolares:");
    System.out.println(obj.cambioPeso(5000));
    System.out.println("Convierte dolares a pesos: ");
    System.out.println(obj.cambioDolar(100));
    System.out.println("Verifica si un valor esta entre 0 y 100:");
    System.out.println(obj.estaEnRango(200));
    System.out.println("Metodo que verifica si es un palindromo:");
    System.out.println(obj.esPalindromo("oso"));
    System.out.println("Metodo que cuenta palabras en un String:");
    System.out.println(obj.contarPalabras("Hola mundo, este es un texto de prueba."));
    System.out.println("Metodo que regresa un valor aleatorio entre 1 y 6:");
    System.out.println(obj.valorAleatorio());
    System.out.println("Metodo que regresa un arreglo con los divisores de un numero entero:");
    int[] divisores = obj.obtenerDivisores(6);
    System.out.print("Divisores de 6: ");
    for (int divisor : divisores) {
        System.out.print(divisor + " ");
    }
    System.out.println("Metodo que regresa el numero de libros por clasificacion:");
    Libro libro1 = new Libro("Libro A", "Autor A", "Editorial A", 2020, 2);
    Libro libro2 = new Libro("Libro B", "Autor B", "Editorial B", 2019, 5);
    Libro libro3 = new Libro("Libro C", "Autor C", "Editorial C", 2021, 2);
    Libro[] libros = {libro1, libro2, libro3};
    int[] conteo = obj.contarLibrosPorClasificacion(libros);
    System.out.print("Número de libros por clasificación: ");
    for (int i = 0; i < conteo.length; i++) {
        System.out.print("Clasificación " + i + ": " + conteo[i] + " ");
    }

}
}
