package pkg05_maps_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1523, "Mateo");
        mapaEmpleados.put(1524, "Lucas");
        mapaEmpleados.put(1525, "Juan");
        mapaEmpleados.put(1526, "Sere eliminado");
        
        boolean estaElEmpleado = mapaEmpleados.containsValue("Mateo");
        
        System.out.println("containsValue('mateo')");
        if (estaElEmpleado) {
            System.out.println("El valor buscado se encuentra en el Map");
        } else {
            System.out.println("El valor buscado no esta en el Map");
        }
        
        boolean estaLaKey = mapaEmpleados.containsKey(1);
        
        System.out.println("");
        System.out.println("containsKey ('1')");
        if (estaLaKey) {
            System.out.println("La clave buscada se encuentra en el Map");
        } else {
            System.out.println("La clave buscada no esta en el Map");
        }
        
        System.out.println("");
        
        System.out.println("values()");
        System.out.println(mapaEmpleados.values());
        
        System.out.println("");
        
        System.out.println("keySet()");
        System.out.println(mapaEmpleados.keySet());
      
        System.out.println("");
        
        System.out.println("get(1523)");
        String nombre = mapaEmpleados.get(1523);
        
        if (nombre == null) {
            System.out.println("El empleado no existe");
        } else {
            System.out.println("Empleado del registro 1523: " + nombre);
        }
        
        System.out.println("");
        System.out.println("Eliminando un registro..");
        mapaEmpleados.remove(1526);
    }
    
}
