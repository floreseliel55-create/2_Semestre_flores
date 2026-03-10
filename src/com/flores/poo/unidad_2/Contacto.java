package com.flores.poo.unidad_2;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "("+nombre+","+"("+sexo+","+"("+alias+","+"("+telefono+","+"("+email+")"+"("+edad+")";
    }

}
