package clasesabstractas;

public class Circulo extends Figura {
    
    private double radio;
    
    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
     @Override
    public double calcularArea(){
        double resultado = (3.14 * (radio * radio));
        return resultado;
    }
    
}
