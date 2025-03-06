package unidad02_ej04;

public class Main {

    public static void main(String[] args) {
//        Simulador de Superhéroes (Interfaces y Clases Abstractas)
//        Diseña un sistema para un videojuego de superhéroes:
//
//        Crea una clase abstracta Superheroe con atributos como nombre, poder, nivelEnergia y métodos comunes como atacar(), defender(), recuperarEnergia().
//                Crea interfaces como IVolar, ISuperFuerza, ISuperVelocidad, que tengan métodos específicos.
//                Crea subclases como Superman, Flash, DoctorStrange, donde cada una implemente diferentes interfaces según sus habilidades.

        Superman superman = new Superman(0, "Vuelo, Super Fuerza, Super Velocidad", "Superman");
        superman.mostrarDetalles();

        superman.defender();
        superman.atacar();
        superman.recuperarEnergia();
        superman.atacar();
        superman.volar();
        superman.superFuerza();
        superman.superVelocidad();

        System.out.println();
        Flash flash = new Flash(0, "Super Velocidad", "Flash");
        flash.mostrarDetalles();

        flash.defender();
        flash.atacar();
        flash.recuperarEnergia();
        flash.atacar();
        flash.superVelocidad();

        System.out.println();
        DoctorStrange doctorStrange = new DoctorStrange(0, "Volar", "Dr. Strange");
        doctorStrange.mostrarDetalles();

        doctorStrange.defender();
        doctorStrange.atacar();
        doctorStrange.recuperarEnergia();
        doctorStrange.atacar();
        doctorStrange.volar();
    }
    
}
