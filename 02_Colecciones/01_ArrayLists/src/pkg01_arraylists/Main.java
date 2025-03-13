package pkg01_arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //declarar e inicializar lista
        List<Persona> lista = new ArrayList<Persona>();
//        Persona perso = new Persona(1, "Mateo", 21);
//        lista.add(perso);
        //ahorrar lineas de codigo:
        //agregar personas
        lista.add(new Persona(1, "Mateo", 21));
        lista.add(new Persona(2, "Lucas", 29));
        lista.add(new Persona(3, "Tobias", 16));
        lista.add(new Persona(4, "Santiago", 31));

        //recorrer listas. Podemos usar for y for each.
        //size y no length ya que no es longitud sino tamaño ya que es dinamico
        System.out.println("CON FOR ");
        for (int i = 0; i < lista.size() ; i++) {
            System.out.println(lista.get(i).getNombre());
        }

        System.out.println();
        //foreach
        System.out.println("CON FOREACH");
        for(Persona persona:lista){
            System.out.println(persona.getNombre());
        }

    }
    
}
