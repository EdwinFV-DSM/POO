package IMC;
import java.util.Scanner;

public class alumno {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            validacion eje = new validacion();
            String nombre;
            int edad;
            double calificacion;
            double peso;
            String talla;

            System.out.println("Ingrese su nombre");
            nombre=obj.next();
            System.out.println("Ingrese su edad");
            edad=obj.nextInt();
            System.out.println("Ingrese su calificacion");
            calificacion=obj.nextDouble();
            System.out.println("Ingrese su peso");
            peso=obj.nextInt();
            System.out.println("Ingrese su talla");
            talla=obj.next();
            validacion eje2 = new validacion(nombre, edad, calificacion, peso, talla);
            System.out.print("Tu edad es: "+eje.aumentaEdad(edad)+" años \n");
            System.out.print("Tu calificacion es: "+eje.obtenerCalificacion(calificacion)+"\n");
            System.out.print("Tu peso es: "+eje.obtenerIMC(peso)+"\n");
        }
    }
}
