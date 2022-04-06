package Proyecto;

import java.util.Scanner;

public class pisocajeros extends Persona {
    String catego;

    public pisocajeros() {
    }

    public pisocajeros(char sexo, String telefono, String fechaNac, String nombre, String catego) {
        super(sexo, telefono, fechaNac, nombre);
        this.catego = catego;
    }

    public String getCatego() {
        return catego;
    }
    
    public void setCatego(String catego) {
        this.catego = catego;
    }

    public String obtenerSueldo() {
        int ht;
        String msg = "";
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce las horas trabajadas:");
            ht = sc.nextInt();
        }
        if (catego == "piso" && ht <= 8) {
            int res1;
            res1 = ht * 8;
            res1 = res1 * 10;
            msg = "" + res1;

        } else {
            msg = "El area ingresada no se encuentra";
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
