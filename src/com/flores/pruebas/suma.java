package com.flores.pruebas;
import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        int num1, num2, suma=0;
        num1=sc.nextInt();
        num2=sc.nextInt();
        suma=num1+num2;
        System.out.println("La Suma de los dos numeros es de:"+suma);
     
    }
}
