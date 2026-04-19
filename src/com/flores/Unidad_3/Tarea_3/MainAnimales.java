package com.flores.Unidad_3.Tarea_3;

public class MainAnimales {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais");
        Gato gato1= new Gato ("Bigotes");
        Abeja abeja1 = new Abeja("Barry");
        Gallina gallina1 = new Gallina("Clara");

        System.out.println(gato1);
        gato1.printMensaje();
        gato1.printSonido();

        System.out.println(perro1);
        perro1.printMensaje();
        perro1.printSonido();

        System.out.println(abeja1);
        abeja1.printMensaje();
        abeja1.printSonido();

        System.out.println(gallina1);
        gallina1.printMensaje();
        gallina1.printSonido();
    }
}
