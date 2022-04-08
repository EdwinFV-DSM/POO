package Proyecto;

import java.util.Scanner;

public class pisocajeros extends Empleados {
    String catego;

    public pisocajeros() {
    }

    
    public pisocajeros(char sexo, String telefono, String fechaNac, String nombre, String departamento, String turno,
            String catego) {
        super(sexo, telefono, fechaNac, nombre, departamento, turno);
        this.catego = catego;
    }


    public String getCatego() {
        return catego;
    }
    
    public void setCatego(String catego) {
        this.catego = catego;
    }

    public int obtenerSueldo() {
        int msg;
        if (catego == "" || catego == " ") {

            msg = 0;

        } else {
            int val = super.obtenerSueldo() ;
            msg = val * 10;
        }
        return msg;
    }

    @Override
    public String mostrarDatos() {
        String msg = "";
        msg = super.mostrarDatos() + "\nTu salario es el siguiente: " + obtenerSueldo() + "\nTe encuentras en: " + catego;
        return msg;
    }
}
