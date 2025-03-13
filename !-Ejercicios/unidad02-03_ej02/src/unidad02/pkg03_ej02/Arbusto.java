package unidad02.pkg03_ej02;

public class Arbusto extends Planta {
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto(String climaIdeal, boolean tieneHojas, double altoTallo, String nombre, boolean sePodaONo, String colorHojas, String variedadArbusto, boolean esDomestico, double anchoArbusto) {
        super(climaIdeal, tieneHojas, altoTallo, nombre);
        this.sePodaONo = sePodaONo;
        this.colorHojas = colorHojas;
        this.variedadArbusto = variedadArbusto;
        this.esDomestico = esDomestico;
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    @Override
    public void mensaje() {
        System.out.println("Hola soy un arbusto");
    }
}
