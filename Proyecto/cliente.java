package Proyecto;
import java.io.*;

public class cliente extends Persona {

    public cliente() {
    }

    public cliente(char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
    }
    
    public String generarComprar(){
        String respuesta = "exit";
        String msg = "";
       while (respuesta == " ") {
           
       }
       msg = "Funcionando";

       return msg;
    }

    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\nTu sueldo es: "+"\nTu departamento es: "+Departamento;
        return msg;
    }
}
