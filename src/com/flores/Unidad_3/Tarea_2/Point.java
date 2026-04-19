package com.flores.Unidad_3.Tarea_2;
// Point es la clase padre de las que derivan Point3D y ColorPoint

public class Point {
    protected int x;
    protected int y;
    public static int totalPuntos=0;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        totalPuntos++;
        // Se pone totalPuntos++ para que cada vez que se cree un nuevo punto, se incremente.
    }
    public Point(){
        // Si no se le pasan parámetros, se inicializan en 0
    }
    public int getX() {
        return x;
        
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    // Este metodo saca un nuevo punto con las coordenadas del medio entre el punto actual y el punto que se le pasa como parámetro
    public Point medio (Point p){
        return new Point((p.x+x)/2,(p.y+y)/2);
    }
    // Representación en String del punto, para que al imprimirlo se vea como (x,y)
    public String toString(){
        return "("+x+","+y+")";
    }
}
