package logica;

public class EmpleadoTiempoCompleto extends Empleado {
    protected double salarioFijo;

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double sueldo() {
        return salarioFijo;
    }
}
