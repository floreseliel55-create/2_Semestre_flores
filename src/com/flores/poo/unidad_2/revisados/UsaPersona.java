package com.flores.poo.unidad_2;
import java.util.ArrayList;
import java.util.Scanner;
public class UsaPersona {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<PersonaX1> personas= new ArrayList<>();
        System.out.println("Ingrese Cantidad De Objetos A Crear");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Ingrese Edad");
            int edad=sc.nextInt(); //25 enter
            sc.nextLine();
            System.out.println("Ingrese Nombre");
            String nomb=sc.nextLine();
            personas.add(new PersonaX1(nomb,edad));
        }
        for(PersonaX1 p: personas ){
            System.out.println(p.toString());
        }

    }
}
