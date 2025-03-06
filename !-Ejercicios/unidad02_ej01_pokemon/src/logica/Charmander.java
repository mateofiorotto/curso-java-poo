package logica;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Charmander y estoy atacando con Arañazo");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con Puño de Fuego");
    }
}
