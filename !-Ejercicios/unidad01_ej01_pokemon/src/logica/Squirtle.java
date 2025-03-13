package logica;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola de Agua");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy atacando con Hidrobomba");
    }
}
