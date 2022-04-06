package Proyecto;

public class pisocajeros extends Empleados {
    String catego;

    public pisocajeros() {
    }

    public pisocajeros(char sexo, String telefono, String fechaNac, String nombre, String departamento, String turno,
            String catego) {
        super(sexo, telefono, fechaNac, nombre, departamento, turno);
        this.catego = catego;
    }

    public String getCatego() {
        return catego;
    }

    public void setCatego(String catego) {
        this.catego = catego;
    }

    public String obtenerSueldo(){

    }

    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\nTu sueldo es: "+obtenerSueldo()+"\nTu departamento es: "+Departamento;
        return msg;
    }
}
