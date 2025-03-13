
package logica;

public class Empleado {
    
    // Atributos
    int id;
    String nombre;
    String puesto;
    double salario;
    
    //Definir constructor vacio y con parametros
    public Empleado() {}

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
     // GETTER + SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // METODOS
    public double calcularAumento(double aumento){
        double salarioAumentado = this.salario + (this.salario * aumento);
        
        return salarioAumentado;
    }
    
    public void mostrarDetalles() {
        System.out.println("ID: " + this.id);
         System.out.println("Nombre: " + this.nombre);
          System.out.println("Puesto: " + this.puesto);
           System.out.println("Salario: " + this.salario);
         
    }
    
    
}
