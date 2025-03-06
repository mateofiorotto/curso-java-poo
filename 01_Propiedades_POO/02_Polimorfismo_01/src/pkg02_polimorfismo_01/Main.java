package pkg02_polimorfismo_01;

public class Main {
    public static void main(String[] args) {
       Perro perro1 = new Perro();
        
       perro1.hacerSonido();
       
       Animal animalGenerico = new Animal();
       
       animalGenerico.hacerSonido();
    }
 }
  
