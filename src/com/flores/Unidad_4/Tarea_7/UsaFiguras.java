package com.flores.Unidad_4.Tarea_7;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaFiguras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        int opcion;
        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Agregar Circulo");
            System.out.println("2. Agregar Cuadrado");
            System.out.println("3. Agregar Triangulo");
            System.out.println("4. Mostrar Figuras");
            System.out.println("5. Mostrar color de la figura mas grande");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");

            opcion = leer.nextInt();
            switch(opcion){

                case 1:
                    System.out.print("Color: ");
                    String colorC = leer.next();

                    System.out.print("Radio: ");
                    double radio = leer.nextDouble();

                    figuras.add(new Circulo(colorC, radio));
                    break;

                case 2:
                    System.out.print("Color: ");
                    String colorCu = leer.next();

                    System.out.print("Lado: ");
                    double lado = leer.nextDouble();

                    figuras.add(new Cuadrado(colorCu, lado));
                    break;

                case 3:
                    System.out.print("Color: ");
                    String colorT = leer.next();

                    System.out.print("Base: ");
                    double base = leer.nextDouble();

                    System.out.print("Altura: ");
                    double altura = leer.nextDouble();

                    System.out.print("Lado 2: ");
                    double lado2 = leer.nextDouble();

                    System.out.print("Lado 3: ");
                    double lado3 = leer.nextDouble();

                    figuras.add(
                            new Triangulo(base, altura, lado2, lado3, colorT)
                    );

                    break;

                case 4:
                    for(FiguraGeometrica f : figuras){
                        System.out.println(
                                f.toString()+ "\tArea: "+ f.calcularArea()+ "\tPerimetro: "+ f.calcularPerimetro());
                    }
                    break;

                case 5:
                    if(figuras.isEmpty()){

                        System.out.println("No hay figuras");

                    }else{
                        FiguraGeometrica mayor = figuras.get(0);
                        for(FiguraGeometrica f : figuras){
                            if(f.calcularArea() > mayor.calcularArea()){
                                mayor = f;
                            }
                        }
                        System.out.println(
                                "El color de la figura con mayor area es: "+ mayor.getColor());
                        System.out.println("Area mayor: "+ mayor.calcularArea());
                    }
                    break;

                case 6:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 6);
    }
}
