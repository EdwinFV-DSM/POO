/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;

/**
 *
 * @author PC1
 */
public class pisoCajeros extends Empleados {
    String categoria;
    String piso="PISO";
    String cajero="CAJERO";
    double aumento,sueldoFinal;
    
    public pisoCajeros(){
    }
    public pisoCajeros(String categoria) {
        this.categoria = categoria;
    }

    public pisoCajeros(String categoria, String departamento, String turno) {
        super(departamento, turno);
        this.categoria = categoria;
    }

    public pisoCajeros(String categoria, String departamento, String turno, char sexo, String telefono, String fechaNac, String nombre) {
        super(departamento, turno, sexo, telefono, fechaNac, nombre);
        this.categoria = categoria;
    }
   
    
    
    
    
        public String validarCategoria(){
       if(categoria.equalsIgnoreCase(piso)){
         return categoria.toUpperCase();
       }
       else 
           if(categoria.equalsIgnoreCase(cajero)){
           return categoria.toUpperCase();
             }
       categoria="ERROR INTRODUZCA UNA CATEGORIA VALIDA";
       return categoria;
   } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
      public double obtenerSueldo(){
    if(turno.equalsIgnoreCase(matutino)){
        if(categoria.equalsIgnoreCase(cajero)){
            horas=8;
            sueldoBase=horas*sueldoBase;
            System.out.println("SUELDO BASE: $"+sueldoBase);
            aumento=sueldoBase*.10;
            System.out.println("AUMENTO: $"+aumento);
            sueldoFinal=sueldoBase+aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;
        }     
          else
            if(categoria.equalsIgnoreCase(piso)){
            horas=8;
            sueldoBase=horas*sueldoBase;
            System.out.println("SUELDO BASE: $"+sueldoBase);
            aumento=sueldoBase*.15;
            System.out.println("AUMENTO: $"+aumento);
            sueldoFinal=sueldoBase+aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;
        } 
        else
         if(categoria.equals(piso)==false || categoria.equals(cajero)==false){
           System.out.println("CATEGORIA INVALIDA INGRESE ");
       }
        
        }
    else
        
     if(turno.equalsIgnoreCase(vespertino)){
        if(categoria.equalsIgnoreCase(cajero)){
            horas=10;
            sueldoBase=horas*sueldoBase;
            System.out.println("SUELDO BASE: $"+sueldoBase);
            aumento=sueldoBase*.10;
            System.out.println("AUMENTO: $"+aumento);
            sueldoFinal=sueldoBase+aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;
        }     
          else
            if(categoria.equalsIgnoreCase(piso)){
            horas=10;
            sueldoBase=horas*sueldoBase;
            System.out.println("SUELDO BASE: $"+sueldoBase);
            aumento=sueldoBase*.15;
            System.out.println("AUMENTO: $"+aumento);
            sueldoFinal=sueldoBase+aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;
            }   
        else
          if(categoria.equals(piso)==false || categoria.equals(cajero)==false){
           System.out.println("CATEGORIA INVALIDA INGRESE PISO O CAJERO");
       }
      
        }
    
       
   return 0;
} 
    
           @Override
    public String mostrarDatos(){
    return super.mostrarDatos() +" CATEGORIA "+categoria;
} 
    
    
    
}
