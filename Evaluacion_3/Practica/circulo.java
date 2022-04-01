package Evaluacion_3.Practica;

public class circulo extends figuras{

    public circulo(String nombre, String color, int base) {
        super(nombre, color, base);
    }

    public circulo() {
    }
    @Override
    public String obtenerArea(){
        double res = Math.PI*(Math.pow(super.base,2));
        return "\n"+res;
    }

    public String obtenerPerimetro(){
        double res = 2*Math.PI*(super.base);
        return "\n"+res;
    }

    @Override
    public String obtenerDatos(){
        String msg = super.obtenerDatos()+obtenerArea()+obtenerPerimetro();
        return msg;

    }
    
}
