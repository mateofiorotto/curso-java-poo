package logica;

public class Alumno {
        
        // Crear la clase con la primera letra en Mayuscula y en singular. Si tiene mas palabras TodoConMayuscula
        // Los atributos deben comenzar  con minuscula, si tiene mas palabras usar camelCase
        
        // Abstraemos info de la vida real y moldeamos a la clase alumno
        int id;
        String nombre;
        String apellido;
        
        //CONSTRUCTOR (vacio)
        public Alumno(){
            
        }
        
        //CONSTRUCTOR (parametros)

        public Alumno(int id, String nombre, String apellido) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
        }
        
        //getters, setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
        
        //METODOS
        
        //ESTRUCTURA: modificador de acceso (publico), tipo de dato (si no devuelve es void)
        public void mostrarNombre() {
            System.out.println("Hola, soy un alumno y se decir mi nombre");
        }
        
        public void saberCondicionAlumno (double calificacion) {
            if (calificacion >= 6) {
                System.out.println("El alumno aprobó");
            } else {
                System.out.println("El alumno no aprobó");
            }
        }
}
