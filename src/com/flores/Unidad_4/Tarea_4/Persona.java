package com.flores.Unidad_4.Tarea_4;

public class Persona{
    // Tarea 1 
    // Sergio Eliel Flores Urquidy
       private String nombre="pepe";
       private int edad=0;
       private char sexo='M';
    public Persona(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
    }
    public void SetSexo(char g){
        sexo=g;
    }
    public String toString(){
        return nombre +","+edad;
    }
    public char getSexo(){
        return sexo;
    }
    
}
