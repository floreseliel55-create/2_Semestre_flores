package com.flores.poo.unidad_2;

public class Persona{
       private String nombre;
       private int edad;
       private char sexo;
    public Persona(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
    }
    
    // ! ojo al dato crack
    public void SetSexo(char g){
        sexo=g;
    }
    public String toString(){
        return nombre +","+edad;
    }
    public char getSexo(){
        return sexo;
    }
    public static void main(String[] args){
        Persona objeto1 = new Persona("tilin", 12);

        System.out.println(objeto1);
        objeto1.SetSexo('M');
        System.out.println(objeto1.getSexo());
    }
    
}
