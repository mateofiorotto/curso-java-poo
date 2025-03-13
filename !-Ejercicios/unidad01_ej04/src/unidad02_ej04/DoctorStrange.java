package unidad02_ej04;

public class DoctorStrange extends Superheroe implements IVolar{

    public DoctorStrange(){}

    public DoctorStrange(int nivelEnergia, String poder, String nombre) {
        super(nivelEnergia, poder, nombre);
    }

    @Override
    public void recuperarEnergia() {
        if(this.nivelEnergia >= 100) {
            System.out.println("Ya tengo la energia al maximo");
        } else {
            System.out.println("Soy Dr. Strange y recupero mi energia");
            this.nivelEnergia = 100;
        }
    }

    @Override
    public void defender() {
        System.out.println("Soy Dr. Strange y me defiendo");
    }

    @Override
    public void atacar() {
        if (this.nivelEnergia < 1) {
            System.out.println("No puedo atacar, debo recargar energia");
        } else {
            System.out.println("Soy Dr. Strange y ataco");
        }
    }

    @Override
    public void volar() {
        System.out.println("Soy Dr. Strange y puedo volar");
    }
}
