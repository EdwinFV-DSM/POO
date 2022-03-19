import java.io.*;
public class ejercicio3 {
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double metodo;
		double pago;
		double precio;
		double producto;
		String salir;
		double total;
		producto = 1;
		precio = 0;
		System.out.println("Ingrese el nombre del producto");
		System.out.println("Ingrese el precio del producto");
		precio = Double.parseDouble(bufEntrada.readLine());
		producto = producto+1;
		System.out.println("para salir del sistema digite exit");
		salir = bufEntrada.readLine();
		do {
			total = precio+precio;
			System.out.println("Total de articulos comprados son: "+producto);
			System.out.println("El total a pagar es: "+total+" y se le hara un descuent del 10%");
			total = total*10;
			total = total/100;
			System.out.println("El total a pagar con descuento es: "+total);
			System.out.println("�Con cuanto pagara?");
			metodo = Double.parseDouble(bufEntrada.readLine());
			pago = metodo-total;
			System.out.println("Su cambio es: "+pago);
		} while (salir != "exit");
	}
    
}
