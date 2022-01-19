/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_josuevega;
import java.util.Random;
/**
 *
 * @author jvega
 */
public class Metodos {
    /*
        En la clase Métodos voy haciendo las funciones para el juego.
    */
    
    /* Ambas caras se calculan con un método que devuelve un número aleatorio.*/
    public int tirarDado(){
        Random aleatorio = new Random();
        int cara;
        cara = 1 + aleatorio.nextInt(6);
        //Devuelvo el valor generado del 1 al 6:
        return cara;
    }
}
