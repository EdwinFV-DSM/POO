package Proyecto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

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
        LocalDate fecha_I = LocalDate.parse(Fechaingreso);

        LocalDate fecha_hoy = LocalDate.now();

        int dias = (int)ChronoUnit.DAYS.between(fecha_I, fecha_hoy);
        LocalDate fecha_II = LocalDate.parse(Fechaingreso);
        int y = (int)ChronoUnit.YEARS.between(fecha_II, fecha_hoy);

        // System.out.println(y);
        if ((super.generarComprar() >= 1000) && (dias >= 500) && (y >= 18)) {
            double resu = generarComprar();
            res = (int) (Math.random()*5);
            switch (res) {
                case 1:
                    msg = "Ingresaste a un sorteo por la compra minima de: "+resu+" y Ganaste un: Television";
                    break;
                case 2:
                    msg = "Ingresaste a un sorteo por la compra minima de: "+resu+" y Ganaste un: Celular";
                    break;
                case 3:
                    msg = "Ingresaste a un sorteo por la compra minima de: "+resu+" y Ganaste un: $2000 pesos";
                    break;
                case 4:
                    msg = "Ingresaste a un sorteo por la compra minima de: "+resu+" y Ganaste un: Plancha";
                    break;
                default:
                    msg = "Ingresaste a un sorteo por la compra minima de: "+resu+" y Ganaste un: Nada";
                    break;
            }
        }else{
            msg = "No ingreso a sorteo";
        }

        return msg;
    }

    @Override
    public String mostrarDatos() {
        String msg1 = "";

        msg1 = super.mostrarDatos() + "\n Tu numero de cliente es: " + noCliente + "\n Tu fecha de ingreso es: "
                + Fechaingreso + "\n Gracias por tu compra de: "+entarSorteo();
        return msg1;
    }
}
