package logica;

public class Main {

    public static void main(String[] args) {
//        Sistema de Empleados (Herencia, Clases Abstractas y Métodos Constructores)
//        Crea un sistema que modele empleados en una empresa usando herencia y polimorfismo.
//
//Define una clase abstracta Empleado con los atributos nombre, edad y el método abstracto calcularSueldo().
//Crea dos subclases:
//EmpleadoTiempoCompleto: Tiene un salario fijo definido en su constructor.
//EmpleadoPorHora: Tiene una tarifa por hora y un atributo horasTrabajadas. Su sueldo se calcula multiplicando la tarifa por la cantidad de horas trabajadas.
//Implementa constructores en cada clase para inicializar sus valores.
//Crea un programa donde se instancien ambos tipos de empleados y se muestre su sueldo.

        EmpleadoTiempoCompleto empleadoTiempoCompleto1 = new EmpleadoTiempoCompleto("Mateo", 20, 800);

        EmpleadoPorHora empleadoPorHora1 = new EmpleadoPorHora("Lucas", 10, 32, 10);

        System.out.println("Empleado tiempo completo (" + empleadoTiempoCompleto1.getNombre() + "): ");
        System.out.println(empleadoTiempoCompleto1.sueldo());

        System.out.println();

        System.out.println("Empleado por hora (" + empleadoPorHora1.getNombre() + "): ");
        System.out.println(empleadoPorHora1.sueldo());

    }
    
}
