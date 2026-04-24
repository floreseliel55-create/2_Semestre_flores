package com.flores.Unidad_3.Tarea_8;

public class A extends Uno {
    protected int valorA;
    
    // Constructor de la clase A
    public A() {
        System.out.println(" Clase A: ");
    }
    
    // Obtiene el valor de valorA
    public int getValorA() {
        return valorA;
    }
    
    // Asigna un valor a valorA
    public void setValorA(int valorA) {
        this.valorA = valorA;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor A = "+valorA;
    }
}
