package unidad02_ej01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
//        Ejercicio 1: ArrayList - Gestión de Productos
//📌 Crea un programa para gestionar productos en una tienda usando un ArrayList.
//
//Crea una clase Producto con atributos nombre, precio y stock.
//Usa un ArrayList<Producto> para almacenar varios productos.
//Agrega métodos para:
//Agregar productos.
//Mostrar todos los productos.
//Buscar un producto por nombre.

        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        //Agregar productos
        productos.add(new Producto("PC",100,2));
        productos.add(new Producto("TV",300,1));
        productos.add(new Producto("Celular",50,3));
        
        for (Producto p : productos) {
            System.out.println(p.toString());
        }
        
        //Buscar prod.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de producto a buscar: ");
        String productoBuscado = scanner.nextLine();
        
        int cont = 0;
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(productoBuscado)) {
                 System.out.println(p.toString());
                 cont++;
            }
        }
        
        if (cont < 1) {
            System.out.println("Producto no encontrado");
        }
        
        
    }
    
}
