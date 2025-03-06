package unidad02_ej04;

public class Superman extends Superheroe implements ISuperFuerza, ISuperVelocidad, IVolar {

    public Superman(){}

    public Superman(int nivelEnergia, String poder, String nombre) {
        super(nivelEnergia, poder, nombre);
    }

    @Override
    public void recuperarEnergia() {
        if(this.nivelEnergia >= 100) {
            System.out.println("Ya tengo la energia al maximo");
        } else {
            System.out.println("Soy Superman y recupero mi energia");
            this.nivelEnergia = 100;
        }
    }

    @Override
    public void defender() {
        System.out.println("Soy Superman y me defiendo");
    }

    @Override
    public void atacar() {
        if (this.nivelEnergia < 1) {
            System.out.println("No puedo atacar, debo recargar energia");
        } else {
            System.out.println("Soy Superman y ataco");
        }
    }

    @Override
    public void volar() {
        System.out.println("Soy Superman y puedo volar");
    }

    @Override
    public void superVelocidad() {
        System.out.println("Soy Superman y tengo super velocidad");
    }

    @Override
    public void superFuerza() {
        System.out.println("Soy Superman y tengo super fuerza");
    }
}
