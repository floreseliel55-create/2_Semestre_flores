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
