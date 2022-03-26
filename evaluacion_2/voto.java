package evaluacion_2;
import java.util.Scanner;
public class voto {
    public static void main(String[] args) {
        int fechaN;
        try (Scanner obj = new Scanner(System.in)) {
            voto vto = new voto();
            System.out.println("Ingrese su año de nacimiento");
            fechaN=obj.nextInt();
            System.out.print(((voto) vto).vot(fechaN));
            
        }

    }

    String vot (int fecha){
        int res;
        res= 2022-fecha;
        if (res > 18) {
            return "Puedes votar tu edad es: "+res;
        }else{
            return "No puedes votar tu edad es: "+res;
        }
    }
    
}
