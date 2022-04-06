package Proyecto;

public class Empleados extends Persona {
    String Departamento;
    String turno;

    public Empleados() {
    }

    public Empleados(char sexo, String telefono, String fechaNac, String nombre, String departamento, String turno) {
        super(sexo, telefono, fechaNac, nombre);
        Departamento = departamento;
        this.turno = turno;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String obtenerSueldo(){

    }   
    
    public String validarTurno(){
        String msg = "";

        if (turno == "") {
            msg = this.turno = "matutino";
        }else{
            msg ="Tu turno es: "+turno;
        }

        return msg;
    }

    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\nTu sueldo es: "+obtenerSueldo()+"\nTu departamento es: "+Departamento;
        return msg;
    }
    
}
