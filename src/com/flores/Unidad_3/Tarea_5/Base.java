/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */
// Conclusión: Base define el cálculo del sueldo fijo y demuestra cómo una subclase concreta implementa el método abstracto.
package com.flores.Unidad_3.Tarea_5;

public class Base extends Empleado {
    public Base(String nombre, char sexo, int edad, String IDEmpleado, int horasTrabajadas, double sueldo){
        super(nombre, sexo, edad, IDEmpleado, horasTrabajadas, sueldo);
    }
    @Override
    // Calcula el sueldo base del empleado
    public double calcularSueldo() {
        return sueldo;
    }
    @Override
    // Representación en texto del empleado base
    public String toString(){
        return super.toString()+", Es un empleado con sueldo base: ";
    }
}
