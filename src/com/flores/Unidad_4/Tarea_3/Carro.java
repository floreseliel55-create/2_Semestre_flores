package com.flores.Unidad_4.Tarea_3;

public class Carro {
    private String marca;
    private int año;
    public Carro(String marca, int año){
        this.marca=marca;
        this.año=año;
    }
    public String getMarca(){
        return marca;
    }
    public int getAño(){
        return año;
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Carro )) {
            return false;
        }
        Carro car = (Carro) obj;
        return this.marca.equals(car.getMarca())&& this.año==car.getAño();
    }
    public String toString(){
        return "Carro marca "+ marca+" del año "+ año;
    }
}
