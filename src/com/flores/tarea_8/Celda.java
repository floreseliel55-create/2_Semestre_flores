package com.flores.tarea_8;

// Clase celda con 3 atributos (enum)
public class Celda {
    private int filas;
    private int columnas;
    private Estado estado;

    // enum con los atributos VIVO o MUERTO para los valores de la celda
    public enum Estado {
        VIVO,
        MUERTO
    }
    // Constructor
    Celda(int filas, int columnas){
        this.filas=filas;
        this.columnas=columnas;
        this.estado=Estado.MUERTO; // Estado por defecto
    }
    // Getters
    public boolean celdaViva(){
        return estado==Estado.VIVO;
    }
    public int getColumna(){
        return columnas;
    }
    public int getFila(){
        return filas;
    }
    // Setter
    public void setEstado(Estado estado){
        // Recibe el estado y lo guarda
        this.estado=estado;
    }





}
