package com.flores.unidad_2.No_Revisados.Tarea_13;

public class Fruta {

    private String nombre;
    private int gramos;

    // Este constructor invoca al otro constructor y le mete esos valores por default
    public Fruta(){
        this("Sin nombre",10);
    }
    // Constructor que recibe parámetros 
    public Fruta(String nombre, int gramos){
        this.nombre=nombre;
        this.gramos=gramos;
    }
    public void setPeso(int gramos){
        this.gramos=gramos;
    }
    public int getPeso(){
        return gramos;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
