package unidad02_ej03;

public class Auto extends Vehiculo {

    public Auto(){}

    public Auto(String marca, String modelo, int velocidadMaxima, int combustible) {
        super(marca, modelo, velocidadMaxima, combustible);
    }

    //metodos

    @Override
    public void acelerar() {
        if (combustible <= 0) {
            System.out.println("No tengo combustible");
        } else {
            System.out.println("Soy un auto y acelero");
        }
    }

    @Override
    public void detener() {
        System.out.println("Soy un auto y me detengo");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un auto y freno");
    }

    public void cargarPasajeros(int numPasajeros){
        if (numPasajeros <= 4) {
            System.out.println("Entraron " + numPasajeros);
        } else {
            System.out.println("No pueden entrar mas de 4 pasajeros");
        }
    }
}
