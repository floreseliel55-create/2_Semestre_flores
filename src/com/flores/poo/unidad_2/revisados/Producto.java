package com.flores.poo.unidad_2;

public class Producto {
    private int clave;
    private String descripcion;
    private double precio;
    private int cantidad;

    Producto(int clave, String descripcion, double precio, int cantidad) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad=cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double calcularTotal(){
        return cantidad*precio;
    }    
    public double getPrecio() {
        return this.precio;
    }
    
    public int getClave() {
        return this.clave;
    }

    public String descripcion() {
        return this.descripcion;
    }

    public String toString() {
        return "Clave: " + clave + ", descripción: " + descripcion + ", precio: " + precio + ", cantidad: " + cantidad;
    }
    
    /*public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Leche de vaca");
        
        System.out.println(producto1);
        
        producto1.setPrecio(25);
        producto1.setCantidad(30);
        
        System.out.println(producto1);
    }
    */
} 
