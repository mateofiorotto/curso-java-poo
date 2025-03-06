package unidad01_ej02;

public class Main {
    public static void main(String[] args) {
        
        int cantidad1 = 300;
        int cantidad2 = 450;
        
        // Creamos el objeto cuenta bancaria
        CuentaBancaria cuentaBanco = new CuentaBancaria("Mateo Fiorotto", 200);
        
        System.out.println("Esta cuenta pertenece a " + cuentaBanco.getTitular() + " y tiene " + cuentaBanco.getSaldo() + " de saldo");
        
        // Depositar (puede ser con o sin variables el parametro)
        System.out.println("");
        System.out.println("Depositaste " + cantidad1);
        cuentaBanco.setSaldo(cuentaBanco.depositar(cantidad1));
        System.out.println("Tu cuenta bancaria ahora tiene: " + cuentaBanco.getSaldo());
        
          // Depositar (puede ser con o sin variables el parametro)
        System.out.println("");
        System.out.println("Retiraste " + cantidad2);
        cuentaBanco.setSaldo(cuentaBanco.retirar(cantidad2));
        System.out.println("Tu cuenta bancaria ahora tiene: " + cuentaBanco.getSaldo());
    
    }
    
}
