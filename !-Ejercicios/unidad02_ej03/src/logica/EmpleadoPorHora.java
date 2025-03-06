package logica;

public class EmpleadoPorHora extends Empleado {
    protected double tarifaPorHora;
    protected double horasTrabajadas;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(String nombre, int edad, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double sueldo() {
        double sueldoFinal = tarifaPorHora * horasTrabajadas;
        return sueldoFinal;
    }
}
