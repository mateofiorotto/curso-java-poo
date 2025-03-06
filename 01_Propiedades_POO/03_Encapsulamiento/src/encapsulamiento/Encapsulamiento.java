package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        Alumno alum = new Alumno();
        
        Alumno alum2 = new Alumno(1, "Mateo", "Fiorotto");
    
    
        System.out.println("ID: " + alum2.getId());
    
    }
    
}
