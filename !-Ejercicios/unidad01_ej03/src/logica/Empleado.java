package logica;

public abstract class Empleado {

    //atributos
    protected String nombre;
    protected int edad;

    //constructores
    protected Empleado(){}

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    public abstract double sueldo();

}
