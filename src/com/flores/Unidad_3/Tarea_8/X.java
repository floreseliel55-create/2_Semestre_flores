package com.flores.Unidad_3.Tarea_8;

public class X extends D {
    protected int valorX;
    
    // Constructor de la clase X
    public X() {
        System.out.println(" Clase X: ");
    }
    
    // Obtiene el valor de valorX
    public int getValorX() {
        return valorX;
    }
    
    // Asigna un valor a valorX
    public void setValorX(int valorX) {
        this.valorX = valorX;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor X = "+valorX;
    }
}
