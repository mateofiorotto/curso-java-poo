package unidad02_ej03;

public class Moto extends Vehiculo {

    // constructor de moto
    public Moto(){}

    public Moto(String marca, String modelo, int velocidadMaxima, int combustible) {
        super(marca, modelo, velocidadMaxima, combustible);
    }

    //metodos

    @Override
    public void acelerar() {
        if (combustible <= 0) {
            System.out.println("No tengo combustible");
        } else {
            System.out.println("Soy una moto y acelero");
        }
    }

    @Override
    public void detener() {
        System.out.println("Soy una moto y me detengo");
    }

    @Override
    public void frenar() {
        System.out.println("Soy una moto y freno");
    }
}
