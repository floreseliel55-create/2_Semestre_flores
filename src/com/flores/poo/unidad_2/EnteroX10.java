package com.flores.poo.unidad_2;

public class EnteroX10 {
    int x;
    public int getX(){
        return x;
    }
    public void setX(int newX){
    x= newX;
}
public static void main(String[] args) {
    EnteroX10 entero1 = new EnteroX10();
    EnteroX10 entero2 = new EnteroX10();
    
    entero1.setX(10);
    entero2.setX(6);
    System.out.println("Entero 1: "+entero1.getX());
    System.out.println("Entero 2: "+entero2.getX());
}
}
