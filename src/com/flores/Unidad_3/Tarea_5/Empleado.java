package com.flores.Unidad_3.Tarea_5;
import com.flores.Unidad_3.Tarea_4.Persona;
public abstract class Empleado extends Persona {
    private String IDEmpleado;
    protected int horasTrabajadas;
    protected double sueldo;
    public Empleado(String nombre, char sexo, int edad, String IDEmpleado, int horasTrabajadas, double sueldo){
        super(nombre, sexo, edad);
        this.IDEmpleado=IDEmpleado;
        this.horasTrabajadas=horasTrabajadas;
        this.sueldo=sueldo;
    }
    // Devuelve el ID del empleado
    public String getIDEmpleado() {
        return IDEmpleado;
    }
    // Modifica el ID del empleado
    public void setIDEmpleado(String iDEmpleado) {
        IDEmpleado = iDEmpleado;
    }
    // Obtiene las horas trabajadas del empleado
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    // Modifica las horas trabajadas del empleado
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    // Obtiene el sueldo del empleado
    public double getSueldo() {
        return sueldo;
    }
    // Modifica el sueldo del empleado
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    // Método abstracto para calcular el sueldo
    public abstract double calcularSueldo();
    @Override
    // Representación en texto del empleado
    public String toString() {
        return super.toString()+"IDEmpleado = " + IDEmpleado + ", Horas Trabajadas = "+horasTrabajadas+", Sueldo = "+sueldo;
    }
}
