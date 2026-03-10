package com.flores.poo.unidad_2;
public class PuntoX9 {
    private int x=0;
    private int y=0;
    public static int totalPuntos=0;
    PuntoX9(int x, int y){
        this.x=x;
        this.y=y;
        totalPuntos++;
    }
    public void setX(int x){
        x=x;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

