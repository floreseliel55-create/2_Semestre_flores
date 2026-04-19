package com.flores.Unidad_3.Tarea_3;
// clase abeja extiende de animal por lo que hereda sus atributos y metodos
public class Abeja extends Animal {
    // añade un atributo nombre
    private String nombre;
    // constructor que invoca al de la superclase y le da el nombre a la abeja
    // Y tambien inicializa el atributo nombre con el valor pasado como parametro
    public Abeja(String nombre){
        super("Abeja");
        this.nombre=nombre;
    }
    // metodo para obtener el nombre de la abeja
    public String getNombre(){
        return nombre;
    }
    // metodo para imprimir el sonido de la abeja
    public void printSonido(){
        System.out.println("Bzz bzz");
    }
    // metodo toString que sobreescribe el de la superclase y añade el nombre de la abeja al mensaje
    public String toString(){
        return super.toString()+", me llamo "+ nombre;
    }
    // y todos los demas animales hacen practicamente lo mismo pero con su sonido caracteristico y su especie correspondiente
}
