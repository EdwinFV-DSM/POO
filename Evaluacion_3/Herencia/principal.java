package Evaluacion_3.Herencia;

public class principal {

    public static void main(String[] args) {
        //Persona p1 = new Persona();
        //Persona p2 = new Persona("David","30/06/2003","Metepec", "7221090131");
        //System.out.println(p2.mostrarDatos());

        Profesores P1 = new Profesores();
        Profesores P2 = new Profesores("Apolinar","12/12/1980", "UTVT", "55550000" ,"IC", 1234); 
        System.out.println(P2.mostrarDatos());

        Estudiante E1 = new Estudiante();
        Estudiante E2 = new Estudiante("Apolinar","12/12/1980", "UTVT", "55550000" ,"IC", 1234); 
        System.out.println(P2.mostrarDatos());
    }

}
