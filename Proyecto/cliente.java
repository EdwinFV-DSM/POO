package Proyecto;

public class cliente extends Persona {

    public cliente() {
    }

    public cliente(char sexo, String telefono, String fechaNac, String nombre) {
        super(sexo, telefono, fechaNac, nombre);
    }
    
    public String generarComprar(){
        String cont = "exit";
        double su;
				while (cont == "") {
					System.out.println("--Esta en el apartado de Sumatoria de Compras--");
					System.out.println("Ingrese la cantidad del producto "+cont+" a comprar,");
					Object bufEntrada;
                    double art = Double.parseDouble(((Object) bufEntrada).readLine());
					System.out.println("Ingrese el precio del producto "+cont+" a comprar");
					Double pre = Double.parseDouble(((Object) bufEntrada).readLine());
					double sto = art*pre*1.16;
					System.out.println("El subtotal de la compra es: $"+sto);
					cont = cont+cont;
					su = su+sto;
                }
                return "Tu subtotal es: "+su;
    }

    public String mostrarDatos(){
        String msg = "";
        msg = super.mostrarDatos()+"\nTu turno es: "+turno+"\nTu sueldo es: "+"\nTu departamento es: "+Departamento;
        return msg;
    }
}
