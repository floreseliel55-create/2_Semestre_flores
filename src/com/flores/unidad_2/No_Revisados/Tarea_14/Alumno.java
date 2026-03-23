package com.flores.unidad_2.No_Revisados.Tarea_14;

public class Alumno {

    private String nombre;
    private String apellido;
    private char sexo;
    private double calificacion;

    public Alumno(String nombre, String apellido, char sexo, double calificacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.calificacion=calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public String toString(){
        return nombre+" "+apellido+","+sexo+","+calificacion;
    }
    
}
