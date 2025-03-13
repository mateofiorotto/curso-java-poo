package unidad01_ej03;

public class Main {
    
/*
    Ejercicio: Gestión de Vehículos

    Requisitos:
    
    1. Crear una clase llamada Vehiculo con las siguientes propiedades privadas:
        - marca (String)
        - modelo (String)
        - anio (int)
        - precio (double)

    2. Implementar:
        - Un constructor vacío que inicialice los valores por defecto (ejemplo: "" para marca, 0 para anio, etc.).
        - Un constructor con parámetros para inicializar todas las propiedades.
        - Getters y setters para cada propiedad.
        - Un método calcularDescuento(double porcentaje) que calcule el precio final 
          después de aplicar un descuento. Debe imprimir el precio original y el nuevo precio.
        - Un método mostrarDetalles() que imprima los datos del vehículo.

    3. En la clase Main:
        - Crear al menos dos objetos de la clase Vehiculo:
            - Uno usando el constructor vacío.
            - Otro usando el constructor con parámetros.
        - Usar el método mostrarDetalles() para mostrar la información de los vehículos.
        - Usar el método calcularDescuento() para reducir el precio de al menos un vehículo 
          y mostrar el nuevo precio.
*/

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Ford", "Fiesta", 2009, 4500);
        Vehiculo v2 = new Vehiculo();
        
        System.out.println("Detalles Vehiculo uno: ");
        v1.mostrarDetalles();
        v1.calcularDescuento(0.10);
        
        System.out.println("");
        
        System.out.println("Detalles Vehiculo dos: ");
        v2.mostrarDetalles();
        v2.calcularDescuento(0.10);
    }
    
}
