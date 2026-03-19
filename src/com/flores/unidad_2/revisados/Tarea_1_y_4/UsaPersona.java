package com.flores.unidad_2.revisados.Tarea_1_y_4;
import java.util.ArrayList;
import java.util.Scanner;
public class UsaPersona {
    // Tarea 4
    // Sergio Eliel Flores Urquidy
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Persona> personas= new ArrayList<>();
        System.out.println("Ingrese Cantidad De Objetos A Crear");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Ingrese Edad");
            int edad=sc.nextInt(); //25 enter
            sc.nextLine();
            System.out.println("Ingrese Nombre");
            String nomb=sc.nextLine();
            personas.add(new Persona(nomb,edad));
        }
        for(Persona p: personas ){
            System.out.println(p.toString());
        }

    }
}
