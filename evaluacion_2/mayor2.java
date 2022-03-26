/**
 * mayor2
 */
package evaluacion_2;
import java.util.Scanner;
public class mayor2 {

    public static void main(String[] args) {
        int num1, num2;
        try (Scanner obj = new Scanner(System.in)) {
            mayor2 eje = new mayor2();
            System.out.println("Ingrese 2 valores distintos");
            num1=obj.nextInt();
            num2=obj.nextInt();
            System.out.print("El mayor es "+eje.mayor(num1,num2));
        }
    }
    int mayor (int n1, int n2){
        if (n1 > n2) {
            return n1;
        }else{
            return n2;
        }
    }
}