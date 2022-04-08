package evaluacion_2;
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        /**
         * Ejercicio
         * nombre del articulo
         * precio
         * repitiendo hasta que se digite la palabra exit
         * contar cuantos productos
         * se esta llevando en total
         * al finalizar, realizar el total a pagar, a este pago se le va a generar un
         * descuento del 10%
         * preguntar con cuanto va a pagar el cliente y devolverle la cantidad de
         * cambio.
         */
        String articulo = "";
        System.out.println(articulo);
        int precio = 0, pago, metodo, total, producto = 1;
        String salir = "exit";
        try (Scanner obj = new Scanner(System.in)) {

            System.out.println("ingrese el nombre del producto");
            articulo = obj.next();
            System.out.println("ingrese el precio del producto");
            precio = obj.nextInt();
            producto++;
            System.out.println("Para salir del sistema solamente digite | exit");
            salir = obj.next();
            while (salir == "e") {
                total = precio + precio;
                System.out.println("Total de productos comprados son: " + producto);
                System.err.println("El total a pagar es: $" + total);
                System.err.println("¿Con cuanto pagara?");
                metodo = obj.nextInt();
                pago = metodo - total;
                System.err.println("Su cambio es: $" + pago);
            }

            // 200 ---- 100%
            // X---------10%

        }

    }

}
