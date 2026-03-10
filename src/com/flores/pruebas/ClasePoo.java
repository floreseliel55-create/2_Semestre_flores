package com.flores.pruebas;

public class ClasePoo {
    private String nombre= "";
    private int edad;
    private char sexo='M';
    private double peso;
    private double altura;
    public ClasePoo(){

    }
    public ClasePoo (String nombre, int edad, char sexo, double peso){
        
    }
    public ClasePoo (String nombre, int edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    public boolean mayoriaEdad(int edad){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
        
    }
    public String toString(){
        return "("+nombre+")"+"("+edad+")"+"("+sexo+")"+"("+peso+")"+"("+altura+")";
    }
}
