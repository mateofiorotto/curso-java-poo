package unidad02_ej03;

public class Camion extends Vehiculo {

    // constructor de moto
    public Camion(){}

    public Camion(String marca, String modelo, int velocidadMaxima, int combustible) {
        super(marca, modelo, velocidadMaxima, combustible);
    }

    //metodos

    @Override
    public void acelerar() {
        if (combustible <= 0) {
            System.out.println("No tengo combustible");
        } else {
            System.out.println("Soy un camión y acelero");
        }
    }

    @Override
    public void detener() {
        System.out.println("Soy un camión y me detengo");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un camión y freno");
    }

    public void transportarCarga(double kg){
        if (kg <= 400){
            System.out.println("Trasportando carga de " + kg);
        } else {
            System.out.println("Este camion no aguanta mas de 400 kg");
        }
    }
}
