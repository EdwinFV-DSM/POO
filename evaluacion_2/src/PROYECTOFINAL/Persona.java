/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;

/**
 *
 * @author PC1
 */
public class Persona {
    char sexo;
    String telefono;
    String fechaNac;
    String nombre;
public Persona (){
}
    public Persona(char sexo, String telefono, String fechaNac, String nombre) {
        this.sexo = sexo;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
public String mostrarDatos(){
    return "SEXO: "+sexo+" TELEFONO: "+telefono+" FECHA DE NACIMIENTO: "+fechaNac+" NOMBRE:"+nombre;
}    
    
    
    
}
