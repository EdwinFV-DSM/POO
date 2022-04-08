package Proyecto;

public class VIP extends Persona{
    String noCliente;
    String Fechaingreso;
    
    public VIP() {
    }

    public VIP(char sexo, String telefono, String fechaNac, String nombre, String noCliente, String fechaingreso) {
        super(sexo, telefono, fechaNac, nombre);
        this.noCliente = noCliente;
        Fechaingreso = fechaingreso;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getFechaingreso() {
        return Fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        Fechaingreso = fechaingreso;
    }

    public String entarSorteo(){
        String msg = "";
        return msg;
    }
    @Override
    public String mostrarDatos(){
        String msg = "";

        msg = "Tu sexo es: "+sexo+"\nTu nombre es: "+nombre+"\nTu fecha de nacimiento es: "+fechaNac+"\nTu telefono es: "+telefono;
        return msg;
    }
}
