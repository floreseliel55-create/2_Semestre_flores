package com.flores.unidad_2.No_Revisados.Tarea_10_11_12;

public class EnteroX3 {

     int x;
    public static int getX(){
        return x;
    }
    public static void setX(int newX){
    x= newX;
}
// Tarea 12 
// Sergio Eliel Flores Urquidy
// Esto da error porque no se puede acceder a la variable de instancia x desde un método estático,
//  ya que los métodos estáticos no pueden acceder a variables de instancia sin una referencia a un objeto específico.
//  Para solucionar esto, se podría hacer que el método getX y setX sean métodos de instancia en lugar de métodos estáticos,
//  o se podría crear una instancia de EnteroX3 para acceder a la variable x.
    
}
