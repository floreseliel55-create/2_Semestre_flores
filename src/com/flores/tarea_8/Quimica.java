package com.flores.tarea_8;
import java.lang.Math;

public class Quimica {
    private final double planck=Math.pow(6.63*10, -34);
    private final double masaElectron=Math.pow(9.11*10, -31);
    private final double velocidadLuz=Math.pow(3*10, 8);
    private final double rh=Math.pow(2.18*10, -18);
    private final double convNmToM=Math.pow(10, -9);
    private final double notacionCientifica=10;
    private int velocidadElectron;
    Quimica(int velocidadElectron){
        this.velocidadElectron=velocidadElectron;
    }

    public double getPlanck() {
        return planck;
    }

    public double getMasaElectron() {
        return masaElectron;
    }

    public double getVelocidadLuz() {
        return velocidadLuz;
    }

    public double getRh() {
        return rh;
    }

    public double getNanoAMetros() {
        return convNmToM;
    }

    public double getNotacionCientifica() {
        return notacionCientifica;
    }

    public int getVelocidadElectron() {
        return velocidadElectron;
    }

    public void setVelocidadElectron(int velocidadElectron) {
        this.velocidadElectron = velocidadElectron;
    }
    

    
    
}
