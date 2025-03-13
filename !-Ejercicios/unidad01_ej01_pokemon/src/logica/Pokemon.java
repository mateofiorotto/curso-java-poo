package logica;

public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;
    
    public abstract void atacarPlacaje();
    public abstract void atacarArañazo();
    public abstract void atacarMordisco();

}
