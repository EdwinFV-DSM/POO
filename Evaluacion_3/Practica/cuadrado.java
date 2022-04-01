package Evaluacion_3.Practica;

public class cuadrado extends figuras {

    public cuadrado(String nombre, String color, int base) {
        super(nombre, color, base);
    }

    public cuadrado() {
    }

    public String obtenerColor(){
        String msg = "";
        String color="";
        if (base >= 1 || base <= 10) {
            switch (base) {
                case 1:
                    color = "Azul";
                    break;
                    case 2:
                    color = "Rojo";
                    break;
                    case 3:
                    color = "Rosa";
                    break;
                    case 4:
                    color = "Verda";
                    break;
                    case 5:
                    color = "Amarillo";
                    break;
                    case 6:
                    color = "Morado";
                    break;
                    case 7:
                    color = "Cafe";
                    break;
                    case 8:
                    color = "Naranja";
                    break;
                    case 9:
                    color = "Gris";
                    break;
                    case 10:
                    color = "Cyan";
                    break;
                default:
                    color = "El color de la figura es negro";
                    break;
            }
        }else{
            color = "Es complicado asignar un valor";
        }

        msg = "El color de la figura es: "+color;
        return msg;
    }
    @Override
    public String obtenerArea(){
        String msg= "";
        double res = base * base;
        msg = "El Area es: "+res;
        
        return msg;
    }
    @Override
    public String obtenerPerimetro(){
        String msg = "";
        double res = base * 4;

        msg = "El perimetro es:"+res;

        return msg;
    }
    @Override
    public String obtenerDatos(){
        String msg = "";
        msg = super.obtenerDatos()+"\n"+obtenerColor()+"\n"+obtenerArea()+"\n"+obtenerPerimetro();
        return msg;
    }
}
