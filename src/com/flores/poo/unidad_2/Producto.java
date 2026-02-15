package com.flores.poo.unidad_2;

public class Producto {
    private int clave;
    private String descripcion;
    private double precio;
    private int cantidad;

    Producto(int clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
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
    
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Leche de vaca");
        
        System.out.println(producto1);
        
        producto1.setPrecio(25);
        producto1.setCantidad(30);
        
        System.out.println(producto1);
    }
} 
