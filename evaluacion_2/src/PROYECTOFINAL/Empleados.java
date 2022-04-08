/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class Empleados extends Persona {
    
    Scanner entrada=new Scanner(System.in);
    String departamento;
    String turno;
    String matutino="MATUTINO";
    String vespertino="VESPERTINO";
    int horas;
    double sueldoBase=8;
    public Empleados(){
        
    }
    public Empleados(String departamento, String turno) {
        this.departamento = departamento;
        this.turno = turno;
    }

    public Empleados(String departamento, String turno, char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
        this.departamento = departamento;
        this.turno = turno;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTurno() {
        return turno;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


    
    public String validarTurno(){
       if(turno.equalsIgnoreCase(matutino)){
         turno=matutino;
         return turno.toUpperCase();
       }
       else 
           if(turno.equalsIgnoreCase(vespertino)){
           return turno.toUpperCase();
             }
       turno=matutino;
       return turno;
   } 
    
    public double obtenerSueldo(){
    if(turno.equalsIgnoreCase(matutino)){
        horas=8;
        sueldoBase=horas*sueldoBase;
        System.out.print("SUELDO: $");
        return sueldoBase;
       
    }
         if(turno.equalsIgnoreCase(vespertino)){
        horas=10;
        sueldoBase=horas*sueldoBase;
        System.out.print("SUELDO: $");
        return sueldoBase;
        
    
    }
        return 0;

    
      
} 
    
    
    
          @Override
    public String mostrarDatos(){
    return super.mostrarDatos() +"DEPARTAMENTO: "+departamento+" TURNO: "+validarTurno();
} 
    
    
    
    
    
    
    
    
    
}
