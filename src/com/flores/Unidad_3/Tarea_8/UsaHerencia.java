/*
 * Alumno: Sergio Eliel Flores Urquidy
 * Maestra: Maria Lucia Barron Estrada
 * Materia: Programacion orientada a objetos
 */

// ¿Que errores de compilacion encontraste? que olvidaba poner el extends en las clases que le heredan
//¿Que sucede cuando creas objetos? se iban escribiendo los System.out.println de los constructores en orden de su herencia
//¿Cómo demuestras quee stas usando un atributo o metodo heredado? Lo demuestro en la manera en que
// en la subclase no existen esos atributos o metodos pero los puedo utilizar.
// Conclusión: la herencia permite acceder a atributos y métodos de la superclase desde las subclases, mostrando su comportamiento compartido.

package com.flores.Unidad_3.Tarea_8;

import java.util.ArrayList;

public class UsaHerencia {
    // Método principal que demuestra el uso de la jerarquía de herencia
    public static void main(String[] args){
        Uno uno = new Uno();
        A a = new A();
        G g = new G();
        D d = new D();
        H h = new H();
        C c = new C();
        X x = new X();

        a.setValor1(1);
        System.out.println(a.getValor1());
        g.setValor1(2);
        System.out.println(g.getValor1());
        d.setValor1(3);
        System.out.println(d.getValor1());
        h.setValor1(4);
        System.out.println(h.getValor1());
        c.setValor1(5);
        System.out.println(c.getValor1());
        x.setValor1(6);
        System.out.println(x.getValor1());

        

        
    }
    
}
