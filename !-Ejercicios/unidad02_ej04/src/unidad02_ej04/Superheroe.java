package unidad02_ej04;

public abstract class Superheroe {
    protected String nombre;
    protected String poder;
    protected int nivelEnergia;

    public Superheroe(){}

    public Superheroe(int nivelEnergia, String poder, String nombre) {
        this.nivelEnergia = nivelEnergia;
        this.poder = poder;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void mostrarDetalles(){
        System.out.println("Soy " + nombre);
        System.out.println("Mi(s) poder(es) es/son: " + poder);
        System.out.println("Mi energia es: " + nivelEnergia);
    }

    public abstract void atacar();
    public abstract void defender();
    public abstract void recuperarEnergia();
}
