package pkg03_conversiones;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //casteo implicito
        short numCorto = 1;
        System.out.println("numCorto = " + numCorto);
        int numInt = numCorto;
        System.out.println("numeroInt = " + numInt);
        
        System.out.println("");
        
        //casteo explicito
        double numDouble = 1.67;
        System.out.println("num = " + numDouble);
        int numIntExplicito = (int) numDouble;
        System.out.println("numInt = " + numIntExplicito);
        
        System.out.println("");
        
        //wrappers
        String numeroString = "35";
        System.out.println("numeroString = " + numeroString);
        int numeroCasteadoStringAInteger = Integer.parseInt(numeroString);
        System.out.println("numeroCasteadoStringAInteger = " + numeroCasteadoStringAInteger);
        
    }
    
}
