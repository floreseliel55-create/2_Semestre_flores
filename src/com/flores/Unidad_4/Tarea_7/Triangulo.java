package com.flores.Unidad_4.Tarea_7;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado2, double lado3, String color) {
        super(color);
        this.base    = base;
        this.altura  = altura;
        this.lado1   = base;
        this.lado2   = lado2;
        this.lado3   = lado3;
    }
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public Triangulo clone() {
        return new Triangulo(base, altura, lado2, lado3, getColor());
    }
    public void colorFigura(){
        System.out.println("El color del triangulo :"+getColor());
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangulo)) return false;
        Triangulo t = (Triangulo) obj;
        return Double.compare(base,    t.base)    == 0
            && Double.compare(altura,  t.altura)  == 0
            && Double.compare(lado2,   t.lado2)   == 0
            && Double.compare(lado3,   t.lado3)   == 0
            && getColor().equals(t.getColor());
    }
    public String toString() {
        return super.toString()+","+lado1+","+lado2+","+lado3+","+base+","+altura+", Triangulo";
    }
}
