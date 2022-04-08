package Proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VIP extends cliente {
    String noCliente;
    String Fechaingreso;
    int dE, mE, aE;
    int dE2, mE2, aE2;
    String dia1, mes1, año1;
    String dia2, mes2, año2;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    LocalDate fechaActual = LocalDate.now();
    String formatoString = fechaActual.format(dtf);

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

        dia1 = Fechaingreso.split("/")[0];
        mes1 = Fechaingreso.split("/")[1];
        año1 = Fechaingreso.split("/")[2];
        dE = Integer.parseInt(dia1);
        mE = Integer.parseInt(mes1);
        aE = Integer.parseInt(año1);

        dia2 = formatoString.split("/")[0];
        mes2 = formatoString.split("/")[1];
        año2 = formatoString.split("/")[2];
        dE2 = Integer.parseInt(dia2);
        mE2 = Integer.parseInt(mes2);
        aE2 = Integer.parseInt(año2);

        // int resta =mE2-mE;

        // && aE<aE2 && resta>=4 CONDICION QUEIBRA EL PROGRAMA
        // System.out.println(formatoString); IMPRIME FECHA ACTUAL

        // fechanumero=Integer.parseInt(fechaIngreso); CONVIERTE A INT
        // System.out.println(fechanumero); MUESTRA FECHA ENTERO ERROR XD

        if (super.generarComprar() >= 1000 & aE < aE2 & mE <= mE2 & aE > 2004) {
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
