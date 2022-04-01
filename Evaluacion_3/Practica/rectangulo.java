package Evaluacion_3.Practica;

public class rectangulo extends figuras {
    int altura;
    
    public rectangulo(String nombre, String color, int base, int altura) {
        super(nombre, color, base);
        this.altura = altura;
    }

    
    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public String obtenerArea(){
        double area = base * altura;
        return "El area es: "+area;
    }
    @Override
    public String obtenerPerimetro(){
        double h = Math.sqrt(base ^ 2 + altura ^ 2);

        return "La hipotenusa: "+h;
    }
    @Override
    public String obtenerDatos(){
        String msg = super.obtenerDatos()+"\n"+obtenerArea()+"\n"+obtenerPerimetro();
        return msg;
    }
}
