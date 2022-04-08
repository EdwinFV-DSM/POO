package Proyecto;

public class Administrativo extends Empleados{
    String carrera;
    String puesto;
    
    public Administrativo() {
    }

    public Administrativo(char sexo, String telefono, String fechaNac, String nombre, String departamento, String turno,
            String carrera, String puesto) {
        super(sexo, telefono, fechaNac, nombre, departamento, turno);
        this.carrera = carrera;
        this.puesto = puesto;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int obeterSueldo(){
        return 0;
    }   
    @Override
    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\nTu sueldo es: "+obtenerSueldo()+"\nTu departamento es: "+Departamento;
        return msg;
    }
}
