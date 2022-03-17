package banco;

public class banco {
    public static void main(String[] args) {
    cuenta per1 = new cuenta();
    cuenta per2 = new cuenta("Jesus",2500);
    System.out.println(per2.datosBanco());
    
    //Deposita en la cuenta
    // per1.depositar(150);
    // System.out.println("El saldo de la cuenta de: "+per1.getSalario());
    
    //Retira saldo de la cuenta
    // per1.retirar(1650);
    // System.out.println("El saldo de la cuenta de: "+per1.getSalario());
    
    //Muestra los datos de la cuenta    
    System.out.println(per2.datosBanco());
    
    //Deposita en la cuenta
    per2.depositar(250);
    System.out.println("El saldo de la cuenta de: "+per2.getSalario());
    
    //Retira saldo de la cuenta
    per2.retirar(1200);
    System.out.println("El saldo de la cuenta de: "+per2.getSalario());
    }
    
}
