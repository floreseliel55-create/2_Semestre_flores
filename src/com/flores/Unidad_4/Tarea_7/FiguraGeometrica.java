package com.flores.Unidad_4.Tarea_7;

public abstract class FiguraGeometrica {
    private String color;
    public FiguraGeometrica(String color){
        this.color=color;
        
    }
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract void colorFigura();

    public String toString(){
        return ","+color+","+calcularArea()+","+calcularPerimetro();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
