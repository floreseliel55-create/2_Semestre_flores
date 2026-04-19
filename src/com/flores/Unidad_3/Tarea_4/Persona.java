package com.flores.Unidad_3.Tarea_4;

public class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    public Persona(String nombre, char sexo, int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
    }
    
    // Devuelve el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Modifica el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtiene el sexo de la persona
    public char getSexo() {
        return sexo;
    }

    // Modifica el sexo de la persona
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Obtiene la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Modifica la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    // Representación en texto de la persona con nombre, sexo y edad
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
}
