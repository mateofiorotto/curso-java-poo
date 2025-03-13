package unidad02.pkg03_ej02;

public class Flor extends Planta {
    private String colorPetalos;
    private int cantidadPromedioPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorecimiento;

    public Flor(String climaIdeal, boolean tieneHojas, double altoTallo, String nombre, String estacionFlorecimiento, String variedadFlor, String colorPistilo, int cantidadPromedioPetalos, String colorPetalos) {
        super(climaIdeal, tieneHojas, altoTallo, nombre);
        this.estacionFlorecimiento = estacionFlorecimiento;
        this.variedadFlor = variedadFlor;
        this.colorPistilo = colorPistilo;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPetalos = colorPetalos;
    }

    public String getEstacionFlorecimiento() {
        return estacionFlorecimiento;
    }

    public void setEstacionFlorecimiento(String estacionFlorecimiento) {
        this.estacionFlorecimiento = estacionFlorecimiento;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public int getCantidadPromedioPetalos() {
        return cantidadPromedioPetalos;
    }

    public void setCantidadPromedioPetalos(int cantidadPromedioPetalos) {
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    @Override
    public void mensaje() {
        System.out.println("Hola soy una flor");
    }
}
