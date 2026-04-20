package com.flores.Unidad_3.Tarea_5;
import java.util.ArrayList;

public class MainEmpleados {
    // Método principal que crea empleados y muestra sus datos y sueldos
    public static void main(String[] args) {
        ArrayList <Empleado> empleados =  new ArrayList<>();
        Comisionista comisionista1 = new Comisionista("Juan", 'M', 30, "C001", 10, 20000);
        empleados.add(comisionista1);
        EmplPorHora emplPorHora1= new EmplPorHora("Kimberly",'F', 19,"D001", 50, 162.5 );
        empleados.add(emplPorHora1);
        Base emplBase = new Base ("Ramon", 'M', 20, "Z001", 40, 5000);
        empleados.add(emplBase);

        for(Empleado i: empleados){
            System.out.println(i);
            System.out.println(i.calcularSueldo());
        }

    }
}
