package com.flores.unidad_2.No_Revisados.Tarea_6;

// Tarea no. 6 Sergio Eliel Flores Urquidy 
// Clase contacto que contiene los atributos
public class Contacto {
    private String nombre;
    private char sexo;
    private String alias;
    private String telefono;
    private String email;
    private int edad;
    public Contacto(String nombre, char sexo, String alias){
    this.nombre=nombre;
    this.sexo=sexo;
    this.alias=alias;
}
     public Contacto(String nombre, char sexo, String alias,String telefono, String email, int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.alias=alias;
        this.telefono=telefono;
        this.email=email;
        this.edad=edad;
    }
    //metodos para acceder a los atributos de la clase contacto
public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad(){
        return edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "("+nombre+"),"+"("+sexo+"),"+"("+alias+"),";
    }

}
