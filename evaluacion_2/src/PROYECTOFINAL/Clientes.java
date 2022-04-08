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

public class Clientes extends Persona {
    Scanner entrada=new Scanner(System.in);
    double totalPagar;
    public Clientes() {
    }

    public Clientes(char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
    }
   
    
    
    public double generarCompra(){
        int cant,i=0;
        String en;
        double pu,precioTotal;
        totalPagar = 0;
        
        System.out.println("Si desea salir escriba: SALIR ");
      //  en=entrada.next();
      System.out.println("--------");
        System.out.println("PRODUCTOS");
        System.out.println("--------");
      System.out.println("Escriba el nombre");
        en =entrada.next();  
      do{       
        System.out.println("Escriba el precio unitario");
        pu =entrada.nextDouble();
        System.out.println("Escriba la cantidad del producto");
        cant=entrada.nextInt();
        precioTotal=pu*cant;
        System.out.println("--------");
        System.out.println("PRECIO TOTAL");
        System.out.println("--------");
        System.out.println("$"+precioTotal);
        totalPagar=precioTotal+ totalPagar;
        //System.out.println("TOTAL A PAGAR:"+totalPagar);    
      
        i++;
        System.out.println("Escriba el nombre");
        en =entrada.next();
        }while(!en.equalsIgnoreCase("Salir"));;
        //System.out.println("TOTAL");
        return totalPagar;  
        
          
    }
    
    @Override
    public String mostrarDatos(){
    return super.mostrarDatos()+" TOTAL A PAGAR $"+totalPagar;
}    
    
    
    
    
}
