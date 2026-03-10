package com.flores.pruebas;
import java.util.Scanner;

    public class Carro{
        String color;
        String marca;
        int kilometraje;

    class Comprobar{
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        carro1.color = "Blanco";
        carro1.marca = "Ferrari";
        carro1.kilometraje = 0;

        System.out.println("El Color del Carro 1 es: "+carro1.color);

        Carro carro2 = new Carro();
        carro2.color = "Negro";
        carro2.marca = "Lamborghini";
        carro2.kilometraje = 1200;
        System.out.println("La marca del Carro 2 es "+carro2.marca);
        System.out.println("Para saber la informacion de algun carro Ingrese un numero 1 o 2");
        int opciones = sc.nextInt();
        

    }
}

