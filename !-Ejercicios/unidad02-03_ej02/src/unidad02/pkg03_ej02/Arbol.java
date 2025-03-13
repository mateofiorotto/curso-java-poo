package unidad02.pkg03_ej02;

public class Arbol extends Planta {
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    public Arbol(String climaIdeal, boolean tieneHojas, double altoTallo, String nombre, String tipoHojas, String color, double radioTronco, String tipoTronco, String variedad) {
        super(climaIdeal, tieneHojas, altoTallo, nombre);
        this.tipoHojas = tipoHojas;
        this.color = color;
        this.radioTronco = radioTronco;
        this.tipoTronco = tipoTronco;
        this.variedad = variedad;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public void mensaje() {
        System.out.println("Hola soy un arbol");
    }

}
