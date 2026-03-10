package com.flores.poo.unidad_2.No_Revisados.Tarea_6;
import java.util.*;
public class ClaseGrupo {
    // Tarea no. 6 Sergio Eliel Flores Urquidy
    // Clase del main para
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>(20);
        // Inicializacion de contactos
        contactos.add(new Contacto("Juan",'F', "tilin", "667456789", "juan@correo.com", 25));
        contactos.add(new Contacto("Maria", 'M', "alcachofa", "987654321", "maria@correo.com", 30));
        contactos.add(new Contacto("Michael-Jackson",'M', "Rey del POP", "555123456", "michael@correo.com", 40));
        contactos.add(new Contacto("Luis Miguel",'M',"el Sol", "1112223334", "luis@correo.com", 35));
        contactos.add(new Contacto("Francsica",'F',"Pakita la del barrio", "999888777", "francisca@correo.com", 28));
        contactos.add(new Contacto("Zendaya",'F',"Mary Jane", "777666555", "zendaya@correo.com", 22));
        contactos.add(new Contacto("Bruce Lee",'M',"Pequeño dlagon oliental", "123456789", "bruce@correo.com", 30));
        contactos.add(new Contacto("Justin Bieber",'M',"EL BABY", "987654321", "justin@correo.com", 25));
        contactos.add(new Contacto("Jenny Rivera",'F',"La gran señora", "555123456", "jenny@correo.com", 32));
        contactos.add(new Contacto("Kimberly loaiza",'F',"Jorge", "777666555", "kimberly@correo.com", 28));
        contactos.add(new Contacto("Luis Martinez",'M',"tilin", "6671234567", "luis.martinez@correo.com", 24));
        contactos.add(new Contacto("Ana Lopez",'F',"Mona", "6672345678", "ana.lopez@correo.com", 31));
        contactos.add(new Contacto("Pedro Sanchez",'M',"infante", "6673456789", "pedro.sanchez@correo.com", 27));
        contactos.add(new Contacto("Carla Ramirez",'F',"Lau", "6674567890", "carla.ramirez@correo.com", 22));
        contactos.add(new Contacto("Diego Torres",'M',"dieguin", "6675678901", "diego.torres@correo.com", 35));
        contactos.add(new Contacto("Sofia Herrera",'F',"guerrera", "6676789012", "sofia.herrera@correo.com", 29));
        contactos.add(new Contacto("Jorge Castillo",'M',"feo", "6677890123", "jorge.castillo@correo.com", 41));
        contactos.add(new Contacto("Valeria Cruz",'F',"gorda", "6678901234", "valeria.cruz@correo.com", 26));
        contactos.add(new Contacto("Ricardo Vega",'M',"mañoso", "6679012345", "ricardo.vega@correo.com", 33));
        contactos.add(new Contacto("Daniela Morales",'F',"tyranitar", "6670123456", "daniela.morales@correo.com", 30));
        // Impresion de un contacto x
        System.out.println(contactos.get(2));
        System.out.println();
        // Se crea un objeto para acceder a sus metodos
        ListadoContactos listado = new ListadoContactos();
        
        // Se crea un ArrayList para almacenar los contactos que cumplan con la condicion de ser mujeres y para imprimirlo
        ArrayList<Contacto> mujeres = listado.listadoMujeres(contactos);

        System.out.println("Lista de mujeres ");
        for(int i=0; i<mujeres.size(); i++){
            System.out.println(mujeres.get(i));
        }
        System.out.println();
        // Imprime la edad promedio de los contactos
        System.out.println("Edad promedio: ");
        System.out.println(listado.edadPromedio(contactos));
        System.out.println();
        // Imprime los contactos cuyo nombre empieza con A
        System.out.println("Nombres que empiezan con A: ");
        System.out.println(listado.nombresConA(contactos));
        System.out.println();


    }
}
