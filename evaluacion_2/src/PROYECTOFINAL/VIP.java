/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC1
 */
public class VIP extends Clientes{
    String noCliente;
    String fechaIngreso;
    int dE,mE,aE;
    int dE2,mE2,aE2;
    int dE3,mE3,aE3;
    String dia1,mes1,año1;
    String dia2,mes2,año2;       
    String dia3,mes3,año3;  
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/YYYY");
    LocalDate fechaActual=LocalDate.now();
    String formatoString = fechaActual.format(dtf);
    
    public VIP(){
    }
    public VIP(String noCliente, String fechaIngreso) {
        this.noCliente = noCliente;
        this.fechaIngreso = fechaIngreso;
    }

    public VIP(String noCliente, String fechaIngreso, char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
        this.noCliente = noCliente;
        this.fechaIngreso = fechaIngreso;
    }
    
    
    
    public void Sorteo(){
        
    
      int aleatorio =0;  
      dia1=fechaIngreso.split("/")[0];
      mes1=fechaIngreso.split("/")[1];
      año1=fechaIngreso.split("/")[2];
      dE=Integer.parseInt(dia1);
      mE=Integer.parseInt(mes1);
      aE=Integer.parseInt(año1);
       
      dia2=formatoString.split("/")[0];
      mes2=formatoString.split("/")[1];
      año2=formatoString.split("/")[2];
      dE2=Integer.parseInt(dia2);
      mE2=Integer.parseInt(mes2);
      aE2=Integer.parseInt(año2);
      
      dia3=formatoString.split("/")[0];
      mes3=formatoString.split("/")[1];
      año3=formatoString.split("/")[2];
      dE3=Integer.parseInt(dia3);
      mE3=Integer.parseInt(mes3);
      aE3=Integer.parseInt(año3);
      
      
      //int resta =mE2-mE;
      
      
    if(totalPagar>=1000 & aE<aE2 & mE<=mE2 & aE3<2004){
        
    
       //&& aE<aE2 && resta>=4 CONDICION QUEIBRA EL PROGRAMA
       // System.out.println(formatoString); IMPRIME FECHA ACTUAL
        
         //fechanumero=Integer.parseInt(fechaIngreso); CONVIERTE A INT
         //System.out.println(fechanumero); MUESTRA FECHA ENTERO ERROR XD
        
        aleatorio=(int)(Math.random()*4+1);
        System.out.println(aleatorio);
        switch (aleatorio){

            case 1 -> {
                System.out.println("Usted gano una television");
            }
            case 2 -> {
                System.out.println("Usted gano un celular");
            }
            case 3 -> {
                System.out.println("Usted gano una plancha");
            }
            case 4 -> {
                System.out.println("Usted gano NADAAAA");
            }
          
            default -> {
                System.out.println("Opcion incorrecta");
            }

      }//cierra SWITCH
    }
        System.out.println("USTED ES MENOR DE EDAD NO PUEDE PARTICIPAR EN EL SORTEO");
    }
    
    
        @Override
    public String mostrarDatos(){
    return super.mostrarDatos()+" NUMERO DE CLIENTE "+noCliente+"FECHA DE INGRESO: "+fechaIngreso;
}    
    
    
    
}
