package petrerkingdead;

import java.util.Scanner;

/**
 *
 * @author Santiago Naqranjo Marcillo
 */
public class Partida {

    private static final int PUNTO = 1;
    private static final int VIDAS = 3;

    public static void imprimirEstadoPartida(int[][] escenario, int[] posicionSuperviviente, int[][] posicionZombie) {
        for (int i = 0; i < escenario.length; i++) {
            for (int j = 0; j < escenario[i].length; j++) {
                if (i == posicionSuperviviente[0]
                        && j == posicionSuperviviente[1]) {
                    System.out.print("s");
                } else if (i == posicionZombie[0][0]
                        && j == posicionZombie[0][1]
                        || i == posicionZombie[1][0]
                        && j == posicionZombie[1][1]
                        || i == posicionZombie[2][0]
                        && j == posicionZombie[2][1]) {
                    System.out.print("z");
                } else {
                    System.out.print(Casillas.casillaATexto(escenario, i, j));
                }
            }
            System.out.println("");
        }
        System.out.println("PUNTOS: " + puntuacionSuperviente(escenario, posicionSuperviviente));
        System.out.println("VIDAS: " + VIDAS);
    }

    
    public static int puntuacionSuperviente(int[][] escenario, int[] posicionSuperviviente){
        if(Casillas.hayItem(escenario, posicionSuperviviente[0], posicionSuperviviente[1]))
            return + PUNTO;
        else
            return + 0;
    }
    
    public static int numeroVidas(int[] posicionSuperviviente, int[][] posicionZombie){
        if(posicionSuperviviente[0] ==  posicionZombie[0][0] 
                && posicionSuperviviente[1] ==  posicionZombie[0][1]
                && posicionSuperviviente[0] ==  posicionZombie[1][0]
                && posicionSuperviviente[1] ==  posicionZombie[1][1]
                && posicionSuperviviente[0] ==  posicionZombie[2][0]
                && posicionSuperviviente[1] ==  posicionZombie[2][1])
            return VIDAS - 1;
        else
            return + 0;
    }
    
    public static void mueveATodosPersonajes(int[][] posicionZombies, int[] posicionSuperviviente, String respuesta, int[][] escenario){
        Superviviente.mueveSuperviviente(posicionSuperviviente, respuesta, escenario);
        Zombies.mueveATodosLosZombies(posicionZombies, escenario, posicionSuperviviente);
    }
    
}
