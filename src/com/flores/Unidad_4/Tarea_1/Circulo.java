package com.flores.Unidad_4.Tarea_1;

public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio){
        this.radio=radio;
    }
    // se puede redefinir pq es abstracto en la clase Figura
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }
    // no se puede sobreescribir el método dibujar() porque es final en la clase Figura
     public void dibujar(){
     System.out.println("Dibujando un circulo...");
    }
    @Override
    public String toString(){
        return super.toString()+","+ radio;
    }
}
