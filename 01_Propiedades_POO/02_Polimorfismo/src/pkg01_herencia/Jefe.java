package pkg01_herencia;

public class Jefe extends Persona {
    
    int id_jefe;
    String departament_boss;
    
    public Jefe() {
        
    }

    public Jefe(int id_jefe, String departament_boss, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departament_boss = departament_boss;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartament_boss() {
        return departament_boss;
    }

    public void setDepartament_boss(String departament_boss) {
        this.departament_boss = departament_boss;
    }

    
}
