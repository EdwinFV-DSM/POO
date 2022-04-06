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
        String msg = "";
        int ht = 0;
        int precio = 0;

        if (ht <= 30) {
            int res1;
            res1= ht * precio;
            msg = "Tu nombre es: "+nombre+"\n Tu salario es el siguiente: "+res1;
        }else if (ht >= 31 && ht < 40){
            int res2,res4;
            res2 = ht - 30;
            ht = ht - res2;
            int valor = res2*precio;
            msg = "Tu nombre es: "+nombre+"\n Tu salario es el siguiente con horas extras: "+res2*2;
        }else if(ht >= 40){
            int res3,res4;
            
            res3 = ht - 40;
            ht = ht - res3;
            int valor = res3*precio;
            msg = "Tu nombre es: "+nombre+"\n Tu salario es el siguiente con horas extras: "+valor*3;
        }else{
            msg = "No has cumplido con las horas trabajadas solicitadas";
        }
        return msg;
    }   
    
    public String validarTurno(){
        String msg = "";

        if (turno == "" || turno == " ") {
            turno = "Matutino";
            msg = turno;
        }else{
            msg ="Tu turno es: "+turno;
        }

        return msg;
    }
    @Override
    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\nTu sueldo es: "+obtenerSueldo()+"\nTu departamento es: "+Departamento;
        return msg;
    }
    
}
