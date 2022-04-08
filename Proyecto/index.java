package Proyecto;
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
    
Scanner en = new Scanner(System.in);
    int opcion = 0;
do{
        System.out.println("Escoga una opcion");
        System.out.println("1.-PERSONA");
        System.out.println("2.-CLIENTE");
        System.out.println("3.-VIP");
        System.out.println("4.-OCASIONAL");
        System.out.println("5.-EMPLEADO");
        System.out.println("6.-PISO O CAJEROS");
        System.out.println("7.-ADMINISTRATIVO");
        System.out.println("8.- salir");
        opcion = en.nextInt();

        switch (opcion) {

            case 1 -> {

                Persona p1 = new Persona('M', "723255", "06/04/2000", "JUAN");
                System.out.println(p1.mostrarDatos());

            }
            case 2 -> {
                cliente p2 = new cliente('F', "723255", "06/04/2000", "MARI ROSA");
                p2.generarComprar();
                System.out.println(p2.mostrarDatos());
            }
            case 3 -> {
                VIP p3 = new VIP('M',"7221090131","30/06/31","Edwin Flores","12345","20/09/2022");
                System.out.println(p3.mostrarDatos());
            }
            case 4 -> {
                ocasionales p3 = new ocasionales('M',"7221090131","30/06/31","Edwin Flores","12345","20/09/2022");
                System.out.println(p3.mostrarDatos());
            }
            case 5 -> {

                Empleados p5 = new Empleados();
                Empleados p3 = new Empleados('M',"7221090131","30/06/31","Edwin Flores","12345","20/09/2022");
                System.out.println(p5.mostrarDatos());
                System.out.println(p5.obtenerSueldo());

            }
            case 6 -> {
                pisocajeros p6 = new pisocajeros('F',"7221090131","30/06/31","Edwin Flores","01/02/2000", "piso","cajero");
                System.out.println(p6.mostrarDatos());
                System.out.println(p6.obtenerSueldo());

            }
            case 7 -> {

                Administrativo p7 = new Administrativo('M', "JEFAZO", "SALCHICHONERIA", "vespertino", "NEGOCIOS", "72325555", "01/02/2000", "AURONPLAY");
                System.out.println(p7.mostrarDatos());
                System.out.println(p7.obtenerSueldo());

            }

            default -> {
                System.out.println("Opcion incorrecta");
            }

        }

    }while(opcion<=7);
}
}
