package unidad01_ej02;

public class CuentaBancaria {
    String titular;
    double saldo;

    // Constructor de clase
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Metodos
    public void mostrarSaldo(){
        System.out.println("El saldo es: " + this.saldo);
    }
    
    public double depositar(double cantidad){
        double nuevoSaldo = this.saldo + cantidad;
        
        return nuevoSaldo;
    }
    
     public double retirar(double cantidad){

          if (this.saldo < cantidad) {
              System.out.println("No podes retirar esa cantidad");
              return this.saldo;
          } else {
             double nuevoSaldo = this.saldo - cantidad;
             return nuevoSaldo;
          }
          
    }
    
}
