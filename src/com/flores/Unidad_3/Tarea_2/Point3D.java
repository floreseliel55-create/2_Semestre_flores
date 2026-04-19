package com.flores.Unidad_3.Tarea_2;

// Clase que deriva de Point y le añade una nueva dimension z
public class Point3D extends Point {
    protected int z;
    // Constructor necesario para inicializar z, además de x e y que se heredan de Point
    Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
        totalPuntos++;
    }
    Point3D(int z){
        this.z=z;
        totalPuntos++;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public String toString(){
        return super.toString()+" z = "+z;
    }
    // Lo mismo pero añade la coordenada z para sacar el punto medio entre dos puntos 3D
    public Point3D medio(Point3D p){
        return new Point3D((p.x+x)/2,(p.y+y)/2,(p.z+z)/2);
    }
    
}
