package evaluacion_2;
import java.util.Scanner;

public class ejercicio2 {
    /**
     * Ejercicio 2
     * Pedir dos numero y decir cual es el mayor, y cual es el menor
     * repetirlo hasta que los numeros introducidos sean iguales
     */
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int val1, val2;

            System.out.println("ingrese 2 valores");
            val1 = obj.nextInt();
            val2 = obj.nextInt();

            if (val1 > val2) {
                System.out.println(val1 + " es mayor a " + val2);
            } else if (val2 < val1) {
                System.out.println(val2 + " es menor a " + val1);
            } else {
                System.out.println("Los valores ingresados son iguales");
            }
        }
    }
}