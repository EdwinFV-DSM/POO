package Proyecto;

public class Administrativo extends Empleados {
    String carrera;
    String puesto;

    public Administrativo() {
    }

    public Administrativo(char sexo, String telefono, String fechaNac, String nombre, String departamento, String turno,
            String carrera, String puesto) {
        super(sexo, telefono, fechaNac, nombre, departamento, turno);
        this.carrera = carrera;
        this.puesto = puesto;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public double obtenerSueldo() {

        double aumento, sueldoFinal;
        if (validarTurno().equalsIgnoreCase("matutino")) {
            int horas = 8;
            sueldoBase = 150;
            sueldoBase = horas * sueldoBase;
            System.out.println("SUELDO BASE: $" + sueldoBase);
            aumento = sueldoBase * .20;
            System.out.println("AUMENTO: $" + aumento);
            sueldoFinal = sueldoBase + aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;

        } else if (validarTurno().equalsIgnoreCase("vespertino")) {

            int horas = 10;
            sueldoBase = 150;
            sueldoBase = horas * sueldoBase;
            System.out.println("SUELDO BASE: $" + sueldoBase);
            aumento = sueldoBase * .20;
            System.out.println("AUMENTO: $" + aumento);
            sueldoFinal = sueldoBase + aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;

        }
        return 0;

    }

    @Override
    public String mostrarDatos() {
        String msg = "";
        msg = super.mostrarDatos() + "\nTu turno es: " + turno + "\nTu sueldo es: " + obtenerSueldo()
                + "\nTu departamento es: " + Departamento+ "\n Tu carrera es: "+carrera;
        return msg;
    }
}
