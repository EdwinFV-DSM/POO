package Cadenas;
import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
        Scanner caract = new Scanner(System.in);
        char letra;
        String Cadena;

        System.out.println("Ingrese un texto");
        Cadena=caract.nextLine();
        char[] myChars = Cadena.toCharArray();
        for(int p = 0; p < myChars.length; p++){
            letra = myChars[p];
            System.out.print(letra);
        }
        System.out.println("\n");
        for(int i = myChars.length-1; i>=0; i--){
            letra = myChars[i];
            System.out.print(letra);
        }
    }
}
