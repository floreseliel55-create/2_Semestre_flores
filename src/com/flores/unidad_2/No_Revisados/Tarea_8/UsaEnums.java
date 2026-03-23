package com.flores.unidad_2.No_Revisados.Tarea_8;

import com.flores.unidad_2.No_Revisados.Tarea_8.Enums.Color;
import com.flores.unidad_2.No_Revisados.Tarea_8.Enums.DiaSemana;
import com.flores.unidad_2.No_Revisados.Tarea_8.Enums.Estacion;
import com.flores.unidad_2.No_Revisados.Tarea_8.Enums.Mes;
import com.flores.unidad_2.No_Revisados.Tarea_8.Enums.Moneda;

public class UsaEnums {
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
