package unidad02_ej03;

public class Main {

    public static void main(String[] args) {
//        Sistema de Vehículos (Herencia, Polimorfismo y Encapsulamiento)
//        Crea un sistema de gestión de vehículos donde:
//
//        Exista una clase base abstracta llamada Vehiculo con atributos como marca, modelo, velocidadMaxima, combustible y métodos como acelerar(), frenar(), detener().
//                Se creen clases derivadas como Auto, Moto y Camion, que hereden de Vehiculo e implementen métodos específicos (por ejemplo, cargarPasajeros() en Auto o transportarCarga() en Camion).
//                Se use polimorfismo para permitir que un mismo método (acelerar()) se comporte de manera diferente en cada tipo de vehículo.
//        Se apliquen getters y setters para controlar el acceso a los atributos.
        Moto moto = new Moto("Honda", "CBR", 200, 0);
        moto.detalles();
        moto.acelerar();
        moto.frenar();
        moto.detener();

        System.out.println();
        Auto auto = new Auto("Ford", "Mustang", 200, 100);
        auto.detalles();
        auto.acelerar();
        auto.frenar();
        auto.detener();
        auto.cargarPasajeros(5);

        System.out.println();
        Camion camion = new Camion("Mercedes", "Actros", 200, 100);
        camion.detalles();
        camion.acelerar();
        camion.frenar();
        camion.detener();
        camion.transportarCarga(1000);
    }
}
