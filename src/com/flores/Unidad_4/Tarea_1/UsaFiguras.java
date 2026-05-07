package com.flores.Unidad_4.Tarea_1;

public class UsaFiguras {
    // Circulo extiende de Figura, y redefine el metodo calcularArea() y el metodo dibujar()
    // el problema que da es que al querer sobreescribir el metodo dibujar() no se puede porque es final
    // el metodo calcularArea() se puede redefinir porque es abstracto en la clase Figura,
    // lo que obliga a las subclases a implementarlo pero el metodo final las clases derivadas no pueden.
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println(circulo);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        circulo.dibujar();
    }
}
