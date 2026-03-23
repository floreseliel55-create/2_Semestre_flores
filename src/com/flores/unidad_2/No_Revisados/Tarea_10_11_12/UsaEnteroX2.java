package com.flores.unidad_2.No_Revisados.Tarea_10_11_12;

public class UsaEnteroX2 {
    
    public static void main(String[] args) {
    EnteroX2 entero1 = new EnteroX2();
    EnteroX2 entero2 = new EnteroX2();
    
    entero1.setX(10);
    entero2.setX(6);

    // ambos objetos apuntan a la misma variable x, por lo que ambos mostrarán el mismo valor

    System.out.println("Entero 1: "+entero1.getX());
    System.out.println("Entero 2: "+entero2.getX());
}

}
