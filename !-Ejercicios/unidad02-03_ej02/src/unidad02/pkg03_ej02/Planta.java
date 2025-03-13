package unidad02.pkg03_ej02;

public abstract class Planta {
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta(){}

    public Planta(String climaIdeal, boolean tieneHojas, double altoTallo, String nombre) {
        this.climaIdeal = climaIdeal;
        this.tieneHojas = tieneHojas;
        this.altoTallo = altoTallo;
        this.nombre = nombre;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    public abstract void mensaje();
}
