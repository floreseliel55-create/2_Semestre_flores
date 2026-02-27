package com.flores.tarea_8;

import com.flores.tarea_8.Celda.Estado;

//? enum con valores de VIVO o MUERTO
public class Tablero{
    private Celda[][] tablero;
    private int fila;
    private int columna;

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

    public int obtenerVecinos(Celda tablero){
        int contador=0;
        int f=tablero.getFila();
        int c=tablero.getColumna();

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

        return contador;
    }

    // Metodo para actualizar a la siguiente generacion
    public void actualizarTablero(){
        Celda[][] nuevoTablero = new Celda[fila][columna];
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                nuevoTablero[i][j] = new Celda(i, j);
                int vecinos = obtenerVecinos(tablero[i][j]);

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
 
    public Celda getCelda(int fila, int columna) {
        return this.tablero[fila][columna];
    }

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