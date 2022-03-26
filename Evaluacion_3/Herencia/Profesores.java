package Evaluacion_3.Herencia;

public class Profesores extends Persona{
    String titulo;
    int cedula;
    public Profesores(){
        
    }
    
    public Profesores(String nombre, String fechaNac, String domicilio, String telefono, String titulo, int cedula) {
        super(nombre, fechaNac, domicilio, telefono);
        this.titulo = titulo;
        this.cedula = cedula;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override 
    public String mostrarDatos(){
        String msg = "";

        msg = super.mostrarDatos()+" eres "+titulo+" con cedula "+cedula;
        return msg;
    }
}


