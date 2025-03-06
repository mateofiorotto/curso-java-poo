/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_polimorfismo_01;

/**
 *
 * @author mates
 */
public class Perro extends Animal {
    String nombrePerro;
    double peso;
    double raza;
    double sexo;
    
    // constr.. getters, setters..
    
    // pisa el metodo de la clase padre
     @Override
    public void hacerSonido(){
        System.out.println("El perro ladra");
    }
}
