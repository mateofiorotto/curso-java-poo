package pkg04_enums;

public class Main {
    
     enum DiaSemana {
            LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }
     
     enum Color {
         AZUL, NEGRO, BLANCO, ROJO
     }

    public static void main(String[] args) {
        // TODO code application logic here
       
        Color color = Color.ROJO;
        
        System.out.println(color);
        
        //recorrer
        for (Color c : Color.values()) {
            System.out.println(c);
        }
        
    }
    
}
