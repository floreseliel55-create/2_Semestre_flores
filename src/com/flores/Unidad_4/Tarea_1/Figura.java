package com.flores.Unidad_4.Tarea_1;

public abstract class Figura {
    protected double area;
    public Figura(){
        this.area=0.0;
    }
    public final void dibujar(){
        System.out.println("Dibujando figura...");
    }
    public abstract double calcularArea();
    @Override
    public String toString(){
        return "Figura con area "+ area;
    }
}
