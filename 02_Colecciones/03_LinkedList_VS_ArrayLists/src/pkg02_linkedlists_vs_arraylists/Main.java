package pkg02_linkedlists_vs_arraylists;

import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> listaArray = new ArrayList<Persona>();

        listaArray.add(new Persona(1, "Mateo", 21));
        listaArray.add(new Persona(2, "Lucas", 29));
        listaArray.add(new Persona(3, "Tobias", 16));
        listaArray.add(new Persona(4, "Santiago", 31));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();

        listaLinked.add(new Persona(1, "Mateo", 21));
        listaLinked.add(new Persona(2, "Lucas", 29));
        listaLinked.add(new Persona(3, "Tobias", 16));
        listaLinked.add(new Persona(4, "Santiago", 31));

        //remover indice 1 (nombre = lucas)
        listaArray.remove(1);
        
        //remover persona con el nombre tobias
        String nombreBorrar = "Tobias";
        for (Persona persona:listaLinked){
            if (persona.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona);
                break; //cortar para dejar de recorrer, cuando remuevo la persona se rompe el ciclo para que se vuelva a regenerar la lista
            }
        }
        
        System.out.println("LUEGO DE ELIMINAR");
        System.out.println("----ARRAYLIST----");
        
        for (Persona persona:listaArray){ 
            System.out.println(persona.getNombre());
        }
        
        System.out.println("----LINKEDLIST----");
        for (Persona persona:listaLinked){ 
            System.out.println(persona.getNombre());
        }
        
       
        
        //METODOS ADICIONALES
        System.out.println("nombreBorrar = " + nombreBorrar);
        System.out.println("METODOS ADICIONALES");
        
        System.out.println("-----------TAMAÑO-----------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        System.out.println("");
        System.out.println("-----------LINKEDLISTS: PRIMER Y ULTIMO OBJETO-----------");
        System.out.println("Primero: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo: " + listaLinked.getLast().toString());
        
        System.out.println("");
        System.out.println("-----------VACIANDO LISTAS...-----------");
        listaArray.clear();
        listaLinked.clear();
        
        System.out.println("");
        System.out.println("-----------ALGUNA LISTA ESTA VACIA?-----------");
        System.out.println("Arraylist: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
    }
    
}
