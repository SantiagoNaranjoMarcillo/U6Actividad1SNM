package petrerkingdead;

import java.util.Scanner;

/**
 *
 * @author Santiago Naqranjo Marcillo
 */
public class Partida {

    private static final int PUNTO = 1;

    public static void imprimirEstadoPartida(int[][] escenario, int[] posicionSuperviviente, int[][] posicionZombie, int PUNTUACION, int VIDAS) {
        for (int i = 0; i < escenario.length; i++) {
            for (int j = 0; j < escenario[i].length; j++) {
                if (i == posicionSuperviviente[0]
                        && j == posicionSuperviviente[1]) 
                    System.out.print("\u001b[36;1ms\u001b[0m");
                 else if (i == posicionZombie[0][0]
                        && j == posicionZombie[0][1]) 
                    System.out.print("\u001b[31mz\u001b[0m");
                 else if(i == posicionZombie[1][0]
                        && j == posicionZombie[1][1])
                    System.out.print("\u001b[32;1mz\u001b[0m");
                else if(i == posicionZombie[2][0]
                        && j == posicionZombie[2][1])
                System.out.print("\u001b[35;1mz\u001b[0m");
                else 
                    System.out.print(Casillas.casillaATexto(escenario, i, j));
            }
            System.out.println("");
        }
        System.out.println("PUNTOS: " + PUNTUACION);
        System.out.println("VIDAS: " + VIDAS);
    }
    
    public static String pedirMovimientoCorrecto() {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nIntroduce el movimiento (W/A/S/D) o h para salir: ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("W") 
                    || respuesta.equalsIgnoreCase("S") 
                    || respuesta.equalsIgnoreCase("D") 
                    || respuesta.equalsIgnoreCase("A")
                    || respuesta.equalsIgnoreCase("H"))
                return respuesta;
            else
                System.out.println("Introduce un movimiento correcto.");
        } while (true);
    }

    
    public static int puntuacionSuperviente(int[][] escenario, int[] posicionSuperviviente){
        if(!Casillas.hayItem(escenario, posicionSuperviviente[0], posicionSuperviviente[1])){
            Casillas.vaciaCasilla(escenario, posicionSuperviviente[0], posicionSuperviviente[1]);
            return PUNTO;
        }else
            return 0;
    }
    
    public static int numeroVidas(int[] posicionSuperviviente, int[][] posicionZombie){
        if(posicionSuperviviente[0] ==  posicionZombie[0][0] 
                && posicionSuperviviente[1] ==  posicionZombie[0][1]
                || posicionSuperviviente[0] ==  posicionZombie[1][0]
                && posicionSuperviviente[1] ==  posicionZombie[1][1]
                || posicionSuperviviente[0] ==  posicionZombie[2][0]
                && posicionSuperviviente[1] ==  posicionZombie[2][1])
            return 1;
        else
            return 0;
    }
    
    public static void mueveATodosPersonajes(int[][] posicionZombies, int[] posicionSuperviviente, String respuesta, int[][] escenario){
        Superviviente.mueveSuperviviente(posicionSuperviviente, respuesta, escenario);
        Zombies.mueveATodosLosZombies(posicionZombies, escenario, posicionSuperviviente);
    }
    
    public static boolean partidaGanada(int PUNTUACION){
        if(PUNTUACION == 85){
            System.out.println("\n!Enhorabuena. Has ganado¡");
            return true;
        }else
            return false;
        
    }
    
    public static boolean partidaPerdida(int VIDAS){
        if(VIDAS == 0){
            System.out.println("\nGAME OVER");
            return true;
        }else
            return false;
    }
}
