package com.flores.Unidad_3.Tarea_5;

public class EmplPorHora extends Empleado {
    private double tarifa;
    public EmplPorHora(String nombre, char sexo, int edad, String IDEmpleado, int horasTrabajadas, double tarifa){
        super(nombre, sexo, edad, IDEmpleado, horasTrabajadas, 0);
        this.tarifa = tarifa;
    }
    @Override
    // Calcula el sueldo basado en horas trabajadas y tarifa
    public double calcularSueldo(){
        sueldo=horasTrabajadas*tarifa;
        return sueldo;
    }
    @Override
    // Representación en texto del empleado por hora con tarifa
    public String toString(){
        return super.toString()+", La tarifa de el empleado es = "+tarifa;
    }
    
}
