package Proyecto;

public class index {
    public static void main(String[] args) {
        // Persona per = new Persona();
        // Persona per2 = new Persona('M', "7221090131","30/07/03","Edwin Flores");
        // System.out.println(per2.mostrarDatos());

        //Empleados
        //  Empleados EM = new Empleados('F', "7221090131","30/07/03","Johana","Recursos humanos","Vespertino");
        //  EM.validarTurno();
        //  System.out.println(EM.mostrarDatos());
        //pisocajeros8
        
        pisocajeros piso = new pisocajeros('F', "7221090131","30/07/03","Johana","piso");
        piso.obtenerSueldo();
        System.out.println(piso.mostrarDatos());
    }
}
