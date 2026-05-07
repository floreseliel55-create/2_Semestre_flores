package com.flores.Unidad_4.Tarea_3;

public class MainVehiculos {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 2020);
        Carro carro2 = new Carro("Ford", 2014);
        Bicicleta bici = new Bicicleta("Roja", 20);
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(bici);

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(bici));
    }
}
