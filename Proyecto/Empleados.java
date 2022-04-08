package Proyecto;
import java.util.Scanner;

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

    public int obtenerSueldo() {
        /* ht = horas trabajadas */
        int ht = 0;
        int precio = 8;
        int msg;
        String turno = validarTurno();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce las horas trabajadas:");
            ht = sc.nextInt();
        }
        if (ht <= 8 && turno == "Matutino") {
            int res1;
            res1 = ht * precio;
            msg = res1;

        } else if (ht <= 10 && turno == "Vespertino") {
            int res2;
            /**
             * 8 <=10
             * 8-10
             */
            res2 = ht - 10;
            int valor = res2 * precio;
            msg = valor;
        } else {
            msg = 0 ;
        }
        return msg;
    }

    public String validarTurno(){
        String msg = "";

        if (turno == "" || turno == " ") {
            turno = "Matutino";
            msg = turno;
        }else{
            msg = turno;
        }

        return msg;
    }
    @Override
    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\n Tu salario es el siguiente: "+obtenerSueldo()+"\nTu departamento es: "+Departamento;
        return msg;
    }
    
}
