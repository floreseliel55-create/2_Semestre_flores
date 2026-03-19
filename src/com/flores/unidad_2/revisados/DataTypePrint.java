package com.flores.unidad_2.revisados;

public class DataTypePrint {
    // Suma dos enteros
    public static int suma(int a, int b){
        return a+b;
    }
    public static int suma(int[] datos){
        int suma=0;
        for(int a: datos)
            suma=suma+a;
        return suma;
    }
    public static double suma(double PI){
        return PI+PI;
    }

    public static void main(String[] args)

    {

        Thread objectData = new Thread();
        String stringData = "Java Mania ";
        char[] charArrayData = {'a','b','c'};
        int integerData =4;
        long longData = Long.MIN_VALUE;
        float floatData = Float.MAX_VALUE;
        double doubleData = Math.PI;
        boolean booleanData = true;

        System.out.println(objectData);
        System.out.println(stringData);
        System.out.println(charArrayData);
        System.out.println(integerData);
        System.out.println(longData);
        System.out.println(floatData);
        System.out.println(doubleData);
        System.out.println(booleanData);

        System.out.println("Suma de 2 Enteros "+ suma(3,5));
        int[] arreglo = {1,2,3,4,5,6,7};
        System.out.println("Suma un arreglo de enteros "+suma(arreglo));
        System.out.println("Suma de valores doubles: "+suma(doubleData));
        

    }

    
}
