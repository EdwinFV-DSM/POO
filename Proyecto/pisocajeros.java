package Proyecto;

import java.util.Scanner;

public class pisocajeros extends Empleados {
    String catego;
    double aumento, sueldoFinal;

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

    public String validarCategoria() {
        String msg;
        if (catego.equalsIgnoreCase("piso")) {
            return catego.toUpperCase();
        } else if (catego.equalsIgnoreCase("cajero")) {
            return catego.toUpperCase();
        }
        msg = "ERROR INTRODUZCA UNA CATEGORIA VALIDA";
        return msg;
    }

    @Override
    public double obtenerSueldo() {
        if (validarTurno().equalsIgnoreCase("matutino")) {
            if (catego.equalsIgnoreCase("cajero")) {
                int horas = 8;
                sueldoBase = horas * sueldoBase;
                System.out.println("SUELDO BASE: $" + sueldoBase);
                aumento = sueldoBase * .10;
                System.out.println("AUMENTO: $" + aumento);
                sueldoFinal = sueldoBase + aumento;
                System.out.print("SUELDO FINAL: $");
                return sueldoFinal;
            } else if (catego.equalsIgnoreCase("piso")) {
                int horas = 8;
                sueldoBase = horas * sueldoBase;
                System.out.println("SUELDO BASE: $" + sueldoBase);
                aumento = sueldoBase * .15;
                System.out.println("AUMENTO: $" + aumento);
                sueldoFinal = sueldoBase + aumento;
                System.out.print("SUELDO FINAL: $");
                return sueldoFinal;
            } else if (catego.equals("piso") == false || catego.equals("cajero") == false) {
                System.out.println("CATEGORIA INVALIDA INGRESE ");
            }

        } else

        if (validarTurno().equalsIgnoreCase("vespertino")) {
            if (catego.equalsIgnoreCase("cajero")) {
                int horas = 10;
                sueldoBase = horas * sueldoBase;
                System.out.println("SUELDO BASE: $" + sueldoBase);
                aumento = sueldoBase * .10;
                System.out.println("AUMENTO: $" + aumento);
                sueldoFinal = sueldoBase + aumento;
                System.out.print("SUELDO FINAL: $");
                return sueldoFinal;
            } else if (catego.equalsIgnoreCase("piso")) {
                int horas = 10;
                sueldoBase = horas * sueldoBase;
                System.out.println("SUELDO BASE: $" + sueldoBase);
                aumento = sueldoBase * .15;
                System.out.println("AUMENTO: $" + aumento);
                sueldoFinal = sueldoBase + aumento;
                System.out.print("SUELDO FINAL: $");
                return sueldoFinal;
            } else if (catego.equals("piso") == false || catego.equals("cajero") == false) {
                System.out.println("CATEGORIA INVALIDA INGRESE PISO O CAJERO");
            }

        }

        return 0.0;
    }

    @Override
    public String mostrarDatos() {
        String msg = "";
        msg = super.mostrarDatos() + "\nTu salario es el siguiente: " + obtenerSueldo() + "\nTe encuentras en: "
                + catego;
        return msg;
    }
}
