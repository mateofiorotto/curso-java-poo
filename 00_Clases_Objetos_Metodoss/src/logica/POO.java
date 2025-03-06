package logica;

public class POO {
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(1, "Mateo", "Desconocido");

        //obtener con get
        //o hacer un
        //String nombre = alumno2.getNombre();
        System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());

        //modificacion con set
        alumno2.setApellido("Fiorotto");

        System.out.println("Ahora conocemos su apellido, es: " + alumno2.getApellido());

        //CARGAR CON  SET a un objeto vacio
        alumno1.setId(1);
        alumno1.setNombre("Tobias");
        alumno1.setApellido("Martinez");

        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El alumno 1 se llama: " + alumno1.getNombre() + " " + alumno1.getApellido());
    }
    
}
