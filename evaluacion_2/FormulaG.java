package evaluacion_2;
import java.util.Scanner;

public class FormulaG {
    public static void main(String[] args) {
        int num1, num2, num3;
        try (Scanner obj = new Scanner(System.in)) {
            FormulaG eje = new FormulaG();
            System.out.println("Ingrese el valor de b");
            num1=obj.nextInt();
            System.out.println("Ingrese el valor de a");
            num2=obj.nextInt();
            System.out.println("Ingrese el valor de c");
            num3=obj.nextInt();
            System.out.print(eje.formula(num1,num2,num3));
        }
    }

    String formula (int b, int a, int c){
        double d = 0;
        double x1 = 0, x2 = 0;
        d = Math.pow(b,2) - 4*a*c;
        if (d < 0) {
            System.out.println("El proble no se puede resolver");
        }else{
            x1 = (-b + Math.sqrt(d)) / 2+a;
            x2 = (-b - Math.sqrt(d)) / 2+a;
            
        }
        return "El valor de x1 es: "+x1+" y el valor de x2: "+x2;
    }

}
