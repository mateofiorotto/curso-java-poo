package pkg05_interfaces;

public class Main {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        
        circulo1.rotar();
        circulo1.dibujar();
        System.out.println("Area circulo: " + circulo1.calcularArea());
        
        System.out.println("");
        
        Cuadrado cuadrado1 = new Cuadrado(10);
        cuadrado1.dibujar();
        System.out.println("Area cuadrado: " + cuadrado1.calcularArea());
    }
    
}
