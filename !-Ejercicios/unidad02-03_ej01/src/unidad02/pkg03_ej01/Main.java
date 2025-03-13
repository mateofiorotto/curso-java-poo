package unidad02.pkg03_ej01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
         * CONSIGNA
         * 1. Crear una clase Videojuego que tenga los atributos: codigo, titulo, consola, cantidadJugadores, categoria
         *      Tener en cuenta sus metodos getters setters
         * 2. Crear ArrayList tipo videojuego. Crear 5 videojuegos y guardalos en la collection.
         * 3. Recorrer la arraylist creada y mostrar x pantalla el titulo, consola y cantidad de jugadores de los videojuegos
         * 4. Cambiar el nombre y la cantidad de jugadores de dos videojuegos, mostrar x pantalla los datos de los videojuegos
         *     luego del cambio
         * 5. Recorrer la arraylist y mostrar unicamente a los videojuegos de la consola nintendo64
         */
        try {
            
            //2. crear arraylist y 5 videojuegos
            //Primero creamos la arraylist de tipo videojuego
            ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();

            //Luego creamos 5 objetos tipo videojuego y los instanciamos
            Videojuego juego1 = new Videojuego("Shooter", 20, "Playstation 2", "Call of Duty", 1);
            Videojuego juego2 = new Videojuego("Battle Royale", 100, "Playstation 4", "Fortnite", 2);
            Videojuego juego3 = new Videojuego("Deportes con autos", 6, "Playstation 4", "Rocket League", 3);
            Videojuego juego4 = new Videojuego("Carreras", 10, "Playstation 3", "Need For Speed", 4);
            Videojuego juego5 = new Videojuego("Plataformas", 1, "Nintendo 64", "Mario Bros", 5);

            //agregamos a la lista los objetos
            videojuegos.add(juego1);
            videojuegos.add(juego2);
            videojuegos.add(juego3);
            videojuegos.add(juego4);
            videojuegos.add(juego5);

            //3. mostrar la arraylist (foreach)
            System.out.println("LISTA DE VIDEOJUEGOS COMPLETA: ");

            for (Videojuego v : videojuegos) {
                System.out.println(v.toString());
            }
        
            //4. cambiar 2 videojuegos y mostrar los cambios

            //Juego 1
            juego1.setTitulo("Super Mario Bros");
            juego1.setCantidadJugadores(2);
            juego1.setConsola("Nintendo 64");
            juego1.setCategoria("Plataformas");

            //Juego 2
            juego2.setTitulo("Outer Wilds");
            juego2.setCantidadJugadores(1);
            juego2.setConsola("Playstation 4");
            juego2.setCategoria("Aventura Espacial");

            System.out.println();
            System.out.println("JUEGOS CAMBIADOS");

            //volvemos a recorrer la arraylist
            for (Videojuego v : videojuegos) {
                System.out.println(v.toString());
            }

        //5. solo mostrar juegos de la n64
            System.out.println();
            System.out.println("JUEGOS DE LA N64");

            for (Videojuego v : videojuegos) {
                if (v.getConsola().equals("Nintendo 64")) {
                    System.out.println(v.toString());
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
