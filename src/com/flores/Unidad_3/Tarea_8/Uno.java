package com.flores.Unidad_3.Tarea_8;

public class Uno {
    protected int valor1;
    
    // Constructor de la clase Uno
    public Uno() {
        System.out.println(" Clase Uno: ");
    }
    
    // Obtiene el valor de valor1
    public int getValor1() {
        return valor1;
    }
    
    // Asigna un valor a valor1
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor 1 = "+valor1;
    }
}
