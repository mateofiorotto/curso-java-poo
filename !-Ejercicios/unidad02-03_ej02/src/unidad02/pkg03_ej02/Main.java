package unidad02.pkg03_ej02;


public class Main {
    public static void main(String[] args) {
        /*
        * CONSIGNA:
        * Crear una clase Planta con los atributos: nombre, alto del tallo, tieneHojas, climaIdeal. Con sus métodos y constructores correspondientes.
        *
        * 1. Crear clases hijas que compartan atributos y metodos
        *   - Arbol: variedad, tipoTronco, radioTronco, color, tipoHojas
        *   - Flor: colorPetalos, cantidadPromedioPetalos, colorPistilo, colorPetalos, variedadFlor, estacionFlorecimiento
        *   - Arbusto: anchoArbusto, esDomestico, variedadArbusto, colorHojas, sePodaONo
        *
        * 2. Una vez creadas, crear los siguientes metodos:
        *   - Arbol: mostrar "Hola soy un arbol"
        *   - Flor: mostrar "Hola soy una flor"
        *   - Arbusto: mostrar "Hola soy un arbusto"
        *
        * 3. crear en el Main un objeto de cada clase Hija, llamar a los 3 metodos desde cada objeto
        *
        * 4. cambiar el mod. de acceso de los metodos de public a private. Intentar acceder a estos metodos.
        * RTA .4: Basicamente no se puede ya que es solo accesible dentro de la misma
        * clase, si fuera protected si deja por que estamos en el mismo package. Si
        * es public deja desde cualquier lado.
        * */

        //3. crear en el main objetos de las clases hijas y llamar a los 3 metodos
        try {

            // OBJETO: ARBOL - PINO
            Arbol arbol = new Arbol(
                    "Calido",   // climaIdeal
                    true,       // tieneHojas
                    10.0,       // altoTallo
                    "Arbol de Pino",     // nombre
                    "Pino",     // tipoHojas
                    "Verde",    // color
                    1.0,        // radioTronco
                    "Pino",     // tipoTronco
                    "Pino"      // variedad
            );



            // OBJETO: FLOR - AMAPOLA|
            Flor flor = new Flor(
                    "Calido",                // climaIdeal
                    false,                   // tieneHojas
                    2.0,                     // altoTallo
                    "Flor de Amapola",               // nombre
                    "Primavera",             // estacionFlorecimiento
                    "Amapola",               // variedadFlor
                    "Amarillo",              // colorPistilo
                    5,                       // cantidadPromedioPetalos
                    "Rojo"                   // colorPetalos
            );


            // OBJETO: ARBUSTO - ARBUSTO de BAYAS
            Arbusto arbusto = new Arbusto(
                    "Calido",      // climaIdeal
                    true,         // tieneHojas
                    5.0,         // altoTallo
                    "Arbusto de Bayas",    // nombre
                    true,         // sePodaONo
                    "Verde",      // colorHojas
                    "Bayas",      // variedadArbusto
                    false,        // esDomestico
                    3.5          // anchoArbusto
            );

            //no hacia falta pasar parametros, no lo pedia el ejercicio

            arbol.mensaje();
            flor.mensaje();
            arbusto.mensaje();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
