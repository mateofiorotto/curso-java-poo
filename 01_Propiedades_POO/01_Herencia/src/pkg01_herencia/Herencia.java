package pkg01_herencia;

public class Herencia {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        
        empleado1.setNombre("Hola");
        System.out.println(empleado1.getNombre());
        
        Consultor cons1 = new Consultor();
        
        cons1.setNombre("Mateo");
        System.out.println(cons1.getNombre());
    }
    
}
