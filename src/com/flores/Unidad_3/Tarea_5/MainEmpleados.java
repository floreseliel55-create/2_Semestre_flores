/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */

// Cree primero la clase mas general con los atributos y metodos que van a heredar todas las clases del empleado y lo cree como abstract
// ya que no voy a instanciar objetos de ella sino que la voy a usar como base de las demas
// la clase empleado tiene ademas metodo abstract que aplicando el polimorfismo las clases derivadas van a utilizar
// pero redefiniendo el metodo para que cada clase calcule su sueldo de diferente manera dependiendo de su tipo de empleado

// En el main cree los objetos de cada tipo de empleado y los guarde en un ArrayList de tipo Empleado
// para luego imprimir sus datos y su sueldo utilizando el metodo calcularSueldo que cada clase tiene implementado de manera diferente
// Conclusión: así se aplica polimorfismo para tratar varios tipos de empleado de forma uniforme y obtener su sueldo según su clase concreta.

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
