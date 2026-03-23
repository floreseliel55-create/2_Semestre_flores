package com.flores.unidad_2.No_Revisados.Tarea_13;

public class UsaFruta {

    public static void main(String[] args) {
        Fruta fruta1 = new Fruta();
        Fruta fruta2 = new Fruta("Manzana", 100);
        
        System.out.println("Fruta 1: " + fruta1.getNombre() + ", Peso: " + fruta1.getPeso() + " gramos");
        System.out.println("Fruta 2: " + fruta2.getNombre() + ", Peso: " + fruta2.getPeso() + " gramos");
        
        // Cambiando el peso de la fruta 1
        fruta1.setPeso(200);
        System.out.println("Fruta 1 después de cambiar el peso: " + fruta1.getNombre() + ", Peso: " + fruta1.getPeso() + " gramos");
    }
    
}
