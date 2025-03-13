package pkg05_generics;

public class Main {

    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Hola");
        String cont = cajaString.obtenerAlgo();
        System.out.println(cont);
        
        System.out.println("");
        
        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(10);
        int cont1 = cajaEnteros.obtenerAlgo();
        System.out.println(cont1);
        
    }
    
}
