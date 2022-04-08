package evaluacion_2;

import java.io.*;

public class prueba {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
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
			articulo = bufEntrada.readLine();
			System.out.println(precio);
			double precio2 = precio;
		System.out.println(precio2);
			System.out.println("Ingrese el precio del producto");
			precio = Double.parseDouble(bufEntrada.readLine());
			producto = producto + 1;
			System.out.println("para salir del sistema digite exit");
			salir = bufEntrada.readLine();
			precio2 = precio;
			total = precio + total;
			System.out.println(precio);
			

		} while (!salir.equalsIgnoreCase("exit"));
			

		System.out.println("Total de articulos comprados son: " + producto);
		System.out.println("El total a pagar es: " + total);
		System.out.println("¿Con cuanto pagara?");
		metodo = Double.parseDouble(bufEntrada.readLine());
		pago = total - metodo;
		System.out.println("Su cambio es: " + pago);
	}

}
