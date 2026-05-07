package com.flores.Unidad_4.Tarea_7;

public class Cuadrado extends FiguraGeometrica {
    private double lado;
    public Cuadrado(String color, double lado){
        super(color);
        this.lado=lado;
    }
    public void colorFigura(){
        System.out.println("El Color del cuadrado: "+getColor());
    }
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return lado*4;
    }
     public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
     public boolean equals(Object o){
        if(! (o instanceof Cuadrado)){
            return false;
        }
        Cuadrado c = (Cuadrado) o;
        if(super.equals(c)){
            return Double.compare(this.lado, c.lado)==0 &&
            this.getColor().equals(c.getColor());
        }

        return false;
    }
    public Object clone(){
        Object obj= null;
        try{
            obj= (Cuadrado) super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" No se puede clonar ");
        }
        return obj;
    }
    public String toString(){
        return super.toString()+","+lado+", Cuadrado";
    }
}
