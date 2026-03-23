package com.flores.unidad_2.No_Revisados.Tarea_15;


public class PuntoX15 {

    private int x=0;
    private int y=0;
    private int totalPuntos=0;
    PuntoX15(int x, int y){
        this.x=x;
        this.y=y;
        totalPuntos++;
    }
    public void setX(int x){
        this.x=x;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public String moverPunto(int x, int y){
        this.x=x;
        this.y=y;
        return ""+x+","+y;
    }
    
}
