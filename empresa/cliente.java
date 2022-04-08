package empresa;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {
        try (Scanner op = new Scanner(System.in)) {
            String nombre;
            int horas;

                    System.out.println("Ingrese el nombre");
                    nombre=op.next();
                    System.out.println("Ingrese las horas trabajadas");
                    horas=op.nextInt();
                    // System.out.println("Ingrese el salario");
                    // sala=op.nextInt();
                    salario es2 = new salario(nombre,horas,100);
                    System.out.println(es2.salarioPagado());
        }
    }
    
}
