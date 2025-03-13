package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con Mordisco");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Bulbasaur y estoy atacando con Arañazo");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Placaje");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con Latigo Cepa");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Dr");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con Paralizar");
    }
}
