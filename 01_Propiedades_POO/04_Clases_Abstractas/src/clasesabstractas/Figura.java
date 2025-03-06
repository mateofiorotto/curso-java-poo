package clasesabstractas;

public abstract class Figura {
    
    protected double x; //posX
    protected double y; //posY
    
    //Se pueden hacer constructores pero solo seran usadas en sus clases hijas. Su modificador de acceso sera protected

    protected Figura() {
    }
    
    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
   public abstract double calcularArea();
}
