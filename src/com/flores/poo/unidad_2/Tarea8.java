package com.flores.poo.unidad_2;

// TAREA 8 DE LOS EJEMPLOS CON ENUM
public class Tarea8 {

    private Enums.Color color;
    private Enums.Estado estado;

    Tarea8(Enums.Color color){
        this.color=color;
    }
    Tarea8(Enums.Estado estado){
        this.estado=estado;
    }
    
    public Enums.Color getColor(){
        return color;
    }
    public Enums.Estado getEstado(){
        return estado;
    }
    public String toString(){
        return "El Estado es:"+estado + " y el color es: "+color;
    }
    public static void main(String[] args) {

        Tarea8 color = new Tarea8(Enums.Color.BLUE);
        Tarea8 estado = new Tarea8(Enums.Estado.VIVO);

        

    }
}
