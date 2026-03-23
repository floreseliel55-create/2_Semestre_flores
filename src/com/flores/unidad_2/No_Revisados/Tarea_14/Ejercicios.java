package com.flores.unidad_2.No_Revisados.Tarea_14;

public class Ejercicios {

    private String palabraString;
    private int contador=0;
    private int totalnumeros=0;
    private boolean numeroEs=false;
    private String[] unidades = {"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve",
                                "Diez","Once","Doce","Trece","Catorce","Quince","Dieciséis","Diecisiete",
                                "Dieciocho","Diecinueve","Veinte"};
    private String[] decenas = {"","","Veinti","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};

    public Ejercicios(String palabraString){
        this.palabraString=palabraString;

    }
    // 1 Metodo que me dice cuantas x tiene una palabra
    public int obtenerNumeroDeX(char x){

        for(int i=0; i<palabraString.length(); i++){
            if(Character.toLowerCase(palabraString.charAt(i))==Character.toLowerCase(x)){
                contador++;
            }
        }
        return contador;
    }
    // 2 Metodo que me dice cuantos numeros hay en un String
    public int obtenerNumeroDeX(String palabraNumeros){

        for(int i=0;i<palabraNumeros.length();i++){
            if(Character.isDigit(palabraNumeros.charAt(i))){
                totalnumeros++;
            }
        }

        return totalnumeros;
        
    }
    // 3 Metodo que verifica si un numero es par o impar
    public boolean parOImpar(int numero){

        if(numero%2==0){
            numeroEs=true;
        }
        else{
            numeroEs=false;
        }
        return numeroEs;
    }
    // 4 Metodo que determina si un numero es primo
    public boolean primoOno(int numero){

        if(numero<=1) return false;

        for(int i=2; i< numero; i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
    // 5 Metodo que saca el escrito de numeros del 0 al 100
    public String numeroEscrito(int numero){

        if(numero>=0 & numero<=20){
            return unidades[numero];
        }
        if(numero==100){
            return "Cien";
        }
        if(numero>20 & numero<30){
            return decenas[2]+unidades[numero%10];
        }
        else{
            int decena = numero/10;
            int unidad = numero%10; // esto descompone el numero para poder trabajarlo
            return decenas[decena]+" Y "+unidades[unidad];
        }
        
    }
    // 7 Metodo que recibe como parametros un arreglo de objetos tipo alumno y regrese el numero de mujeres que hay
    public int mujeresCantidad(Alumno[] arregAlumno){

        int contadorMujeres=0;
        for(int i=0; i < arregAlumno.length; i++){
            if(arregAlumno[i].getSexo()=='F'){
                contadorMujeres++;
            }
        }
        return contadorMujeres;

    }
    // 8 Metodo que me regrese el promedio del arreglo de alumnos
    public double promedioAlumno(Alumno[] arregAlumno){
        
        double promedio=0;

        for(int i=0; i<arregAlumno.length; i++){
            promedio+=arregAlumno[i].getCalificacion();
        }
        promedio=promedio/arregAlumno.length;
        return promedio;
    }
    // 9 Metodo que regrese el total de alumnos que sacaron menos de 70
    public int alumnosReprobados(Alumno[] arregAlumnos){

        int reprobados=0;
        for(int i=0; i<arregAlumnos.length; i++){
            if(arregAlumnos[i].getCalificacion()<70){
                reprobados++;
            }
        }
        return reprobados;
    }
    
    
}
