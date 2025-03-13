
package pkg02_relacion_clases;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    
    //relacion 1 a 1
    private Propietario propietario; //1 a 1, va del lado donde convenga, 1 auto tiene un propietario

    public Auto() {}
    
    public Auto(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
