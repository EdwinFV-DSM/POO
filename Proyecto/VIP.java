package Proyecto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class VIP extends cliente {
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

    public String entarSorteo() {
        String msg = "";
        int res;

        int iTest = Integer.parseInt(Fechaingreso);
       

        if (super.generarComprar() >= 1000 && iTest >= 500) {
            msg = "Alcanzaste un premio";
            res = (int) (Math.random() * (10 - 1)) + 1;
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
        } else {
            msg = "Suerte para la proxima";
        }

        return msg;
    }

    @Override
    public String mostrarDatos() {
        String msg = "";

        msg = super.mostrarDatos() + "\n Tu numero de cliente es: " + noCliente + "\n Tu fecha de ingreso es: "
                + Fechaingreso + "\n Gracias por tu compra: " + entarSorteo();
        return msg;
    }
}
