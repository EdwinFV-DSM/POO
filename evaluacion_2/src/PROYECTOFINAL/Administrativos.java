/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;

/**
 *
 * @author PC1
 */
public class Administrativos extends Empleados{
    String carrera;
    String puesto;
    public Administrativos(){
    }

    public Administrativos(String carrera, String puesto) {
        this.carrera = carrera;
        this.puesto = puesto;
    }

    public Administrativos(String carrera, String puesto, String departamento, String turno) {
        super(departamento, turno);
        this.carrera = carrera;
        this.puesto = puesto;
    }

    public Administrativos(String carrera, String puesto, String departamento, String turno, char sexo, String telefono, String fechaNac, String nombre) {
        super(departamento, turno, sexo, telefono, fechaNac, nombre);
        this.carrera = carrera;
        this.puesto = puesto;
    }

   


    
  
    @Override
        public double obtenerSueldo(){
            
         double aumento,sueldoFinal;  
         if(turno.equalsIgnoreCase(matutino)){
            horas=8;
            sueldoBase=150;
            sueldoBase=horas*sueldoBase;
            System.out.println("SUELDO BASE: $"+sueldoBase);
            aumento=sueldoBase*.20;
            System.out.println("AUMENTO: $"+aumento);
            sueldoFinal=sueldoBase+aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;
       
         } 
         else 
              if(turno.equalsIgnoreCase(vespertino)){
      
            horas=10;
            sueldoBase=150;
            sueldoBase=horas*sueldoBase;
            System.out.println("SUELDO BASE: $"+sueldoBase);
            aumento=sueldoBase*.20;
            System.out.println("AUMENTO: $"+aumento);
            sueldoFinal=sueldoBase+aumento;
            System.out.print("SUELDO FINAL: $");
            return sueldoFinal;
       
         } 
        return 0;
    
    
    
       }   
        @Override
    public String mostrarDatos(){
    return super.mostrarDatos() +" CARRERA: "+carrera+" PUESTO: "+puesto;
} 




} 
    
    
    

