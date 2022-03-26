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
    public Double setPromedio(double promedio) {
        return this.promedio = promedio;
    }
    
    @Override public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+" tu matricula es "+matricula+" con promedio "+promedio+" la nota es: "+Calificacion();
        return msg;

    }

    public String Calificacion(){
        String msg ="";
        
        if (promedio >= 0 && promedio <= 10) {
            if (promedio < 8) {
                msg = "Reprobado";
            }else if (promedio >= 8 ){
                msg = "Aprobado";
            }
        }else{
            msg = "Reprobado";
            promedio = 0;
        }
        return msg;
    }
}
