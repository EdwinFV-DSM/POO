package Proyecto;

import java.io.*;
import java.util.Scanner;

public class cliente extends Persona {

	public cliente() {
	}

	public cliente(char sexo, String telefono, String fechaNac, String nombre) {
		super(sexo, telefono, fechaNac, nombre);
	}

	public double generarComprar() {
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
		double NumArti = 0;

		do {
			System.out.println("Ingrese el numero de productos a comprar");
			NumArti = obj.nextInt();
			System.out.println("Ingrese el nombre del producto");
			articulo = obj.nextLine();
			System.out.println("Ingrese el precio del producto");
			precio = Double.parseDouble(obj.nextLine());
			producto = producto + 1;
			double precio3 = precio * NumArti;
			total = precio3 + total;
			System.out.println(precio);

			System.out.println("Ingrese el nombre del producto");
			articulo = obj.nextLine();

		} while (!articulo.equalsIgnoreCase("exit"));
		System.out.println("Total de articulos comprados son: " + producto);
		System.out.println("El total a pagar es: " + total);
		System.out.println("¿Con cuanto pagara?");
		metodo = Double.parseDouble(obj.nextLine());
		pago = total - metodo;
		System.out.println("Su cambio es: " + pago);
		msg = "\nSu cambio es: " + pago;
		return total;
	}

	@Override
	public String mostrarDatos() {
		String msg = "";
		msg = super.mostrarDatos();
		return msg;
	}
}
