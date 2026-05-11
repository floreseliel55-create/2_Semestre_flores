package com.flores.Unidad_4.Tarea_5;

public class Cliente extends Persona{
    private String numeroCliente;
    private String direccion;
    public Cliente(String nombre, char sexo, int edad, String numeroCliente, String direccion) {
        super(nombre, sexo, edad);
        this.numeroCliente = numeroCliente;
        this.direccion = direccion;
    }
    
    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Cliente clone() {
        
        return (Cliente) super.clone();
    }
    public String toString(){
        return super.toString()+","+numeroCliente+","+direccion;
    }
}
