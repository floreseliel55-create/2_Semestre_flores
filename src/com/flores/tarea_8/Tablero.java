package com.flores.tarea_8;

import com.flores.tarea_8.Celda.Estado;

// Clase tablero con 3 atributos (matriz de celdas, filas y columnas)
public class Tablero{
    private Celda[][] tablero;
    private int fila;
    private int columna;

    // Constructor que recibe filas y columnas, crea la matriz de celdas y las inicializa con el estado muerto
    Tablero(int fila, int columna){
        this.fila=fila;
        this.columna=columna;

        tablero = new Celda[fila][columna];
        for(int i=0; i < fila; i++){
            for(int j=0; j<columna; j++){
                tablero[i][j]= new Celda(i, j);              
            }
        }
    }
    // Metodo para contar los vecinos VIVOS de una celda (3x3) sin contar la celda misma y sin salir del tablero
    public int obtenerVecinos(Celda tablero){
        int contador=0;
        //utilizamos los metodos get para obtener la fila y columna de la celda que se pasa como parametro y lo guardamos en variables
        int f=tablero.getFila();
        int c=tablero.getColumna();
        
        // Ciclo para recorrer las 8 celdas vecinas (3x3) sin contar la celda misma y sin salir del tablero
        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                if(i==0 && j==0) continue;

                int nuevaFila = f + i;
                int nuevaColumna = c + j;

                try {
                    if (nuevaFila >=0 && nuevaFila < fila && nuevaColumna >=0 && nuevaColumna < columna){
                       if(this.tablero[nuevaFila][nuevaColumna].celdaViva()){
                        contador++;
                       }
                    }
                } catch(Exception e) {
                    continue;
                }
            }
        }

        // se devuelve el contador de vecinos VIVOS
        return contador;
    }

    // Metodo para actualizar a la siguiente generacion
    public void actualizarTablero(){
        Celda[][] nuevoTablero = new Celda[fila][columna];
        // Ciclo para recorrer el tablero y aplicar las reglas del juego de la vida
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                nuevoTablero[i][j] = new Celda(i, j);
                // Guarda numero de vecinos VIVOS de la celda actual para aplicar las reglas del juego de la vida
                int vecinos = obtenerVecinos(tablero[i][j]);

                // Reglas del juego de la vida
                if (tablero[i][j].celdaViva()){
                    if(vecinos == 2 || vecinos ==3)
                        nuevoTablero[i][j].setEstado(Estado.VIVO);
                    else
                        nuevoTablero[i][j].setEstado(Estado.MUERTO); 

                } else if(vecinos == 3){
                    nuevoTablero[i][j].setEstado(Estado.VIVO);
                }
            }
        } 
    tablero = nuevoTablero;
}
    // Metodo para obtener una celda del tablero, recibe la fila y columna de la celda y devuelve la celda correspondiente
    public Celda getCelda(int fila, int columna) {
        return this.tablero[fila][columna];
    }

    // Metodo toString para mostrar el tablero y identificar celdas vivas y celdas muertas
    public String toString() {
        String mostTablero = "";
        for (Celda[] fila : tablero) {
            for (Celda celda : fila) {
                mostTablero += "[";

                if (celda.celdaViva()) {
                    mostTablero += "*";
                } else {
                    mostTablero += " ";
                }

                mostTablero += "]";
                }
            mostTablero += "\n";
        }

        return mostTablero;
    }
}