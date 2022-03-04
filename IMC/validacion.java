package IMC;

public class validacion {
    String nombre;
    int edad;
    double calificacion;
    double peso;
    String talla;

    
    
    public validacion() {

    }

    public validacion(String nombre, int edad, double calificacion, double peso, String talla) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        this.peso = peso;
        this.talla = talla;
    }

    public double getPeso(){
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setPeso(){
        this.peso = peso;
    }

    public int aumentaEdad(int edad){
        int edadM= edad;
        int res;
        res=edadM+edad;

        return res;
    }
    public String obtenerCalificacion(double calificacion){
        String msg= "";
        if(calificacion <= 7){
            msg = calificacion+" Te encuentras reprobado";
        }else if(calificacion == 8){
            msg = calificacion+" Puedes mejorar";
        }else{
            msg = calificacion+"Felicidades";
        }
        return msg;
    }
    public String obtenerIMC(double peso){
        String msg ="";
        if (peso <=18.5) {
            msg = "Tienes bajo de peso";
        }else if(peso ==18.5 || peso <=24.9){
            msg = "Tienes peso normal";
        }else if(peso == 25 || peso <=29.9){
            msg = "Tienes sobrepeso";
        }else{
            msg = "Tienes obesidad";
        }
        return msg;
    }
}
