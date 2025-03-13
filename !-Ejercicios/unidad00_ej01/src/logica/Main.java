
package logica;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        /*
        Ejercicio: Gestión de Empleados en una Empresa
        Requisitos:
        Crea una clase llamada Empleado con las siguientes propiedades:

        id (int)
        nombre (String)
        puesto (String)
        salario (double)
        
        Implementa un constructor vacío para la clase Empleado, que inicialice los valores de las propiedades a sus
        valores predeterminados (por ejemplo, 0 para id, null para nombre, etc.).

        Implementa un constructor con parámetros para la clase Empleado, que permita inicializar todas
        las propiedades con valores específicos al crear el objeto.

        Crea los getters y setters para cada propiedad (id, nombre, puesto, salario).

        Implementa un método en la clase Empleado llamado calcularAumento que reciba como parámetro
                         un porcentaje de aumento (double) y calcule el nuevo salario del empleado.
                         Este método debe imprimir el salario actual y el nuevo salario después del aumento.

        Implementa un método en la clase Empleado llamado mostrarDetalles que imprima el nombre, el puesto y el salario del empleado.

        Crea una clase Main donde:

        Crea al menos dos objetos Empleado: uno usando el constructor vacío y otro usando el constructor con parámetros.
        Usa el método mostrarDetalles para mostrar la información de los empleados.
                Usa el método calcularAumento para aumentar el salario de al menos un empleado y muestra el nuevo salario.
         */
        
        //Creamos un objeto empleado y le pasamos los valores en orden
        Empleado empleado1 = new Empleado(1, "Mateo", "Programador con Java", 300.5);
        
        //Mostramos los detalles
        System.out.println("Empleado 1: ");
        empleado1.mostrarDetalles();
        
        //Modificamos y mostramos su salario con el aumento pasado x parametros
       empleado1.setSalario(empleado1.calcularAumento(0.10));
        System.out.println("El salario aumentado del empleado 1 es: " + empleado1.getSalario());
       
        // Creamos un empleado vacio
        System.out.println("");
       Empleado empleado2 = new Empleado();
        System.out.println("Empleado 2: ");
       empleado2.mostrarDetalles(); //retorna null, por lo que podemos asignarle valores:
       
       //Le otorgamos valores a sus atributos
       empleado2.setId(2);
       empleado2.setNombre("Lucas");
       empleado2.setPuesto("Diseñador");
       empleado2.setSalario(130.5);
       
       //mostramos el empleado2
        System.out.println("");
        System.out.println("Empleado 2 modificado: ");
       empleado2.mostrarDetalles();
     
       
    }
    
}
