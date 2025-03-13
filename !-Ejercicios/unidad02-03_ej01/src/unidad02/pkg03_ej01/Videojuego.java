package unidad02.pkg03_ej01;

public class Videojuego {
    //1. crear clase videojuego
    // Atributos
    private int codigo;
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoria;
    
    // Constructores
    public Videojuego(){}

    public Videojuego(String categoria, int cantidadJugadores, String consola, String titulo, int codigo) {
        this.categoria = categoria;
        this.cantidadJugadores = cantidadJugadores;
        this.consola = consola;
        this.titulo = titulo;
        this.codigo = codigo;
    }

    // Getter - setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "" +
                "JUEGO: '" + titulo + '\'' +
                ", CONSOLA: '" + consola + '\'' +
                ", JUGADORES: " + cantidadJugadores +
                '.';
    }
}
