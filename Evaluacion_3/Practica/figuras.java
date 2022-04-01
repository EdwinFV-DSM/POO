package Evaluacion_3.Practica;

public class figuras {
    String nombre;
    String color;
    int base;

    /**
     * h=3
     * b=a/2
     * res= h*b/2
     * 
     */

    public figuras() {
    }

    public figuras(String nombre, String color, int base) {
        this.nombre = nombre;
        this.color = color;
        this.base = base;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public String obtenerArea(){
        return "";
    }
    
    public String obtenerPerimetro(){
        return "";
    }

    public int generarBase(){
         base = (int)(Math.random()*(10-1))+1;
        return base;
    }

    public String obtenerDatos(){
        String msg = "";
        msg = "El nombre de la figura es: "+nombre+"\n y la base es"+generarBase()+" el color es: "+color;
        return msg;
    }
}
