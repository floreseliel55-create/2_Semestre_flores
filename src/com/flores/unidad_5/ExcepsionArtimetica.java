package com.flores.unidad_5;
// Sergio Eliel Flores Urquidy 
// Maria Lucia Barron Estrada
// Programaion Orientada a Objetos

// Tarea 1 Manejo de Excepcion aritmetica
import java.util.Scanner;
public class ExcepsionArtimetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // el try para intentar primero ejecutar esto y si da error pasa al catch
            int num1, num2;
            System.out.println("Ingrese el primer numero: ");
            num1=sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2=sc.nextInt();
            int output=num1/num2;
            System.out.println("Resultado: "+output);
            
        } catch (ArithmeticException e) {
            // el catch me lanza un mensaje de que no se deberia dividir entre 0
            System.out.println(" No deberias dividir entre 0: ");
        }
        catch(Exception e){
            System.out.println("Ingrese un numero entero: ");
        }
    // Dikjstra dijo que no se debe poner while infinito para romperlos con un return 
    }
}
