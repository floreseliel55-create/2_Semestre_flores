package com.flores.unidad_2.No_Revisados;
    // TAREA NUMERO 8  DE EJEMPLOS CON ENUM
    // Sergio Eliel Flores Urquidy
    public class Enums{


        public enum Color {

        RED,
        BLUE,
        YELLOW,
        PINK,
        PURPLE;

        }
        // Días de la semana
    public enum DiaSemana { 

    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO

    }
    // Meses del año
    public enum Mes {
    ENERO,
    FEBRERO,
    MARZO,
    ABRIL,
    MAYO,
    JUNIO,
    JULIO,
    AGOSTO,
    SEPTIEMBRE,
    OCTUBRE,
    NOVIEMBRE,
    DICIEMBRE
}
    // Estaciones del año
    public enum Estacion {
    PRIMAVERA,
    VERANO,
    OTOÑO,
    INVIERNO
}
// Monedas
    public enum Moneda {
    DOLAR,
    QUARTER,
    PENNY
}
    public static void main(String[] args) {
        Color colorFavorito = Color.BLUE;
        DiaSemana diaActual = DiaSemana.MIERCOLES;
        Mes mesActual = Mes.OCTUBRE;
        Estacion estacionActual = Estacion.OTOÑO;

        System.out.println("Color favorito: " + colorFavorito);
        System.out.println("Día actual: " + diaActual);
        System.out.println("Mes actual: " + mesActual);
        System.out.println("Estación actual: " + estacionActual);
        System.out.println("Moneda: " + Moneda.QUARTER);

    }
    }
