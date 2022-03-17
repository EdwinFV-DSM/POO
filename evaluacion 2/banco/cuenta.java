package banco;

public class cuenta {

    /**
     * 1.-crear una clase llamada banco y otra llamada cuenta
     * 
     * 2.-banco va a ser la principal donde se inicializan los objetos
     * 3.-la clase cuenta va a tener 2 atributos, el titular y el saldo
     * 4.-crear sus constructures vacios y otro con 2 parametros
     * 5.-crear su metodos get y set
     * 6.-crear un metodo para mostrar datos
     * 7.-crear un metodo llamado depositar, el cual va a recibir un parametro el cual va a sumar
     * al saldo inicial
     * 
     * 8.-crear un metodo llamado retirar va a recibir un atributo y se le restara al saldo inicial, siempre y 
     * cuando la cuenta quede con un minimo de 200 pesos
     * 
     * 9.-en la clase banco, crear un objeto, mostrar sus datos
     * 10.-hacer un deposito, mostar sus datos
     * 11.-hacer un retiro y mostar sus datos
     */

     String titular;
     double salario;

     public cuenta(){
        
    }

    public cuenta(String titular,double salario){
        this.titular = "juan carlos";
        this.salario = 2500;
    }

    public String getTitular(){
        return titular;
    }

    public double getSalario(){
        return salario;
    }

    public void setTitular(String titular){
        this.titular=titular;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }

    public String datosBanco(){
        String datos = "Titular de la cuenta es :"+titular+ "\n Saldo en la cuenta: "+salario;

        return datos;
    }

    public String depositar(double n){
        String datos = "";

        salario = salario+n;
        datos = "El saldo es: $"+salario;

        return datos;
    }

    public String retirar(double r){
        String re= "";
        if (salario > 200) {
            
            salario = salario - r;
            
            re= "El saldo es: $"+salario;

        }else{
            re = "No cuenta con saldo suficiente";
        }
        return re;
    }
    
}

