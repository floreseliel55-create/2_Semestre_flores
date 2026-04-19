package com.flores.Unidad_3.Tarea_4;

public class Alumno extends Persona {
    private String ID;
    private String carrera;
    private double promedio;
    public Alumno(String nombre, char sexo, int edad, String ID, String carrera, double promedio) {
        super(nombre, sexo, edad);
        this.ID = ID;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    // Devuelve el ID del alumno
    public String getID() {
        return ID;
    }
    // Modifica el ID del alumno
    public void setID(String iD) {
        ID = iD;
    }
    // Obtiene la carrera del alumno
    public String getCarrera() {
        return carrera;
    }
    // Modifica la carrera del alumno
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    // Obtiene el promedio del alumno
    public double getPromedio() {
        return promedio;
    }
    // Modifica el promedio del alumno
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    // Representación en texto del alumno con datos heredados y propios
    public String toString(){
        return super.toString() +"ID = "+ID+", Carrera = "+carrera+", Promedio = " + promedio; 
    }
    
}
