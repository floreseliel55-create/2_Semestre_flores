package com.flores.Unidad_4.Tarea_7;

public class Circulo extends FiguraGeometrica{
    private double radio;
    public Circulo(String color, double radio){
        super(color);
        this.radio=radio;
    }
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }
    public double calcularPerimetro(){
        return (radio*2)*Math.PI;
    }
    public void colorFigura(){
        System.out.println("El Color del Circulo: "+getColor());
    }
    public boolean equals(Object o){
        if(! (o instanceof Circulo)){
            return false;
        }
        Circulo c = (Circulo) o;
        if(super.equals(c)){
            return this.getColor().equals(c.getColor());
        }
        return false;
    }
    public Object clone(){
        Object obj= null;
        try{
            obj= (Circulo) super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" No se puede clonar ");
        }
        return obj;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String toString(){
        return super.toString()+","+radio+", Circulo";
    }
    
    
}
