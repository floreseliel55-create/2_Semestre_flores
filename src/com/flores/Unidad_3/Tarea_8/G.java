package com.flores.Unidad_3.Tarea_8;

public class G extends Uno {
    protected int G;
    
    // Constructor de la clase G
    public G(){
        System.out.println(" Clase G: ");
    }
    
    // Obtiene el valor de G
    public int getG() {
        return G;
    }
    
    // Asigna un valor a G
    public void setG(int g) {
        G = g;
    }
    
    // Retorna la representación en texto del objeto
    @Override
    public String toString(){
        return "Valor G = "+G;
    }
}
