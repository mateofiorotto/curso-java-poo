package unidad01_ej03;

public class Vehiculo {
    //atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    
    //constructor vacio
    public Vehiculo(){
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.anio = 0;
        this.precio = 0.0;
    }

    //constructor con parametros
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    //GETTERS - SETTERS
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //METODOS
    public void calcularDescuento(double porcentaje){
        System.out.println("El precio original es: " + this.precio);
        System.out.println("El precio con descuento es: " + (this.precio - (this.precio * porcentaje)));
        System.out.println("El descuento fue de: " + (this.precio * porcentaje));
    }
   
    
    public void mostrarDetalles() {
        System.out.println("🚗 Vehículo Detalles 🚗");
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Año: " + this.anio);
    System.out.println("Precio: $" + this.precio);
    System.out.println("--------------------------");
        
    }
    
    
    
}
