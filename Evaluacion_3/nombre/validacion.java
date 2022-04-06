package Evaluacion_3.nombre;

/**
 * validacion
 */
public class validacion {
    String nombre;

    public validacion(String nombre) {
        this.nombre = nombre;
    }

    public validacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtnerMayus() {
        String[] partes = nombre.split(" ");
        String parte11, parte12, parteM1;
        String msg = "";
        for (int pal = 0; pal < partes.length; pal++) {
            // msg = partes[pal];
            
              //  String parte = partes[par];
                // parte 1
            parte11 = partes[pal].substring(0, 1).toUpperCase();
            parte12 = partes[pal].substring(1).toLowerCase();
            parteM1 = parte11 + parte12;
            // msg = parteM1;
            msg = msg+" "+parteM1;
            
            
            // parte 2
            // String parte21 = parte2.substring(0, 1).toUpperCase();
            // String parte22 = parte2.substring(1).toLowerCase();
            // String parteM2 = parte21+parte22;
            // Parte 3
            // String parte31 = parte3.substring(0).toLowerCase();
            // String parteM3 = parte31;

            
        }
        return msg;
    }

}