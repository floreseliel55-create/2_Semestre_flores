package com.flores.unidad_2.No_Revisados.Tarea_7;

public class UsaPerro {

    public static void main(String[] args) {
        Perro scoobyDoo = new Perro("Scooby duby Doo",'M' , "Gran Danes",10);

        System.out.println(scoobyDoo.toString());

        System.out.println("Tu perro tiene una edad equivalente en años humanos de: "+scoobyDoo.calcularEdadPerruna());



    }
    
}
