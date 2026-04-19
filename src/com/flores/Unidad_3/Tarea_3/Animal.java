package com.flores.Unidad_3.Tarea_3;

public class Animal {
    private String especie;
    public Animal(String especie){
        this.especie=especie;
    }
    public String getEspecie(){
        return especie;
    }
    public void printMensaje(){
        System.out.println("Soy un animal de la especie "+especie);
    }
    public String toString(){
        return "Animal "+especie;
    }
}
