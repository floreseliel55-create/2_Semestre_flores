package com.flores.Unidad_3.Tarea_8;

public class H extends G {
    protected int valorH;
    
    // Constructor de la clase H
    public H() {
        System.out.println(" Clase H: ");
    }
    
    // Obtiene el valor de valorH
    public int getValorH() {
        return valorH;
    }
    
    // Asigna un valor a valorH
    public void setValorH(int valorH) {
        this.valorH = valorH;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor H = "+valorH;
    }
}
