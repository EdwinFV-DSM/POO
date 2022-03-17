import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        /**
         * Pedir numeros hasta que se digite un 0
         * contar positivos, negativos,suma de positivos,
         * suma negativos
         */
        /**
         * Declarar variables
         */

        int num;
        try (Scanner ej = new Scanner(System.in)) {
            do {
                System.out.println("Digite un numero");
                num=ej.nextInt();
            } while (num != 0);
        } 

    }
    
}
