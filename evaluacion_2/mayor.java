/**
 * mayor
 */
package evaluacion_2;
import java.util.Scanner;
public class mayor {

    public static void main(String[] args) {
        int num1, num2;
        try (Scanner obj = new Scanner(System.in)) {
            mayor eje = new mayor();
            System.out.println("Ingrese 2 valores distintos");
            num1=obj.nextInt();
            num2=obj.nextInt();
            System.out.print(eje.mayo(num1,num2));
        }
    }

    String mayo (int n1, int n2){
        if (n1 > n2) {
            return "El mayo es: "+n1+"y es menor: "+n2;
        }else if(n2 < n1){
            return "El mayor es: "+n2+"y es menor: "+n1;
        }else{
            return "Los numeros ingresados son iguales";
        }
    }
}