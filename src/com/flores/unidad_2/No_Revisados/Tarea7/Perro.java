package com.flores.unidad_2.No_Revisados.Tarea7;

public class Perro {
    // Tarea 7
    // Sergio Eliel Flores Urquidy
    
    private String nombre;
    private char sexo;
    private String raza;
    private int edad;
    private String color;
    private double peso;

    Perro(String nombre, char sexo, String raza){
        this.nombre = nombre;
        this.sexo = sexo;   
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String toString(){
        return "Nombre:"+nombre+", sexo:"+sexo+", raza:"+raza+", edad:"+edad+", color:"+color+", peso:"+peso; 
    }
    
}
