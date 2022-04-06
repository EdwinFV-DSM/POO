package Proyecto;

public class Persona {
    char sexo;
    String telefono;
    String fechaNac;
    String nombre;
    
    public Persona() {
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
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mostrarDatos(){
        String msg = "";

        msg = "Tu sexo es: "+sexo+"\nTu nombre es: "+nombre+"\nTu fecha de nacimiento es: "+fechaNac+"\nTu telefono es: "+telefono;
        return msg;
    }
    
}
