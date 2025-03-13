package pkg04_pilas;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //clase integer, pero similar al tipo primitivo
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("lista vacia: " + pila);
        System.out.println("lista vacia: " + pila.isEmpty());
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //recorrer
        System.out.println("Recorrido: ");
        for (Integer pilaChica: pila){
            System.out.println(pilaChica);
        }
        
        System.out.println("");
        
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("lista vacia: " + pila.isEmpty());
        
        //eliminamos el ultimo
        //search cuenta al reves, desde la parte superior
        System.out.println("Esta el tercer elemento?: " + pila.search(5)); //numero positivo si lo encuentra, numero negativo si no, solo funciona si es algo exacto
        pila.pop();
        System.out.println("Ultimo agregado: " + pila.peek()); //ultimo elemento sin eliminar
        
    }
    
}
