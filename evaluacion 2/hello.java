/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        /**ejemplo
         * Imprimir los numeros del 1 al 100 pero solo
         * imprimir aquellos que son multiplos de 5 y 6
         * contarlos y sumarlos
         */

         for (int i = 1; i < 1001; i++) {
             if (i % 5 == 0 && i % 6==0) {
                 System.out.println(i);
             }
         }
    }
}