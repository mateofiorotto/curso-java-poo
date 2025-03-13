package pkg02_relacion_clases;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //acceder a la lista de propietarios de un auto
        
        //1. Crear objeto auto
        Auto auto = new Auto(1L, "BMW", "No se");
        
        //Crear lista de propietarios vacio
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        //Crear propietarios
        Propietario prop1 = new Propietario(1L, "Mateo", "Fiorotto");
        Propietario prop2 = new Propietario(2L, "Franco", "Rodriguez");
        
        //agregamos a la lista los dos propietarios
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
       // asignamos la lista de propietarios al auto
        auto.setListaPropietarios(listaPropietarios);
        
        //mostrar
        System.out.println("El auto " + auto.getMarca() + " - " + auto.getModelo() + " Tiene como propietarios a: " +
                auto.getListaPropietarios().toString());
    }
    
}
