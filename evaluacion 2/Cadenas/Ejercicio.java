package evaluacion_2.Cadenas;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner caract = new Scanner(System.in);
        char letra;
        String Cadena;
        int valor;
        int sum = 0;

        System.out.println("Ingrese un texto");
        Cadena=caract.next();
        // String nombre= en.nextline;
        // char myChar = Cadena.charAt(0);
        char[] myChars = Cadena.toCharArray();
        for(int p = 0; p < myChars.length; p++){
            // System.out.println(valor=(int)nombre.charAt(i) );
            // suma+=(int)nombre.charAt(i);
            valor=(int)myChars[p];
            // System.out.println(valor);
            // int sum = 0;
            // System.out.println(sum);
            // System.out.println(myChars[p]);
            // System.out.println(Cadena.charAt(p));
            // contar=contar+1;
            System.out.println("La cadena es "+myChars[p]+" Su valor es de "+valor);
            sum = sum+valor;
            // System.out.println("La suma de todos los valores es: "+sum);
        }
        System.out.println(sum);
    }
}
