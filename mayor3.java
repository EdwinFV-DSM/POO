import java.util.Arrays;
import java.util.Scanner;

public class mayor3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        try (Scanner obj = new Scanner(System.in)) {
            mayor3 eje = new mayor3();
            System.out.println("Ingrese el valor 1");
            num1=obj.nextInt();
            System.out.println("Ingrese el valor 2");
            num2=obj.nextInt();
            System.out.println("Ingrese el valor 3");
            num3=obj.nextInt();
            System.out.print(eje.ordenMayor(num1,num2,num3));

        }   
    }

    public String ordenMayor(int num1, int num2, int num3){

        String msg;

        if(num1>num2) {
            if(num1>num3) {
                if(num2>num3) {
                    msg = "Orden Ascendente: " + num3 + " " + num2 + " " + num1);
                    System.out.println("Orden descendente: " + num1 + " " + num2 + " " + num3);                 
                }else {
                    System.out.println("Orden Ascendente: " + num1 + " " + num3 + " " + num2);
                    System.out.println("Orden descendente: " + num2 + " " + num3 + " " + num1);
                }
            }else {
                System.out.println("Orden Ascendente: " + num2 + " " + a + " " + c);
                System.out.println("Orden descendente: " + c + " " + a + " " + b);
            }
        }else {
            if(num2>num3) {
                if(num1>num3) {
                    System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
                    System.out.println("Orden descendente: " + b + " " + a + " " + c);
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }              
            }else {
                System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
                System.out.println("Orden descendente: " + c + " " + b + " " + a);
            }
        }
    }
    }
}
