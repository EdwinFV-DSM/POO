package Evaluacion_3.Practica;

public class index {
    public static void main(String[] args) {
        cuadrado c1 = new cuadrado("Cuadrado", "123",0);
        figuras c2 = new cuadrado("Cuadrado", "123",0);
        figuras c3 = new circulo("Circulo", "123",0);
        figuras c4 = new rectangulo("Rectangulo", "123",0,4);

        System.out.println(c1.obtenerDatos());
        System.out.println(c2.obtenerDatos());
        System.out.println(c3.obtenerDatos());
        System.out.println(c4.obtenerDatos());

    }
}
