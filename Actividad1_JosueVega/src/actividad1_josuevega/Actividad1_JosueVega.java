/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1_josuevega;
import java.util.Random;

/**
 *
 * @author jvega
 */
public class Actividad1_JosueVega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables e instancias
        Metodos metodos = new Metodos();
        int dado1, dado2, suma, punto;
        
        System.out.println("Juego de Dados.\n");
        //Invoco el método:
        dado1 = metodos.tirarDado();
        dado2 = metodos.tirarDado();
        suma = dado1+dado2;
        System.out.println("Primer Dado: "+dado1);
        System.out.println("Segundo Dado: "+dado2);
        
        //Utilizo un switch para evaluar la suma:
        switch(suma){
            case 7: case 11:
                System.out.println("¡Has ganado! Tu puntaje es "+suma+".");
                break;
            case 2: case 3: case 12:
                System.out.println("¡Craps! Has perdido... Tu puntaje es "+suma+".");
                break;
            case 4: case 5: case 6: case 8: case 9: case 10:                
                System.out.println("Tu puntaje es "+suma+".");
                System.out.println("Otro intento...\n");
                //tiramos los dados de nuevo
                dado1 = metodos.tirarDado();
                dado2 = metodos.tirarDado();
                suma = dado1+dado2;
                punto = suma;
                
                System.out.println("Primer Dado: "+dado1);
                System.out.println("Segundo Dado: "+dado2);
                System.out.println("Punto: "+punto);
                System.out.println("\n Se tiran de nuevo los dados hasta igualar el punto.");
                //tiramos los dados de nuevo
                dado1 = metodos.tirarDado();
                dado2 = metodos.tirarDado();
                suma = dado1+dado2;
                
                //Hago un while para que ejecute el código siempre y cuando la suma sea distinta del punto.
                while(suma != punto){
                    System.out.println("Primer Dado: "+dado1);
                    System.out.println("Segundo Dado: "+dado2);
                    System.out.println("Punto: "+punto);
                    System.out.println("Suma: "+suma);
                    System.out.println("\n Se tiran de nuevo los dados hasta igualar el punto.");
                    
                    //tiramos los dados de nuevo
                    dado1 = metodos.tirarDado();
                    dado2 = metodos.tirarDado();
                    suma = dado1+dado2;
                }             
                
                //Si la suma es igual al punto sale del While:
                System.out.println("Primer Dado: "+dado1);
                System.out.println("Segundo Dado: "+dado2);
                System.out.println("Punto: "+punto);
                System.out.println("Suma: "+suma);
                System.out.println("\n ¡Has ganado! La suma es igual al punto.");
        }
    }
    
}
