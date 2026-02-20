package com.flores.poo.unidad_2;
import java.util.Scanner;
public class UsaProducto{

    public static void PedirClave (Scanner sc,int repeticiones, Producto[] productos) {
        for(int i=0; i<repeticiones; i++ ) {
            System.out.println("Producto "+(i+1));
            System.out.println("Ingrese clave ");
            int clave = sc.nextInt();
            System.out.println("Ingrese descripcion ");
            sc.nextLine();
            String descripcion = sc.nextLine();
            System.out.println("Ingrese precio ");
            int precio = sc.nextInt();
            System.out.println("Ingrese cantidad ");
            int cantidad = sc.nextInt();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            productos[i]=new Producto(clave, descripcion, precio, cantidad);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[10]; 
        int repeticiones=10;
        PedirClave(sc,repeticiones, productos);

        for(int i=0; i<repeticiones;i++) {
            System.out.println("Se guardo en producto "+(i+1)+" "+productos[i].toString());
            System.out.println("El total fue de "+productos[i].calcularTotal());
            
        }
        
    }
}