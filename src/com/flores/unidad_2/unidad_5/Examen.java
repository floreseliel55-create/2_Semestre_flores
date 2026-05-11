package com.flores.unidad_2.unidad_5;

import java.util.ArrayList;

public class Examen {
    public int compareTo(Persona p1, Persona p2){
            if(p1.getEdad()>p2.getEdad()){
                return 1;
        }
        if(p1.getEdad()<p2.getEdad() ){
            return -1;
        }
        if(p1.getEdad()==p2.getEdad())
        }
    public ArrayList<Persona> ordenarPersonas(){
        ArrayList<Persona> orden = new ArrayList<>();
        for(int i=0; i<lista.size();i++){
            for(int j=i+1;j<lista.size(); j++){
                if(lista.compareTo(lista[i],lista[j])>0){
                    orden.add(lista[i]);
                }
            }
        }
        return orden;
    }
}
