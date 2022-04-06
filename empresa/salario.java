package empresa;

import javax.lang.model.util.ElementScanner14;

public class salario {
    String nombre;
    int ht;
    int precio;

    public salario(){
        nombre = "juan";
        ht = 12;
        precio = 50;
    }

    public salario(String nombre, int ht, int precio){
        this.nombre = nombre;
        this.ht = ht;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    } 

    public int getHt(){
        return ht;
    }

    public int getPrecio(){
        return ht;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public void setHt(){
        this.ht = ht;
    }

    public void setPrecio(){
        this.precio = precio;
    }

    public String salarioPagado(){
            if (ht <= 30) {
                int res1;
                res1= ht * precio;
                return "Tu nombre es: "+nombre+"\n Tu salario es el siguiente: "+res1;
            }else if (ht >= 31 && ht < 40){
                int res2,res4;
                res2 = ht - 30;
                ht = ht - res2;
                int valor = res2*precio;
                return "Tu nombre es: "+nombre+"\n Tu salario es el siguiente con horas extras: "+res2*2;
            }else if(ht >= 40){
                int res3,res4;
                
                res3 = ht - 40;
                ht = ht - res3;
                int valor = res3*precio;
                return "Tu nombre es: "+nombre+"\n Tu salario es el siguiente con horas extras: "+valor*3;
            }else{
                return "No has cumplido con las horas trabajadas solicitadas";
            }
            
    }
}
