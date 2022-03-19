package Evaluacion_3;
import java.util.Scanner;

public class ejmploMetodos {
    public static void main(String[] args) {
        /**
         * 1.-Pedir una oracion, laque sea, contar cuantas palabras tiene, descubrir la palabra mas larga, separar
         * la cadena en 4 partes iguales 
         * 
         * 
         * 2.-pedir la fecha de nacimiento de una persona en un formato de dd/mm/aaaa
         * 3.-Crear un metodo que me devuelva el nombre del mes asi como realizar la suma de las 3 fechas, dd+mm+aaaa
         */
        Scanner obj = new Scanner (System.in);
        ejmploMetodos eje = new ejmploMetodos();
        String oracion, fecha;
        int suma,d=0,m=0,a=0;

        // System.out.println("Escribe una oracion");
        // oracion=obj.nextLine();
        System.out.println("Escribe tu fecha de nacimiento en el formato dd/mm/aaaa");
        d=obj.nextInt();
        m=obj.nextInt();
        a=obj.nextInt();
        System.out.print(eje.obtenerFecha(d,m,a));

    }

    public String obtenerFecha(int d, int m ,int a){
        String msg = "";
        double suma = 0;
        switch (m) {
            case 1:
                msg = "Enero";
            break;
            case 2:
                msg = "Febrero";
            break;
            case 3:
                msg = "Marzo";
            break;
            case 4:
                msg = "Abril";
            break;
            case 5:
                msg = "Mayo";
            break;
            case 6:
                msg = "Junio";
            break;
            case 7:
                msg = "Julio";
            break;
            case 8:
                msg = "Agosto";
            break;
            case 9:
                msg = "Septiembre";
            break;
            case 10:
                msg = "Octubre";
            break;
            case 11:
                msg = "Noviembre";
            break;
            case 12:
                msg = "Diciembre";
            break;

            default:
                msg = "El mes ingresado es invalido";
                break;
        }
        suma=d+m+a;
        

        return msg+"\n La suma de la fecha es "+suma;
    }
}
