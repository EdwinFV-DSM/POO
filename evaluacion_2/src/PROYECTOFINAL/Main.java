/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class Main {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int opcion = 0;
        //    Persona p1=new Persona('M',"723255","06/04/2000","JUAN");
        //     System.out.println(p1.mostrarDatos()); 
        //   Clientes p2=new Clientes('F',"723255","06/04/2000","MARI ROSA");
//       p2.generarCompra();
        //   System.out.println(p2.mostrarDatos());
//       VIP p3=new VIP("50","06/04/2021",'M',"72325555","01/02/2000","JOSE "); 
        //       System.out.println(p3.generarCompra());
        //  p3.Sorteo();
        // System.out.println(p3.mostrarDatos());
        //   Ocasionales p4=new Ocasionales("06/04/2021",'M',"72325555","01/02/2000","MELO");
//       System.out.println(p4.generarCompra());
        //     System.out.println(p4.mostrarDatos());

        //     Empleados p5=new Empleados("PISO","vespertino",'M',"72325555","01/02/2000","PANCHO");
        //   System.out.println(p5.mostrarDatos());
        // System.out.println(p5.obtenerSueldo());
        //       pisoCajeros p6=new pisoCajeros("CAJERO","PISO","vespertino",'M',"72325555","01/02/2000","DANIREP");
        //     System.out.println(p6.mostrarDatos());
        //   System.out.println(p6.obtenerSueldo());
        //   Administrativos p7=new Administrativos("NEGOCIOS","JEFAZO","SEXO","vespertino",'M',"72325555","01/02/2000","AURONPLAY");
        // System.out.println(p7.mostrarDatos());
        // System.out.println(p7.obtenerSueldo());
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
                Clientes p2 = new Clientes('F', "723255", "06/04/2000", "MARI ROSA");
                p2.generarCompra();
                System.out.println(p2.mostrarDatos());
            }
            case 3 -> {
                VIP p3 = new VIP("50", "06/04/2021", 'M', "72325555", "01/02/2005", "JOSE ");
                System.out.println(p3.generarCompra());
                p3.Sorteo();
                System.out.println(p3.mostrarDatos());
            }
            case 4 -> {
                Ocasionales p4 = new Ocasionales("06/04/2021", 'M', "72325555", "01/02/2000", "MELO");
                System.out.println(p4.generarCompra());
                System.out.println(p4.mostrarDatos());
            }
            case 5 -> {

                Empleados p5 = new Empleados("PISO", "vespertino", 'M', "72325555", "01/02/2000", "PANCHO");
                System.out.println(p5.mostrarDatos());
                System.out.println(p5.obtenerSueldo());

            }
            case 6 -> {
                pisoCajeros p6 = new pisoCajeros("CAJERO", "PISO", "vespertino", 'M', "72325555", "01/02/2000", "DANIREP");
                System.out.println(p6.mostrarDatos());
                System.out.println(p6.obtenerSueldo());

            }
            case 7 -> {

                Administrativos p7 = new Administrativos("NEGOCIOS", "JEFAZO", "SALCHICHONERIA", "vespertino", 'M', "72325555", "01/02/2000", "AURONPLAY");
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
//p3.generarCompra();
       //System.out.println(p3.totalPagar);
