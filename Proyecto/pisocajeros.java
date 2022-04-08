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
        int ht;
        int msg;
        try (Scanner sc2 = new Scanner(System.in)) {
            System.out.println("Introduce las horas trabajadas:");
            ht = sc2.nextInt();
        }
        if (catego == "piso" && ht <= 8) {
            int res1 = super.obtenerSueldo();
            res1 = ht * 8;
            res1 = res1 * 10;
            msg = res1;

        } else {
            msg = 0;
        }
        return msg;
    }

    @Override
    public String mostrarDatos() {
        String msg = "";
        msg = super.mostrarDatos() + "\nTu salario es el siguiente: " + obtenerSueldo() + "\nTu departamento es: " + catego;
        return msg;
    }
}
