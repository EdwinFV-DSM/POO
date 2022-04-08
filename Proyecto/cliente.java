package Proyecto;
import java.io.*;
import java.util.Scanner;

public class cliente extends Persona {

    public cliente() {
    }

    public cliente(char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
    }
    
    public String generarComprar(){
        Scanner obj = new Scanner(System.in);
        String msg = "";
		String articulo;
		double metodo;
		double pago;
		double precio;
		double producto;
		String salir = "exit";
		double total;
		producto = 0;
		precio = 0;
		total = 0;
		
		

		do {

			System.out.println("Ingrese el nombre del producto");
			articulo = obj.nextLine();
			// System.out.println(precio);
			double precio2 = precio;
		System.out.println(precio2);
			System.out.println("Ingrese el precio del producto");
			precio = Double.parseDouble(obj.nextLine());
			producto = producto + 1;
			System.out.println("para salir del sistema digite exit");
			salir = obj.nextLine();
			precio2 = precio;
			total = precio + total;
			System.out.println(precio);
			

		} while (!salir.equalsIgnoreCase("exit"));
        System.out.println("Total de articulos comprados son: " + producto);
		System.out.println("El total a pagar es: " + total);
		System.out.println("¿Con cuanto pagara?");
		metodo = Double.parseDouble(obj.nextLine());
		pago = total - metodo;
		System.out.println("Su cambio es: " + pago);
		msg = "\nSu cambio es: " + pago;
        return msg;
	}
    
    @Override
    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos();
        return msg;
    }
}
