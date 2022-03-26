package Evaluacion_3.Herencia;

public class Persona {
    public String nombre;
    public String fechaNac;
    public String Domicilio;
    public String telefono;

    public Persona() {
    }

    public Persona(String nombre, String fechaNac, String domicilio, String telefono) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        Domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String mostrarDatos(){
        String msg = "";

        msg = "Te llamas "+nombre+"\n Naciste "+fechaNac+"\n Vives en "+Domicilio+"\n tu telefono es "+telefono;

        return msg;
    }
    
    
}
