package com.flores.tarea_8;

public class EjecutadorQuimica {
    public static void Main(String[] args) {
        Quimica objeto = new Quimica(422);
        double longitudOnda = (objeto.getPlanck()) / (objeto.getMasaElectron() * objeto.getVelocidadElectron());
        double energia = ((objeto.getVelocidadLuz() * objeto.getPlanck()) / longitudOnda);

        System.out.println("LA longitud es igual " + longitudOnda);

    }
}
