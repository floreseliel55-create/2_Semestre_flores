package com.flores.unidad_2.No_Revisados.Tarea_15;

import java.util.ArrayList;
import java.util.Random;

public class Tarea15 {
    private final double valor=20.17;

// 13 Metodo que recibe un arreglo de puntos y me diga cuantos estan en (0,0)
public int puntosOrigen(PuntoX15[] arreglPuntoX15){
    int puntoOrigen=0;
    for(int i=0; i<arreglPuntoX15.length; i++){
        if(arreglPuntoX15[i].getX()==0 && arreglPuntoX15[i].getY()==0){
            puntoOrigen++;
        }
    }
    return puntoOrigen;
}
// 14 Metodo que recibe un n entre 0 y 100 y me diga cuantas decenas le caben
public int decenasCampo(int n){
    int decenas=0;
    decenas=n/10;
    return decenas;

}
// 15 Metodo que cambie peso a dolar
public double cambioPeso(double pesos){
    return pesos/valor;

}
// 16 Metodo que cambie dolar a peso
public double cambioDolar(double dolar){
    return dolar*valor;
}
// 17 Metodo que verifique si un numero esta en un rango de 0 a 100
public boolean estaEnRango(int n){
    if(n>=0 && n<=100){
        return true;
    }
    else{
        return false;
    }
}
// 18 Metodo que verifique si una palabra es un palindromo
public boolean esPalindromo(String palabra){
    int mitad=palabra.length()/2;
    char[] mitad1 = new char[mitad];
    char[] mitad2= new char[mitad];
    for(int i=0; i<mitad;i++){
        mitad1[i]=palabra.charAt(i);
    }
    for(int j=0; j<mitad;j++ ){
        mitad2[j]=palabra.charAt(palabra.length()-1 - j);
        }
        for(int k=0; k<mitad;k++){
            if(mitad1[k]!=mitad2[k]){
                return false;
            }
        }
        return true;
}
// 19 Metodo que cuenta palabras en un String
    public int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) return 0;
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

// 20 Metodo que regresa un valor aleatorio entre 1 y 6
    public int valorAleatorio() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }    

    // 21 Metodo que regresa un arreglo con todos los divisores de un número entero
    public int[] obtenerDivisores(int numero) {
        int count = 0;
        for (int i = 1; i <= Math.abs(numero); i++) {
            if (numero % i == 0) count++;
        }
        int[] divisores = new int[count];
        int index = 0;
        for (int i = 1; i <= Math.abs(numero); i++) {
            if (numero % i == 0) divisores[index++] = i;
        }
        return divisores;
    }
    // 22 Metodo que regresa un arreglo con la suma elemento a elemento de dos arreglos
    public int[] sumarArreglos(int[] a, int[] b) {
        int longitud = Math.min(a.length, b.length);
        int[] resultado = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }
    // 24 Metodo que recibe un arreglo de libros y regresa el numero de libros de cada clasificacion
    public int[] contarLibrosPorClasificacion(Libro[] libros) {
        int[] conteo = new int[10]; 
        for (Libro libro : libros) {
            int clasificacion = libro.getClasificacion();
            if (clasificacion >= 0 && clasificacion < 10) {
                conteo[clasificacion]++;
            }
        }
        return conteo;
    }
    // Lo que aprendi fue a usar 

    
}
