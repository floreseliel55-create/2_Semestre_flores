package com.flores.poo.unidad_2;

public class PersonaX1{
       private String nombre="pepe";
       private int edad=0;
       private char sexo='M';
    public PersonaX1(String nombre, int edad){
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
        PersonaX1 objeto1 = new PersonaX1("Jose",17);
        // al principio no escribio el sexo porque no estaba en el constructor de la clase
        // pero con los metodos get y set le pusimos valor sin estar en el constructor
        System.out.println(objeto1);
        objeto1.SetSexo('M');
        System.out.println(objeto1.getSexo());
        //aprendi la funcion de get y set y para que funciona el constructor
    }
    
}
