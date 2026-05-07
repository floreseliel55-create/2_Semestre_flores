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

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // clone 
    @Override
    public Triangulo clone() {
        return new Triangulo(base, altura, lado2, lado3, getColor());
    }
    @Override
    public void colorFigura(){
        System.out.println("El color del triangulo :"+getColor());
    }

    // equals
    @Override
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

    // ── toString ───────────────────────────────────────────
    @Override
    public String toString() {
        return String.format("Triangulo | base=%.2f, altura=%.2f, lado2=%.2f, lado3=%.2f, color=%s",
                base, altura, lado2, lado3, getColor());
    }
}
