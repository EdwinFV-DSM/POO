package Proyecto;

public class ocasionales extends cliente {
    String fechaCompra;

    
    public ocasionales() {
    }

    
    public ocasionales(char sexo, String telefono, String fechaNac, String nombre, String fechaCompra) {
        super(sexo, telefono, fechaNac, nombre);
        this.fechaCompra = fechaCompra;
    }


    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String mostrarDatos() {
        return "";
    }
}
