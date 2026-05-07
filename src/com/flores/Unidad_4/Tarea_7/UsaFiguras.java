package com.flores.Unidad_4.Tarea_7;

public class UsaFiguras {
    public static void main(String[] args){
        Circulo c = new Circulo("Rojo", 7);

        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
        c.colorFigura();
        System.out.println(c);
    }
}
