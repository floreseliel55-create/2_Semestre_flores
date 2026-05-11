package com.flores.Unidad_4;

public class ejercicio {
    public static void main(String[] args) {
        int[] array = new int[]{
        1,2,3,4,5,6,7,8,9,10
    };
    int target=7;
    for(int i=0;i<array.length; i++){
        // posicion 0 numero 1
        int encontrar;
        // guardo variable encontrar
        encontrar=target-array[i];
        // encontrar=7-1
        // 6=7-1

        // si posicion actual es la primera del arreglo
        if(array[i]==array[0]){
            int guardar;
            // guardo variable a encontrar
            guardar=target-array[i];
        }
        if(array[i]==guardar){
            
        }
    }

    }

}

