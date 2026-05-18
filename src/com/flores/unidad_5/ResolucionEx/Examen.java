package ResolucionEx;

import java.util.ArrayList;
import java.util.Arrays;

public class Examen {

    static ArrayList<Persona> lista = new ArrayList<>(Arrays.asList(
    new Persona("Ana García",     'F', 25),
    new Persona("Carlos López",   'M', 32),
    new Persona("María Martínez", 'F', 19),
    new Persona("Pedro Sánchez",  'M', 45),
    new Persona("Laura Torres",   'F', 28),
    new Persona("Juan Ramírez",   'M', 17),
    new Persona("Sofía Herrera",  'F', 38),
    new Persona("Luis Morales",   'M', 22)
));
    public int compareTo(Persona p1, Persona p2){
            if(p1.getEdad()>p2.getEdad()){
                return 1;
        }
        if(p1.getEdad()<p2.getEdad() ){
            return -1;
        }
        return 0;
    }
    public ArrayList<Persona> ordenarPersonas(){
        ArrayList<Persona> orden = new ArrayList<>();
        for(int i=0; i<=lista.size();i++){
            for(int j=i+1;j<=lista.size()-1; j++){
                if(compareTo(lista.get(i),lista.get(j))>0){
                    orden.add(lista.get(i));
                    break;
                }
                if(compareTo(lista.get(i),lista.get(j))<0){
                    orden.add(lista.get(j));
                    break;
                }
                if(compareTo(lista.get(i),lista.get(j))==0 ){
                    orden.add(lista.get(i));
                    orden.add(lista.get(j));
                    break;
                }
            }
        }
        return orden;
    }
}
