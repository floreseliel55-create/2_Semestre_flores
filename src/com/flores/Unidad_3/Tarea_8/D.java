package com.flores.Unidad_3.Tarea_8;

public class D extends G {
    protected int valorD;
    
    // Constructor de la clase D
    public D() {
        System.out.println(" Clase D: ");
    }
    
    // Obtiene el valor de valorD
    public int getValorD() {
        return valorD;
    }
    
    // Asigna un valor a valorD
    public void setValorD(int valorD) {
        this.valorD = valorD;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor D = "+valorD;
    }
    
}
