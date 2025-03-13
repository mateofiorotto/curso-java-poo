package unidad02_ej03;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    protected int combustible;

    public Vehiculo(){}

    public Vehiculo(String marca, String modelo, int velocidadMaxima, int combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void detalles() {
        System.out.println("Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nVelocidad máxima: " + getVelocidadMaxima() +
                "\nCombustible: " + getCombustible());
    }

    protected abstract void acelerar();
    protected abstract void frenar();
    protected abstract void detener();
}
