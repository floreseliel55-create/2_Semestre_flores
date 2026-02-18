package com.flores.tarea_8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Celda {
    private Estado estado;
    private char caracter;

    Celda(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    // Función para poner los organismos en donde el usuario quiera
    public static void colocarOrganismos(Estado[][] tablero, Scanner sc) {
        System.out.println("¿Cuántos organismos vivos quieres?");
        int n = sc.nextInt();
        int contador = 0;
        
        // Contador hasta que se pongan todos los organismos vivos
        while (contador < n) {
            // Pide fila y columnas
            System.out.println("Ingresa la fila del organismo vivo " + (contador+1));
            int fila = sc.nextInt();
            
            System.out.println("Ingresa la columna del organismo vivo " + (contador+1));
            int columna = sc.nextInt();

            //? Verifica si la celda es válida
            if (tablero[fila][columna] == Estado.VIVO) {
                System.out.println("Ingrese una celda válida");
                continue;
            }
    
            //* Agrega el estado del enum a la parte del tablero
            tablero[fila][columna] = Estado.VIVO;
            contador++;

            System.out.println("");
        }
    }

    public static void llenarTablero(Estado[][] tablero, int nf) {
        // Llena el tablero con los estados muertos
        for (int i = 0; i < nf; i++) {
            Arrays.fill(tablero[i], Estado.MUERTO);
        }
    }

    public static void mostrarTablero(Estado[][] tab) {

        for (Estado[] fila : tab) {
            for (Estado e : fila) {
                System.out.print("[");

                if (e == Estado.VIVO) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                System.out.print("]");
                }
            
            System.out.println();
        }
    }

    public static void avanzarGeneracion(Estado[][] tablero, Estado[][] sigGeneracion, int nf, int nc) {
        //? Los primeros 2 for recorren para conseguir una celda determinada   
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int contadorVivos = 0;
                //* Estos dos for encuentran los vecinos
                for (int k = i-1; k <= i+1; k++) {
                    for (int h = j - 1; h <= j + 1; h++) {
                        
                        //! Si es la misma posición que la de la celda, no se cuenta
                        if (k == i && h == j) {
                            continue;
                        }
                        // Si no, se hacen las evaluaciones
                        try {
                            if (tablero[k][h] == Estado.VIVO)
                                contadorVivos++;
                        } catch(Exception e) {
                            continue;
                        }
                    }
                }
                //? 2 vecinos y la celda está viva, entonces sigue vivo
                if (contadorVivos == 2 && tablero[i][j] == Estado.VIVO) {
                    sigGeneracion[i][j] = Estado.VIVO;
                } else if (contadorVivos == 3) {
                    //? 3 Vecinos, no importa si está viva o no, se pone viva
                    sigGeneracion[i][j] = Estado.VIVO;
                } else if (contadorVivos < 2 || contadorVivos > 3) {
                    //? Si hay menos de 2 vecinos vivos o más de 3 entonces se muere esa celda
                    sigGeneracion[i][j] = Estado.MUERTO;
                } else {
                    sigGeneracion[i][j] = Estado.MUERTO;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        int nf, nc; 
        
        // Pidiendo al usuario las variables
        while (true) {
            System.out.println("Ingrese el valor de la fila (2-20)");
            nf = sc.nextInt();
        
            System.out.println("Ingrese el valor de la columna (2-20)");
            nc = sc.nextInt();
            
            if(nf<2 || nf > 20 || nc <2 || nc >20 ){
                System.out.println("Ingrese numero dentro del rango permitido (2-20)");
                continue;
            } else {
                break;
            }
        }

        // Declaración del arreglo del tablero y la sig generación
        Estado[][] tablero = new Estado[nf][nc]; 
        Estado[][] sigGeneracion = new Estado[nf][nc];
        
        // Llenando el tablero
        llenarTablero(tablero, nf);
        llenarTablero(sigGeneracion, nf);

        // Pide al usuario la cantidad de organismos y los añade
        colocarOrganismos(tablero, sc);

        // Muestra el tablero
        mostrarTablero(tablero);

        System.out.println("¿Cambiar generación? s/n");
        String ans = sc.next();

        if (ans.equals("n")) {
            System.out.println("Ejecución finalizada");
            
        } else {
        
            System.out.println("Generación siguiente:");
            
            // Avanza la generación y lo atribuye al tablero: sigGeneracion 
            avanzarGeneracion(tablero, sigGeneracion, nf, nc);

            // Muestra el tablero con la siguiente generación
            mostrarTablero(sigGeneracion);
        }

       sc.close();
    }
    
}