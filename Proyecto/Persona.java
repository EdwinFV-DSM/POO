package Proyecto;

public class Persona {
     char sexo;
     String telefono;
     String fechaNac;
     String nombre;
    
    public Persona() {
    }

    public Persona(char sexo, String telefono, String fechaNac, String nombre) {
        this.sexo = sexo;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String sumaNombre(){
        String msg = "";
        int valor = 0;
        String[] partes = nombre.split(" ");
        String parte11, parte12, parteM1;
        int contar = 0;
        int sum = 0;
        for (int pal = 0; pal < partes.length; pal++) {
            parte11 = partes[pal].substring(0, 1).toUpperCase();
            parte12 = partes[pal].substring(1).toLowerCase();
            // parteM1 = parte11 + parte12;
            
            char[] myChars = partes[pal].toCharArray();
            for(int p = 0; p < myChars.length; p++){
                
            
            int res = 0;
                // System.out.println(valor=(int)nombre.charAt(i) );
                // suma+=(int)nombre.charAt(i);
                valor=(int)myChars[p];
                // System.out.println(valor);
                // int sum = 0;
                // System.out.println(sum);
                // System.out.println(myChars[p]);
                // System.out.println(Cadena.charAt(p));
                // contar=contar+1;
                System.out.println("La cadena es "+myChars[p]+" Su valor es de "+valor);
                sum = valor + sum;  
                // msg = "La suma de tu nombre es: "+sum;
            } 
                System.out.println("La suma de todos los valores es: "+sum);
        }
        
        return msg;
    }

    public String mostrarDatos(){
        String msg = "";

        msg = "Tu sexo es: "+sexo+"\nTu nombre es: "+nombre+"\nTu fecha de nacimiento es: "+fechaNac+"\nTu telefono es: "+telefono+"\n"+sumaNombre();
        return msg;
    }
    
}
