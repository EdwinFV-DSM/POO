package evaluacion_2;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        
        try (Scanner obj = new Scanner(System.in)) {
            area eje = new area();
            int lado1, lado2;
            System.out.println("Ingrese la base de un rectangulo");
            lado1=obj.nextInt();
            System.out.println("Ingrese la altura de un rectangulo");
            lado2=obj.nextInt();
            System.out.print(((area) eje).area2(lado1, lado2));
            System.out.print(((area) eje).perimetro(lado1, lado2));
            System.out.println("el area es "+ eje.area2(lado1, lado2));
        }
    }
    int area2 (int n1, int n2){
        int res;
        res = n1*n2;
        res= res/2;
        return res;
    }
    int perimetro (int n1, int n2){
        int res;
        res = n1*n1*n2*n2;
        return res;
    }
}
