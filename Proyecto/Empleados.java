package Proyecto;
import java.util.Scanner;

public class Empleados extends Persona {
    String Departamento;
    String turno;
    double sueldoBase=8;

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
    
    public double obtenerSueldo() {
        /* ht = horas trabajadas */
        int ht;
        int precio = 8;
        int msg;
        String turno = validarTurno();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce las horas trabajadas:");
            ht = sc.nextInt();
        }
        if (ht <= 8 && turno == "Matutino") {
            int res1,res3;
            res3 = ht - 10;
            res1 = res3 * precio;
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
        String matutino = "MATUTINO";
        String Vespertino = "VESPERTINO";

        if (turno.equalsIgnoreCase(matutino) || turno == "" || turno == " ") {
            turno = "Matutino";
            msg = turno;
        }else if (turno.equalsIgnoreCase(Vespertino) || turno == "Vespertino") {

            msg = turno;
        }
        turno = "Matutino";
         msg = turno;

    return msg;
    }
    @Override
    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+validarTurno()+"\n Tu salario es el siguiente: "+obtenerSueldo()+"\nTu departamento es: "+Departamento;
        return msg;
    }
    
}
