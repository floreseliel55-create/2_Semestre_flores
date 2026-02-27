package com.flores.tarea_8;
import java.util.Scanner;

import com.flores.tarea_8.Celda.Estado;

// Crea la clase Juego, donde se ejecutan la clase tablero y avanza la generación
public class Juego {
    private Scanner sc;

    // Constructor
    public Juego() {
        sc = new Scanner(System.in);
    }

    // Metodo para inicial el juego, se piden los datos para crear el tablero y previene errores
    public void iniciarJuego(Juego juego) {

        int filas, columnas, cantidad;
        
        // Ciclo para que el usuario ingrese un numero valido de filas y columnas
        do {
        System.out.print("Filas: ");
        filas = sc.nextInt();

        System.out.print("Columnas: ");
        columnas = sc.nextInt();
        } while (filas <=0 || columnas <= 0);

        // Se crea el tablero con los datos ingresados por el usuario
        Tablero tablero = new Tablero(filas, columnas);

        System.out.print("¿Cuántas celdas vivas iniciales?: ");
        cantidad = sc.nextInt();

        // Ciclo para prevenir que se ingrese una cantidad de celdas VIVAS mayor a los limites del tablero
        while(cantidad <0 || cantidad > filas*columnas){
            System.out.println("Cantidad no válida. Ingrese un número entre 0 y " + (filas*columnas));
            System.out.print("¿Cuántas celdas vivas iniciales?: ");
            cantidad = sc.nextInt();
        }

        // Ciclo para pedir las coordenadas de las celdas vivas
        for (int i = 0; i < cantidad; i++) {

            System.out.print("Fila: ");
            int f = sc.nextInt();

            System.out.print("Columna: ");
            int c = sc.nextInt();

            tablero.getCelda(f, c).setEstado(Estado.VIVO);
        }

        System.out.println("\nTablero inicial: \n" + tablero);

        juego.ejecutarGeneracion(juego, tablero);
    }
    
    // Metodo para ejecutar la siguiente generacion, el usuario debe presionar enter para avanzar y se actualiza el tablero
    public void ejecutarGeneracion(Juego juego, Tablero tablero) {

        System.out.println("\nPresiona ENTER para siguiente generación...");
        sc.nextLine();
        sc.nextLine();

        tablero.actualizarTablero();

        System.out.println("\nSiguiente generación:  \n" + tablero);
    }

    // Metodo main para inicar el juego contiene tan solo 2 lineas, se crea un objeto de la clase juego y se llama al metodo iniciarJuego donde se ejecuta todo el programa
    // Se pueden crear varios objetos de la clase juego para jugar varias partidas
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego(juego);
    }
}
