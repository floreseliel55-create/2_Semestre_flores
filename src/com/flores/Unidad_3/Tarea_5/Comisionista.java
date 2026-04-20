package com.flores.Unidad_3.Tarea_5;

public class Comisionista extends Empleado {
    private double porcentajeVenta;
    private double ventas;
    public Comisionista(String nombre, char sexo, int edad, String IDEmpleado, double porcentajeVenta, double ventas){
        super(nombre,sexo,edad,IDEmpleado,0,0);
        this.porcentajeVenta=porcentajeVenta;
        this.ventas=ventas;
    }
    @Override
    // Calcula el sueldo basado en porcentaje de ventas
    public double calcularSueldo(){
        sueldo = (porcentajeVenta/100)*ventas;
        return sueldo;
    }
    @Override
    // Representación en texto del comisionista con porcentaje y ventas
    public String toString() {
        return super.toString()+", Porcentaje de Ventas = "+porcentajeVenta+", El total de las Ventas es de = "+ventas;
    }
    
}
