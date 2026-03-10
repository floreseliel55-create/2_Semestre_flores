package com.flores.poo.unidad_2;
import java.util.Arrays;
public class UsaPuntoX9{
    public static void main(String[] args) {
        PuntoX9 punto1= new PuntoX9(2,1);
        PuntoX9 punto2= new PuntoX9(5,5);
        PuntoX9 punto3= new PuntoX9(6, 7);
        
        //este no lo toma en cuenta el contador de puntos
        PuntoX9 punto4= punto1; //<---- no esta creando un objeto nuevo
        PuntoX9 punto5 = new PuntoX9 (9999,9999);
        PuntoX9[] puntos = {punto1, punto2, punto3, punto4, punto5};
        System.out.println("Punto 1 = "+punto1);
        System.out.println(Arrays.toString(puntos));
        System.out.println("Puntos creados :"+PuntoX9.totalPuntos); 
    }
}
