package com.flores.Unidad_4.Tarea_3;

public class Bicicleta {
    private String color;
    private int velocidad;
    public Bicicleta(String color, int velocidad){
        this.color=color;
        this.velocidad=velocidad;
    }
    public String getColor(){
        return color;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public String toString(){
        return "Bicicleta de color "+ color+" con velocidad "+ velocidad;
    }
}
