package Evaluacion_3.Herencia;

public class Estudiante extends Persona{
    public String matricula;
    public double promedio;
    public Estudiante() {
    }
    
    public Estudiante(String nombre, String fechaNac, String domicilio, String telefono, String matricula,
            double promedio) {
        super(nombre, fechaNac, domicilio, telefono);
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getMaricula() {
        return matricula;
    }
    public void setMaricula(String maricula) {
        this.matricula = maricula;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override public String mostrarDatos(){
        String msg = "";

        msg = super.mostrarDatos()+" tu matricula es "+matricula+" con cedula "+promedio;
        return msg;

    }

    public String Calificacion(double promedio){
        String msg ="";
        
        while (promedio >= 0 || promedio <= 10) {
            if (promedio < 8) {
                msg = "Aprobado";
            }else if(promedio > 10){
                msg = "Reprobado";
            }

        }
        return msg;
    }
}
