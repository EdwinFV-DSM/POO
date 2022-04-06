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
 		producto = 1;
 		precio = 0;
 		do {
 			System.out.println("Ingrese el nombre del producto");
 			articulo = bufEntrada.readLine();
 			System.out.println("Ingrese el precio del producto");
 			precio = Double.parseDouble(bufEntrada.readLine());
 			producto = producto+1;
 			System.out.println("para salir del sistema digite exit");
 			salir = bufEntrada.readLine();
 		} while (!salir.equalsIgnoreCase("exit"));
 		total = precio+precio;
 		System.out.println("Total de articulos comprados son: "+producto);
 		System.out.println("El total a pagar es: "+total+" y se le hara un descuent del 10%");
 		total = total*10;
 		total = total/100;
 		System.out.println("El total a pagar con descuento es: "+total);
 		System.out.println("¿Con cuanto pagara?");
 		metodo = Double.parseDouble(bufEntrada.readLine());
 		pago = total-metodo;
 		System.out.println("Su cambio es: "+pago);
 	}

 }
