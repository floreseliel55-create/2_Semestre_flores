package com.flores.Unidad_4.Tarea_4;

public class UsaColoresEquals {
    public static void main(String[] args){
        Point p0= new Point();
        Point p1 = new Point(1,3);
        Persona p = new Persona("Mario", 18);
        ColorPoint cp = new ColorPoint();
        ColorPoint cp2= new ColorPoint();

        // Explicar que pasa con cada una de las siguientes instrucciones

        // se ejecuta el equals de punto por medio del instanceof se da cuenta que no son iguales devuelve false
        System.out.println(p1.equals(p));;
        // se ejecuta el equals de punto el instanceof se da cuenta que son del mismo tipo luego se comparan y devuelve false pq no tienen las mismas coordenadas
        System.out.println(p0.equals(p1));
        // se ejecuta el equals de punto, el instanceof ve que es una subclase y le da chance de pasar luego lo castea y compara las coordenadas y devuelve true
        System.out.println(p0.equals(cp));
        // ejecuta el equals de ColorPoint, el instanceof se da cuenta que son compatibles luego los castea
        // compara con el equals de Point porque se esta invocando, lo pasa y despues compara el color y devuelve false
        System.out.println(cp.equals(p0));
        // Se ejecuta el equals de ColorPoint, el instanceof se da cuenta que son compatibles, los castea y compara con el equals de Point, lo pasa y despues compara el color y devuelve true
        System.out.println(cp.equals(cp2));
    }
}
