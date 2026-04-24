package com.flores.Unidad_3.Tarea_8;

public class C extends D {
    protected int valorC;
    
    // Constructor de la clase C
    public C() {
        System.out.println(" Clase C: ");
    }
    
    // Obtiene el valor de valorC
    public int getValorC() {
        return valorC;
    }
    
    // Asigna un valor a valorC
    public void setValorC(int valorC) {
        this.valorC = valorC;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor C = "+valorC;
    }
}
