package com.flores.poo.unidad_2;
import java.util.*;
public class ClaseGrupo {
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>(20);
        Scanner sc = new Scanner(System.in);
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
        System.out.println(contactos.get(0));
    }
}
