//Ejercico de la clase Triangulo
//Sergio Eliel Flores Urquidy 12/02/2026
//puede borrar la linea de el package si no ejecuta
package com.flores.poo.unidad_2;
import java.util.Scanner;
public class Triangulo{
    // atributos que le damos a la clase Triangulo
    // de manera privada para que solo tenga accesso la clase en la que está
    // creo que esto es parte del encapsulamiento
    private int base;
    private int altura;
    //constructor porque tiene un nombre que referencia a la clase y sus valores los guarda 
    // para poder trabajar mas adelante con ellos en getter y setter
    public Triangulo(int b, int a){
        this.base= b;
        this.altura= a;
    }
    // este metodo me da los valores del objeto de tipo string para imprimir y concatenar
    public String ToString(){
            return base +","+altura;
         

        }
        //este set me permite modificar el valor de la base
        public void SetBase(int b){
            base=b;
        }
        //lo mismo pero de la altura
        public void SetAltura(int a){
            altura=a;
        }
        //lo mismo de abajo pero de la base
        public int GetBase(){
            return base;
        }
        //me permite acceder a la altura actual sin exponerla, aunque aun no entiendo que problema habria si la "Expongo"
        public int GetAltura(){
            return altura;
        }
        // este es el ejecutador como tal
        public static void main(String[] args){
            //se declara el objeto 
            Triangulo figura1 = new Triangulo(9, 8);
            //se declara el scanner para pedir los datos
            Scanner sc = new Scanner(System.in);
            //declaro variable a utilizar
            String cambio;
            //estas variables se las voy a pasar a los setter para que la actualizen
            int bas;
            int alt;
            //imprimo los valores de tipo string            
            System.out.println("Los valores de Base y Altura son: "+figura1.ToString());
            //pido si quieren cambiar los valores por defecto
            System.out.println("Ingrese 1 si desea cambiar los valores, si no teclee cualquier letra: ");
            cambio=sc.nextLine();
            //si teclea uno los cambia y si no, no lo hace

            switch(cambio){
                //pide base y altura 
                case "1":System.out.println("Ingrese la Base: ");
                bas=sc.nextInt();
                System.out.println("Ingrese la Altura: ");
                alt=sc.nextInt();
                //actualiza los valores
                figura1.SetBase(bas);
                figura1.SetAltura(alt);
                System.out.println("Ahora Los valores de Base y Altura son: "+figura1.ToString());
            break;
            }
            //hago la operacion directamente
            System.out.println("EL AREA DEL TRIANGULO ES: "+(figura1.base*figura1.altura)/2);
            


            
             
        }
    
}
//

