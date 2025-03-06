package pkg01_herencia;

public class Herencia {

    public static void main(String[] args) {

            //String vector[] = new String[3];
            // Si guardamos un int nos va a tirar error, pero con polimorfismo se puede
            
            Persona vector[] = new Persona[5];
            vector[0] = new Persona();
            vector[1] = new Empleado();
            vector[2] = new Consultor();
            vector[3] = new Jefe();
            // vector[4] = "hola"; No puedo guardar un string pero si jefe, empleado, etc por que son hijos de persona
            
            Persona persona1 = new Persona();
            Consultor consultor1 = new Consultor();
            
            persona1 = consultor1; // esto se puede hacer x polimorfismo
            // consultor1 = persona1; Esto no porque no podes asignar a la clase hija, la clase padre
    }
    
}
