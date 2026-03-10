package com.flores.poo.unidad_2.No_Revisados.Tarea_6;

import java.util.ArrayList;

public class ListadoContactos {
    // Tarea no. 6 Sergio Eliel Flores Urquidy
    // Se crea un metodo para obtener un listado de mujeres a partir de un ArrayList de contactos
    public ArrayList<Contacto> listadoMujeres(ArrayList<Contacto> contactos){
        
        ArrayList<Contacto> mujeres = new ArrayList<>();
        // Recorre todo el ArrayList
        for(int i=0; i<contactos.size(); i++){
            // Si el sexo es F se agrega a la lista de mujeres
            if(contactos.get(i).getSexo()=='F'){
                // Se añade el contacto a la lista de mujeres
                mujeres.add(contactos.get(i));

            }

        }
        // Regresa el ArrayList de mujeres
        return mujeres;
    }
    // Se crea un metodo para sacar la edad promedio
    public double edadPromedio(ArrayList<Contacto> contactos){
        // Variable para almacenar la suma de las edades
        int sumaEdades=0;

        // Recorre todo el ArrayList y va sumando las edades de cada contacto
        for(int i=0; i<contactos.size(); i++){
            sumaEdades=contactos.get(i).getEdad()+sumaEdades;
        }
        // Retorna un double con la edad promedio
        return (double) sumaEdades/contactos.size();
    }
    // Metodo que regresa un ArrayList con los contactos cuyo nombre empieza con A
    public ArrayList<Contacto> nombresConA(ArrayList<Contacto> contactos){
        ArrayList<Contacto> nombresA = new ArrayList<>();

        for(int i=0; i<contactos.size(); i++){
            // Verifica si el nombre de contacto posicion i empieza con A
            if(contactos.get(i).getNombre().charAt(0)=='A'){
                // Si cumple entonces se añade al ArrayList de nombresA
                nombresA.add(contactos.get(i));
            }
        }

        return nombresA;

    }

        
    }

