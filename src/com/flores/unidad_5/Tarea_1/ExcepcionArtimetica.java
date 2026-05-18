package Tarea_1;
// Sergio Eliel Flores Urquidy 
// Maria Lucia Barron Estrada
// Programaion Orientada a Objetos

// Tarea 1 Manejo de Excepcion aritmetica
import java.util.Scanner;
public class ExcepcionArtimetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // el try para definir la parte del codigo que puede lanzar una excepcion
            int num1, num2;
            // pide dos numeros enteros que el usuario debe ingresar
            System.out.println("Ingrese el primer numero: ");
            num1=sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2=sc.nextInt();
            // hace la operacion
            int output=num1/num2; 
            // imprime la division correctamente
            System.out.println("Resultado: "+output);
            
        } catch (ArithmeticException e) {
            // el catch me lanza un mensaje de que no se deberia dividir entre 0
            System.out.println(" No deberias dividir entre 0: ");
        }
        catch(Exception e){
            // cacha otro tipo de excepciones mas generales
            System.out.println("Ingrese un numero entero: ");
        }
    // NOTA: usar un ciclo while o do-while para luego romperlo con un return es una muy mala practica de programación
    // porque según Edsger Dijkstra (Uno de los padres de la informatica) 
    // destruye la estructura unica de control y rompe el principio de verificación formal de un Programa.
    }

}
