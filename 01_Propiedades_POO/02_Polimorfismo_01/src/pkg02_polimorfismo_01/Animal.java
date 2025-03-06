package pkg02_polimorfismo_01;

public class Animal {
    int id_animal;
    String descripcion;
    
    // Suponemos que aca estan los constructores, getters, setters y metodos...
    
    //otros (sobrecarga y sobreescritura)
    
    // En este caso es sobrecarga, ya que estamos en la misma clase poniendo varias veces el mismo nombre de metodo, pero 
    // le pasamos distintos parametrros y mensajes. Cuando querramos usar uno u otro se usara segun los parametros que pasemos.
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido (String nombreAnimal){
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    
     public void hacerSonido (String nombreAnimal, String tipoSonido){
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
    
    
}

