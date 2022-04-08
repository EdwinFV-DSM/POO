package Proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VIP extends cliente {
    String noCliente;
    String Fechaingreso;

    public VIP() {
    }

    public VIP(String noCliente, String fechaingreso) {
        this.noCliente = noCliente;
        Fechaingreso = fechaingreso;
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

    public String entarSorteo() {
        String msg = "";
        int res;
        if ((super.generarComprar() >= 1000)) {
            System.out.println("Alcanzaste un premio");
            res = (int) (Math.random() * (4 - 1));
            switch (res) {
                case 1:
                    msg = "Television";
                    break;
                case 2:
                    msg = "Celular";
                    break;
                case 3:
                    msg = "$2000 pesos";
                    break;
                case 4:
                    msg = "Plancha";
                    break;
                default:
                    msg = "Nada";
                    break;
            }
        }

        return msg;
    }

    @Override
    public String mostrarDatos() {
        String msg1 = "";

        msg1 = super.mostrarDatos() + "\n Tu numero de cliente es: " + noCliente + "\n Tu fecha de ingreso es: "
                + Fechaingreso + "\n Gracias por tu compra: " + entarSorteo();
        return msg1;
    }
}
