package evaluacion_2;
import java.util.Scanner;

public class examen{
    public static void main(String[] args) {
        int num1;
        try (Scanner obj = new Scanner(System.in)) {
            examen eje = new examen();
            System.out.println("Ingrese un valor");
            num1=obj.nextInt();
            System.out.print(eje.factorial(num1));
        } 
}
public double factorial (double numero) {
    if (numero==0){
        return 1;
    }
    else{
        return numero * factorial(numero-1);
    }
    }
    
}


