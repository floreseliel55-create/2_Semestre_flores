package com.flores.Unidad_4.Tarea_7;

public abstract class FiguraGeometrica implements Cloneable{
    private String color;
    public FiguraGeometrica(String color){
        this.color=color;
        
    }
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract void colorFigura();

    public String toString(){
        return color+".";
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
