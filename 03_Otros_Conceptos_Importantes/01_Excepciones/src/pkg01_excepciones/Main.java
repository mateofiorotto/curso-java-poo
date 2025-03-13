package pkg01_excepciones;

public class Main {

    public static void main(String[] args) {
        int vector[] = new int[5];
        
        //try vector
        try {
                for (int i = 0; i < 6; i++) {
                vector[i] = 1;
                    System.out.print(vector[i] + " ");
                } 
        } catch (Exception e){
            System.out.println("El vector esta fuera de los limites " + e);
        }
        
        //division x 0
        int num = 4;
        try {
            int res = num / 0;
            System.out.println(res);
        } catch (Exception e ){
            System.out.println("No se puede dividir por 0 " + e);
        }
        
        //podemos llamar metodos, redirigir, etc.. no solo Sout
        
    }
    
}
