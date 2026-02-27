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

    public void iniciarJuego(Juego juego) {

        System.out.print("Filas: ");
        int filas = sc.nextInt();

        System.out.print("Columnas: ");
        int columnas = sc.nextInt();

        Tablero tablero = new Tablero(filas, columnas);

        System.out.print("¿Cuántas celdas vivas iniciales?: ");
        int cantidad = sc.nextInt();

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

    public void ejecutarGeneracion(Juego juego, Tablero tablero) {

        System.out.println("\nPresiona ENTER para siguiente generación...");
        sc.nextLine();
        sc.nextLine();

        tablero.actualizarTablero();

        System.out.println("\nSiguiente generación:  \n" + tablero);
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego(juego);
    }
}
