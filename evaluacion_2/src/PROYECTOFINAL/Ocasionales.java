/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTOFINAL;

/**
 *
 * @author PC1
 */
public class Ocasionales extends Clientes{
    String fechaCompra;

    public Ocasionales(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Ocasionales(String fechaCompra, char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
        this.fechaCompra = fechaCompra;
    }
    
        @Override
    public String mostrarDatos(){
    return super.mostrarDatos()+" FECHA DE LA COMPRA: "+fechaCompra;
}    
    
    
}
