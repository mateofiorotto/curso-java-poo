package pkg02_linkedlists;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //declarar e inicializar lista
        List<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona(1, "Mateo", 21));
        lista.add(new Persona(2, "Lucas", 29));
        lista.add(new Persona(3, "Tobias", 16));
        lista.add(new Persona(4, "Santiago", 31));
        
        //agregar al primero
        lista.addFirst(new Persona(1, "Mateooo", 21));
        lista.removeLast();
        lista.remove(2);

        //foreach
        System.out.println("CON FOREACH");
        for(Persona persona:lista){
            System.out.println(persona.getNombre());
        }

    }
    
}
